<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <script type="text/javascript" src="../../resources/js/bootstrap.min.3.3.7.js"></script>
  <script src="../../resources/main.js"></script>
  <link rel="stylesheet" href="../../resources/css/bootstrap.min.3.3.7.css"/>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <link rel="stylesheet" href="../../resources/css/jquery-ui-themes.css">
  <script src="../../resources/js/jquery-1.10.2.js"></script>
  <script src="../../resources/js/jquery-ui.1.10.4.js"></script>
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery.Validate/1.6/jQuery.Validate.js" type="text/javascript"></script>
  <%--  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js" type="text/javascript"></script>--%>
  <link href="${jstlCss}" rel="stylesheet"/>
  <title>Room</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>

<div class="container">
  <%--@elvariable id="reservationForm" type="com.cyan.hotel.requestForm.RevervationForm"--%>
  <form:form id="reservation_book_room" class="reservation-form" modelAttribute="reservationForm" method="POST">
    <div class="starter-template" style="text-align: center">
      <h1>Reservation<br>BOOK ROOM</h1>
    </div>

    <div class="form-group ${status.error ? 'has-error' : ''}">
      <p>Enter Checkin Date: <input type="text" id="start_date" name="start_date" required></p>
      <form:errors cssClass="alert-danger" path="start_date"/>
    </div>

    <div class="form-group ${status.error ? 'has-error' : ''}">
      <p>Enter Checkout Date: <input type="text" id="end_date" name="end_date" required></p>
      <form:errors cssClass="alert-danger" path="end_date"/>
    </div>
    <button class="btn btn-primary" type="submit">Book Room</button>
  </form:form>
</div>
</body>
<script>
  $(function () {
	$("#start_date").datepicker();
	$("#end_date").datepicker();
  });
</script>
</html>
