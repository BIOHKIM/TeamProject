package org.project.dao;

import org.apache.ibatis.session.SqlSession;
import org.project.dto.BoardWriteDTO;
import org.project.vo.BoardVO;
import org.project.vo.PagingVO;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{

    @Inject
    private SqlSession session;

    private static String namespace ="org.project.dao.BoardDAO";

    //@Override
    //public List<BoardVO> qnaList() {return null;}

    // 글 쓰기
    @Override
    public void write(BoardWriteDTO dto) {
        session.insert(namespace+".write", dto);
    }

    @Override
    public int countBoard() {

        return session.selectOne(namespace+".countBoard");
    }

    @Override
    public List<BoardVO> selectBoard(PagingVO vo) {

        return session.selectList(namespace + ".selectBoard", vo);
    }

//    @Override
//    public BoardVO detail(Integer QANo) {
//
//        return session.selectOne(namespace + ".detail", QANo);
//    }

    @Override
    public void boardCnt(Integer QANo) {
        session.update(namespace + ".boardCnt", QANo);
    }

    @Override
    public BoardVO read(Integer QANo) {
        return session.selectOne(namespace + ".read", QANo);
    }


    // 글 삭데
    @Override
    public void delete(Integer QANo) throws Exception{
        session.delete(namespace+".delete", QANo);
    }

    // 글 수정
    @Override
    public void update(BoardWriteDTO dto) throws Exception {
        session.update(namespace+".update", dto);
    }



}