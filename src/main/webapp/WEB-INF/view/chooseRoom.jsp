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
  <table id="roomsTable" class="table table-bordered table-striped table-hover">
    <thead>
    <tr style="text-align: center">
      <th style="width: 10%">Info Room</th>
      <th style="width: 35%">Description Room</th>
      <th style="width: 20%">Services</th>
      <th style="width: 10%">Choose room</th>
      <th>Price</th>
    </tr>
    <c:forEach var="room" items="${roomList}">
      <tr>
        <td>${room.id}</td>
        <td>${room.roomName} <br><img src="${room.roomImage}" alt="images"></td>
        <td>
          <jsp:useBean id="optionList" scope="request" type="java.util.List"/>
          <c:forEach var="option" items="${optionList}">
            <c:set var="val" value="${option.optionCost}"/>
            <div>${option.optionName}</div>
            <div><label for="option">
              <select id="option">
                <option value="0" selected>0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
              </select></label></div>
          </c:forEach>
        </td>
        <td>
          <select id="numberOfRoom">
            <option value="0" selected>0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
          </select>
        </td>
        <td>${room.roomPrice}</td>
      </tr>
    </c:forEach>
    </thead>
    <tbody>
    </tbody>
  </table>
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
