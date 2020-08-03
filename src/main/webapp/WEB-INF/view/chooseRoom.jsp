<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <script type="text/javascript" src="../../resources/js/bootstrap.min.3.3.7.js"></script>
  <script src="../../resources/main.js"></script>
  <link rel="stylesheet" href="../../resources/css/bootstrap.min.3.3.7.css"/>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <link href="${jstlCss}" rel="stylesheet"/>
  <title>Room</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>

<div class="container">
  <div class="starter-template">
    <h1>EZHotel Room</h1>
  </div>
</div>

<%--@elvariable id="roomList" type="java.util.List"--%>
<form:form cssStyle="padding: 50px" method="post" action="" modelAttribute="roomList">
  <c:forEach var="room" items="${roomList}">
    <table id="roomsTable" class="table table-bordered table-striped table-hover">
      <thead>
      <tr style="text-align: center">
        <th>Info Room</th>
        <th>Description Room</th>
        <th>Services</th>
        <th>Choose room</th>
        <th>Price</th>
      </tr>
      <tr>
        <td>${room.id}</td>
        <td>${room.roomName} ---<img src="${room.roomImage}"></td>
        <td>
          Wine <select size="1">
          <option>1</option>
          <option>2</option>
          <option>3</option>
        </select>
          Cigar <select size="1">
          <option>1</option>
          <option>2</option>
          <option>3</option>
        </select>
        </td>
        <td><select size="1">
          <option>1</option>
          <option>2</option>
          <option>3</option>
        </select></td>
        <td>${room.roomPrice}</td>
      </tr>
      </thead>
      <tbody>
      </tbody>
    </table>
  </c:forEach>
</form:form>
<div class="payment" style="text-align: right; padding: 0 50px 50px 0">
  <div>Voucher <label>
    <input type="text">
  </label></div>
  <div>
    Total: xxxxxx
  </div>
  <button class="btn btn-primary" type="submit">Book Room</button>
</div>
</body>
</html>
