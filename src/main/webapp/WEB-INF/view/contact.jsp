<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <script type="text/javascript" src="../../resources/js/bootstrap.min.3.3.7.js"></script>
  <script src="../../resources/main.js"></script>
  <link rel="stylesheet" href="../../resources/css/bootstrap.min.3.3.7.css"/>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <link href="${jstlCss}" rel="stylesheet"/>
  <title>Contact</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>

<div class="container">
  <div class="starter-template">
    <h1>Contact</h1>
  </div>
</div>

<div id="contact">
  <h5>Contact Details:</h5>
  <table class="table table-condensed table-bordered">
    <thead>
    <tr>
      <th>Nguyeen Le Hai</th>
      <th>nguyenle.hai@bigtreetc.com</th>
    </tr>
    <tr>
      <th>Nguyen Tien Tuan Anh</th>
      <th>mato9898@gmail.com</th>
    </tr>
    </thead>
  </table>
</div>

<script type="text/javascript" src="../../resources/js/bootstrap.min.3.3.7.js"></script>
<script src="../../resources/main.js"></script>
</body>
</html>
