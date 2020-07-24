<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.js"></script>
  <link href="${jstlCss}" rel="stylesheet"/>

  <script type="text/javascript" src="../../resources/main.js"></script>

  <title>LOGIN</title>
</head>

<body>
<h1 style="text-align: center">Login to EzHotel</h1>
<div class="container">
  <%--@elvariable id="loginForm" type="com.cyan.hotel.requestForm.LoginForm"--%>
  <form:form id="login" class="form-login" modelAttribute="loginForm" method="POST">
    <h2 class="form-header">LOGIN</h2>
    <div><b>Username</b></div>
    <spring:bind path="username">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="username" name="username" class="form-login"
                    placeholder="User Name" required="true"/>
        <form:errors cssClass="alert-danger" path="username"/>
      </div>
    </spring:bind>

    <div><b>Password</b></div>
    <spring:bind path="password">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="password" path="password" class="form-login" name="password"
                    placeholder="Password"/>
        <form:errors cssClass="alert-danger" path="password"/>
      </div>
    </spring:bind>

    <button class="btn btn-primary" type="submit">Login</button>
  </form:form>
</div>
</body>
</html>
