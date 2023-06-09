package org.project.dao;

import org.project.dto.CustomerModifyDTO;
import org.project.dto.EvaluateSuccessDTO;
import org.project.dto.JoinDTO;
import org.project.dto.LoginDTO;
import org.project.vo.CustomerVO;
import org.project.vo.PagingVO;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface CustomerDAO {
    //회원정보 전부 받아오기
    public List<CustomerVO> listCustomer();
    //로그인
    public CustomerVO login(LoginDTO dto) throws Exception;

    public void keepLogin(Map<String,Object> map);
    public CustomerVO checkUserWithSessionKey(String value);

    public String findUserId(HttpServletResponse response, String userEmail);
    public CustomerVO checkId(String userID) throws Exception;


    public CustomerVO readCustomer(String userID) throws Exception;

    public String updatePwd(CustomerVO vo) throws Exception;

    //회원가입
//    public void create(CustomerVO vo) throws Exception;

    //회원번호로 회원한명가져오기
    public CustomerVO read(Integer userNo);

    //    //회원정보수정
    public void update(CustomerModifyDTO dto) throws Exception;
    //
//    //회원탈퇴
    public void delete(Integer userNo) throws Exception;

    public void modUserStatus(Integer userNo) throws Exception;

    //회원가입
    public void create(JoinDTO dto) throws Exception;

    public int countCustomer() throws Exception;

    public List<CustomerVO> selectCustomer(PagingVO vo) throws Exception;

    //회원가입 - 중복확인
    public int idCheck(String userID) throws Exception;

    public int countCustomerByKeyword(Map<String,Object> paramMap) throws Exception;

    public List<CustomerVO> selectCustomerByKeyword(PagingVO vo) throws Exception;

}

