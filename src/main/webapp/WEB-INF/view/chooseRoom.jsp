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
<form:form method="post" action="" modelAttribute="roomList">
  <table id="roomsTable" class="table table-bordered table-striped table-hover" d>
    <thead>
    <tr style="text-align: center">
      <th>Info Room</th>
      <th>Description Room</th>
      <th>Services</th>
      <th>Choose room</th>
      <th>Price</th>
    </tr>
    <tr>
      <td>Type1</td>
      <td>Phòng Deluxe được thiết kế tinh tế sang trọng nội thất đầy đủ tiện nghi hiện đại, cửa sổ
        kính rộng thoáng bao quát toàn cảnh thành phố mang đến cho bạn một không gian thanh bình và
        dễ chịu sẽ là sự lựa chọn cho những doanh nhân và khách du lịch.
      </td>
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
      <td>100000 VND</td>

    </tr>
    </thead>
    <tbody>
    </tbody>
  </table>
</form:form>
<div class="payment" style="text-align: right">
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
