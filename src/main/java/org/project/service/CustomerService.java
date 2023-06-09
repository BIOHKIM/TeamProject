package org.project.service;

import org.project.dto.CustomerModifyDTO;
import org.project.dto.JoinDTO;
import org.project.dto.LoginDTO;
import org.project.vo.CustomerVO;
import org.project.vo.PagingVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


public interface CustomerService {
    public CustomerVO login(LoginDTO dto) throws Exception;
    public void keepLogin(Map<String,Object> map)throws Exception;


    public CustomerVO checkLoginBefore(String value);

    public String findUserId(HttpServletResponse response, String userEmail)throws Exception;
    public void findUserPwd(HttpServletResponse response, CustomerVO vo) throws Exception;

    public CustomerVO checkId(HttpServletResponse response, String userID) throws Exception;


    public CustomerVO readCustomer(String userID);

    public void sendmail(CustomerVO vo, String div) throws Exception;
    //회원가입
//    public void regist(CustomerVO vo) throws Exception;

    //회원번호 받아서 그 한명 회원정보 가져오기
    public CustomerVO read(Integer userNo);

    //    //회원정보수정
    public void modify(CustomerModifyDTO dto) throws Exception;
    //
//    //회원탈퇴
    public void remove(Integer userNo) throws Exception;

    public void modUserStatus(Integer userNo) throws Exception;

    //회원가입 ^.^
    public CustomerVO regist(JoinDTO dto) throws Exception;

    public int countCustomer()throws Exception;

    public List<CustomerVO> selectCustomer(PagingVO vo) throws Exception;

    // 아이디 중복체크
    public int idCheck(String userID) throws Exception;

    public int countCustomerByKeyword(String keyword) throws Exception;

    public List<CustomerVO> selectCustomerByKeyword(PagingVO vo) throws Exception;

}
