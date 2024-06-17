<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입확인</title>
</head>
<body>
<h2>[가입하신 회원 정보]</h2><br>
아이디 : ${mdto.memberid }<br>
비밀번호 : ${mdto.memberpw}<br>
이름 : ${mdto.membername }<br>
나이 : ${mdto.memberage }<br>
이메일: ${mdto.memberemail }<br>

</body>
</html>