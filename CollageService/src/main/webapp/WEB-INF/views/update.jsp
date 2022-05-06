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

<div class="container">
<h1 class="text-center">Update</h1>
<form action="updateHandler" >

  <div class="form-group">
    <label for="inputAddress">id</label>
    <input type="text" class="form-control" name="id" value="${student.id}">
  </div>
  
  <div class="form-group">
    <label for="inputAddress">Full Name</label>
    <input type="text" class="form-control" name="namString" value="${student.namString}" >
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" name="emailString" aria-describedby="emailHelp" value="${student.emailString}">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="passString" value="${student.passString}">
  </div>
 
   <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" name="addString" value="${student.addString}">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Phone NO.</label>
    <input type="text" class="form-control" name="numString" value="${student.numString}">

  <div class="form-group" >
    <label for="exampleFormControlSelect1">Select Course</label>
    <select class="form-control" name="courseString" >
      <option>${student.courseString}</option>
      <option>BCA</option>
      <option>MCA</option>
      <option>BBA</option>
      <option>MBA</option>
      <option>BSC</option>
      <option>MSC</option>
    </select>
  </div>
    </div>
  
  <div class="form-check form-check-inline mt-2">
  <input class="form-check-input" type="radio" name="genderString"  value="male">
  <label class="form-check-label" for="inlineRadio">Male</label>
</div>

<div class="form-check form-check-inline ">
  <input class="form-check-input" type="radio" name="genderString" id="inlineRadio" value="female">
  <label class="form-check-label" for="inlineRadio">Female</label>
</div>

   <div class="form-check mt-3">
    <input type="checkbox" class="form-check-input" id="exampleCheck1" name="checkedString">
    <label class="form-check-label" for="exampleCheck1">I agree update changes</label>
  </div>
  
   <div class="container text-center">
   <a href="${pageContext.request.contextPath }/" class="btn btn-outline-primary" role="button" aria-pressed="true">Back</a>
  <button type="submit" class="text-center btn btn-primary ">Submit</button>
  </div>
  
</form>

</div>


</body>
</html>