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
  <script src="../../resources/js/jquery-1.10.2.js"></script>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <link href="${jstlCss}" rel="stylesheet"/>
  <title>Room</title>
</head>
<body id="chooseRoomPage">
<%@ include file="../../resources/nav.jsp" %>
<div class="container">
  <div class="starter-template">
    <h1>EZHotel Room</h1>
  </div>
</div>
<%--@elvariable id="roomList" type="java.util.List"--%>
<form:form cssStyle="padding: 50px" method="post" action="" modelAttribute="roomList">
  <table class="table table-bordered table-striped table-hover">
    <thead>
    <tr style="text-align: center">
      <th style="width: 10%">Info Room</th>
      <th style="width: 35%">Description Room</th>
      <th style="width: 20%">Services</th>
      <th style="width: 10%">Choose room</th>
      <th>Price</th>
    </tr>
    <c:forEach var="room" items="${roomList}">
      <tr class="roomTables">
        <td>${room.id}</td>
        <td>${room.roomName} <br><img src="${room.roomImage}" alt="images"></td>
        <td>
          <jsp:useBean id="optionList" scope="request" type="java.util.List"/>
          <c:forEach var="option" items="${optionList}">
            <div>${option.optionName}</div>
            <select class="chooseOption">
              <option value="0" option-cost="0">0</option>
              <option value="1" option-cost="${option.optionCost}">1</option>
              <option value="2" option-cost="${option.optionCost * 2}">2</option>
              <option value="3" option-cost="${option.optionCost * 3}">3</option>
            </select></label>
          </c:forEach>
        </td>
        <td>
          <select class="chooseRoom">
            <option value="0" room-cost="0" selected>0</option>
            <option value="1" room-cost="${room.roomPrice}">1</option>
            <option value="2" room-cost="${room.roomPrice * 2}">2</option>
            <option value="3" room-cost="${room.roomPrice * 3}">3</option>
          </select>
        </td>
        <td>
          <div id="cost">0</div>
        </td>
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
    Total:
    <div id="total"></div>
  </div>
  <button class="btn btn-primary" type="submit">Book Room</button>
</div>
</body>
<script>
  $(document).ready(function () {
    let optionCost, roomCost, cost = 0, arrCost = [];
    $('.roomTables').change(function () {
      cost = 0;
      $(this).find(".chooseOption").each(function (i, obj) {
        optionCost = parseInt($(obj).find(":selected").attr('option-cost'));
        cost += optionCost
      })
      $(this).find('.chooseRoom').each(function (i, obj) {
        roomCost = parseInt($(obj).find(":selected").attr('room-cost'));
        cost += roomCost
      })
      $(this).find('#cost').text(cost.toString());
      arrCost[$(this).find("td:first").html()] = cost;
    })
    $('#chooseRoomPage').change(function () {
      $('#total').text(arrCost.reduce(function (a, b) {
        return a + b
      }, 0).toString());
    });
  });
</script>
</html>
