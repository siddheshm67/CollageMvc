<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="./base.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty ask}">

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link active" href="#">Profile</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Course</a>
      </li>
    </ul>
  </div>
  <div class="card-body">
  <h1 class="text-center">Profile</h1>
  <br>
  <c:if test="${not empty msg}">
<div class="alert alert-success">
	<c:out value="${msg}"></c:out>
</div>
</c:if>
  <br>
   <table class="table">
  <tbody>
    <tr>
      <th scope="row">ID </th>
      <td>${student.id}</td>
    </tr>
    <tr>
      <th scope="row">NAME</th>
      <td>${student.namString}</td>
    </tr>
  
    <tr>
      <th scope="row">Email </th>
      <td>${student.emailString}</td>
    </tr>
  
    <tr>
      <th scope="row">Address </th>
      <td>${student.addString}</td>
    </tr>
  
    <tr>
      <th scope="row">Mobile no.</th>
      <td>${student.numString}</td>
    </tr>
  
    <tr>
      <th scope="row">Gender</th>
      <td>${student.genderString}</td>
    </tr>
    
    <tr>
      <th scope="row">Course</th>
      <td>${student.courseString}</td>
    </tr>
  
  </tbody>
</table>
  <div class="container text-center">
   <a href="${pageContext.request.contextPath }/login" class="btn btn-outline-primary" role="button" aria-pressed="true">Back</a>
  <a href="UpdateStu" class="btn btn-outline-primary" role="button" aria-pressed="true">Update</a>
  <a href="delete" class="btn btn-danger" role="button" aria-pressed="true">Delete Profile</a>
 </div>
  

  
  </div>
</div>
</c:if>

<div class="container text-center mt-4">
   <c:if test="${not empty ask}">
	<div class="card text-center container " style="width: 18rem;">
  <div class="card-body text-center">
    <h5 class="card-title">Delete</h5>
    <p class="card-text">Are you sure</p>
    <a href="finaldelete" class="card-link">yes</a>
    <a href="login" class="card-link">no</a>
  </div>
</div>
</c:if>
</div>
</body>
</html>