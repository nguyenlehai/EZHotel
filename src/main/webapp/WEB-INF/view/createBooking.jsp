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
  <link rel="stylesheet" href="../../resources/js/chosen.min.css">
  <script src="../../resources/js/chosen.jquery.min.js"></script>
  <link href="${jstlCss}" rel="stylesheet"/>

  <script type="text/javascript" src="../../resources/main.js"></script>

  <script>
    $(".chosen-select").chosen({
      allow_single_deselect:true,
      width: '50%',
      default_no_result_text : "Not found"
    });
  </script>
</head>

<body>
<h1 style="text-align: center">Add booking</h1>
<div class="container">
  <%--@elvariable id="bookingForm" type="com.cyan.hotel.requestForm.BookingForm"--%>
  <form:form id="bookingForm " class="form-booking" modelAttribute="bookingForm" method="POST">
    <h2 class="form-header">Booking</h2>
    <div><b>Booking Code</b></div>
    <spring:bind path="bookingCode">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="bookingCode" name="bookingCode" class="form-booking"
                    placeholder="Booking Code" required="true"/>
        <form:errors cssClass="alert-danger" path="bookingCode"/>
      </div>
    </spring:bind>

    <div><b>Rooms</b></div>
    <spring:bind path="rooms">
      <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:select multiple="true" data-placeholder="Choose room" class="chosen-select" path="rooms">
          <c:forEach var="room" items="${bookingForm.rooms}">
            <option>${room}</option>
          </c:forEach>
        </form:select>
        <form:errors cssClass="alert-danger" path="rooms"/>
      </div>
    </spring:bind>

    <button class="btn btn-primary" type="submit">Save</button>
  </form:form>
</div>
</body>
</html>
