<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/include/header.jspf" %>

<section class="py-5" id="features" style="display: flex; justify-content: center;">

           <head>
               <meta charset="UTF-8">
               <title>로그인화면</title>
               <link href="../resources/css/login.css" rel="stylesheet" type="text/css">
                       <style type="text/css">
                          .mybtn{
                            width:150px;
                            height:40px;
                            padding:0;
                            display:inline;
                            border-radius: 25px;
                            background: #FFD700;
                            color: black;
                            margin-top: 25px;
                            border: solid 2px white;
                            transition: all 0.5s ease-in-out 0s;
                          }
                          .mybtn:hover .mybtn:focus {
                            background: white;
                            color: #212529;
                            text-decoration: none;
                          }
                          .mybtn:active{
                              position: relative;
                              top:2px;
                          }
                          .input-area{
                               width:300px;
                               height:40px;
                               border-radius: 10px;
                               border: solid 1.5px gray;

                          }
                         .board{
                           border: solid 2px white;
                           border-radius: 25px;
                           background: rgba(255, 247, 137, 0.132);
                           margin-top: 100px;
                           margin-bottom: 100px;
                           height:600px;
                           width:800px;
                          }
                          </style>

   </head>
    <body>
            <div class="w3-content w3-container w3-margin-top board">
                <div class="w3-container w3-card-4 w3-auto">
                    <div class="w3-center w3-large w3-margin-top" style="display: flex; justify-content: center; margin-top:100px; margin-bottom:100px;" >
                        <h3>아이디 찾기</h3>
                    </div>
                    <form action="<%=request.getContextPath()%>/user/findUserId" method = "post">
                    <div>
                        <p style="display: flex; justify-content: center;">
                            <label>아이디</label>
                            <input class="w3-input input-area" type="text" id="corpName" name="corpName" placeholder="이름을 입력하세요" required>
                        </p>
                        <p style="display: flex; justify-content: center;">
                            <label>이메일</label>
                            <input class="w3-input input-area" type="text" id="userEmail" name="userEmail" placeholder="회원가입한 이메일주소를 입력하세요" required>
                        </p>
                        <p class="w3-center" style="display: flex; justify-content: center;">
                            <button type="submit" id="findBtn" class="w3-button w3-hover-white w3-ripple w3-margin-top w3-round mybtn">아이디찾기</button>
                            <button type="button" onclick="history.go(-1);" class="w3-button w3-hover-white w3-ripple w3-margin-top w3-round mybtn">로그인으로</button>
                        </p>
                    </div>
                    </form>
                </div>
            </div>
        </body>

</section>











<%@ include file="/WEB-INF/views/include/footer.jspf" %>