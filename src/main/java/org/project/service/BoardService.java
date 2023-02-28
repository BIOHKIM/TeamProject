package org.project.service;

import org.project.dto.BoardWriteDTO;
import org.project.searchandpaging.Criteria;
import org.project.vo.BoardVO;
import org.project.vo.PagingVO;

import java.util.List;

public interface BoardService {
    //List<BoardVO> qnaList() throws Exception;

    //�� �ۼ�
    public void write(BoardWriteDTO dto) throws Exception;

    // �Խù� �� ����
    public int countBoard();

    // ����¡ ó�� �Խñ� ��ȸ
    public List<BoardVO> selectBoard(PagingVO vo);
}