<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <c:url value="/main/webapp/resources/main.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>
    <link href="<c:url value="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"/>"
          rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Register</title>
</head>
<body>

<div class="container">
    <%--@elvariable id="registerForm" type="com.cyan.hotel.requestForm.RegisterForm"--%>
    <form:form class="form-register" modelAttribute="registerForm" method="POST">
        <h2 class="form-header">Register</h2>
        <div>First name</div>
        <spring:bind path="firstName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="firstName" class="form-control"
                            placeholder="First Name"/>
                <form:errors path="firstName"/>
            </div>
        </spring:bind>

        <div>Last name</div>
        <spring:bind path="lastName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="lastName" class="form-control"
                            placeholder="Last Name"/>
                <form:errors path="lastName"/>
            </div>
        </spring:bind>

        <div>User name</div>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" cssClass="form-control" placeholder="Username"
                />
                <form:errors path="username"/>
            </div>
        </spring:bind>

        <div>Password</div>
        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Password"/>
                <form:errors path="password"/>
            </div>
        </spring:bind>

        <div>Confirm password</div>
        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="passwordConfirm" class="form-control"
                            placeholder="Confirm your password"/>
                <form:errors path="passwordConfirm"/>
            </div>
        </spring:bind>

        <div>Email</div>
        <spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="email" class="form-control"
                            placeholder="Email Address"/>
                <form:errors path="email"/>
            </div>
        </spring:bind>

        <div>Phone number</div>
        <spring:bind path="phoneNumber">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="phoneNumber" class="form-control"
                            placeholder="Phone Number"/>
                <form:errors path="phoneNumber"/>
            </div>
        </spring:bind>

        <div>Identity Card Number</div>
        <spring:bind path="identityCardNumber">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="identityCardNumber" class="form-control"
                            placeholder="Identity Card Number"/>
                <form:errors path="identityCardNumber"/>
            </div>
        </spring:bind>

        <button class="btn btn-primary" type="submit">Register</button>
    </form:form>
</div>
</body>
</html>
