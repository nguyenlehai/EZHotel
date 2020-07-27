<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../../resources/css/bootstrap.min.4.5.0.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  <script src="../../resources/js/jquery.min.3.5.1.js"></script>
  <script src="../../resources/js/bootstrap.min.4.5.0.js"></script>
  <script src="../../resources/js/jquery.validate.1.19.2.js"></script>
  <link href="${jstlCss}" rel="stylesheet"/>

  <script type="text/javascript" src="../../resources/main.js"></script>

  <title>Register</title>
</head>
<body>

<div class="container">
  <%--@elvariable id="registerForm" type="com.cyan.hotel.requestForm.RegisterForm"--%>
  <form:form id="register" class="form-register" modelAttribute="registerForm" method="POST">
    <h2 class="form-header">Register</h2>
    <div><b> First name</b></div>
    <spring:bind path="firstName">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="firstName" name="firstName" class="form-control"
                    placeholder="First Name" required="true"/>
        <form:errors cssClass="alert-danger" path="firstName"/>
      </div>
    </spring:bind>

    <div><b>Last name</b></div>
    <spring:bind path="lastName">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="lastName" class="form-control" name="lastName"
                    placeholder="Last Name"/>
        <form:errors cssClass="alert-danger" path="lastName"/>
      </div>
    </spring:bind>

    <div><b>User name</b></div>
    <spring:bind path="username">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="username" cssClass="form-control" placeholder="Username" name="username"
        />
        <form:errors cssClass="alert-danger" path="username"/>
      </div>
    </spring:bind>

    <div><b>Password</b></div>
    <spring:bind path="password">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="password" path="password" class="form-control" name="password"
                    placeholder="Password"/>
        <form:errors cssClass="alert-danger" path="password"/>
      </div>
    </spring:bind>

    <div><b>Confirm password</b></div>
    <spring:bind path="passwordConfirm">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="password" path="passwordConfirm" class="form-control" name="passwordConfirm"
                    placeholder="Confirm your password"/>
        <form:errors cssClass="alert-danger" path="passwordConfirm"/>
      </div>
    </spring:bind>

    <div><b>Email</b></div>
    <spring:bind path="email">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="email" class="form-control" name="email"
                    placeholder="Email Address"/>
        <form:errors cssClass="alert-danger" path="email"/>
      </div>
    </spring:bind>

    <div><b>Phone number</b></div>
    <spring:bind path="phoneNumber">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="phoneNumber" class="form-control" name="phoneNumber"
                    placeholder="Phone Number"/>
        <form:errors cssClass="alert-danger" path="phoneNumber"/>
      </div>
    </spring:bind>

    <div><b>Identity Card Number</b></div>
    <spring:bind path="identityCardNumber">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="identityCardNumber" class="form-control"
                    placeholder="Identity Card Number"/>
        <form:errors cssClass="alert-danger" path="identityCardNumber"/>
      </div>
    </spring:bind>

    <button class="btn btn-primary" type="submit">Register</button>
  </form:form>
</div>
</body>
</html>
