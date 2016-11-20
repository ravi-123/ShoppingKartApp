<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi ${user.name}</h1>
	<h1>dob: ${user.dob}</h1>
	<h3>Welcome 2 Shopping karo non stop</h3>
	<h3> list of items:</h3>
	<h3> date : ${requestScope.date}</h3>
	<h3> age : ${user.age}</h3>
	<h3> email : ${user.email}</h3>
	<h3> gender : ${user.sex}</h3>
	<h3> role : ${user.role}</h3>
	
</body>
</html>
