<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="./base.jsp"%>
    <%@include file="./navBar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container text-center">
<h1 class="text-center">welcome to XYZ collage</h1>
<c:if test="${not empty msg}">
<div class="alert alert-success">
	<c:out value="${msg}"></c:out>
</div>
</c:if>

<a href="register" class="btn btn-primary btn-sm" role="button" aria-pressed="true">Register</a>
<a href="login" class="btn btn-primary btn-sm" role="button" aria-pressed="true">Login</a>

</div>

</body>
</html>