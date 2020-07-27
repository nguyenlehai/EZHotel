<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <script type="text/javascript" src="../../resources/js/bootstrap.min.3.3.7.js"></script>
  <link rel="stylesheet" href="../../resources/css/bootstrap.min.3.3.7.css"/>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <link href="${jstlCss}" rel="stylesheet"/>
  <title>Home</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>

<div class="container">
  <div class="starter-template">
    <h1>Home</h1>
  </div>
</div>

<div class="p">
  <p>Welcome to EZHotel!</p>
</div>

<div class="img-rounded img-responsive" id="image">
  <img src="../../images/hotel-logo.png" alt=""/>
</div>

<script type="text/javascript" src="../../resources/js/bootstrap.min.3.3.7.js"></script>
<script src="../../resources/main.js"></script>
</body>
</html>
