<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="../../resources/main.js"></script>
  <link rel="stylesheet" href="../../resources/css/bootstrap.min.3.3.7.css"/>
  <c:url value="../../resources/main.css" var="jstlCss"/>
  <link href="${jstlCss}" rel="stylesheet"/>
  <title>Room</title>
</head>
<body>

<%@ include file="../../resources/adminnav.jsp" %>


<%--@elvariable id="roomType" type="java.lang.String"--%>
<form method="GET" action="${pageContext.request.contextPath}/room/show">
  <select name="roomTypesList" id="roomTypesId">
    <option></option>
    <%--@elvariable id="roomTypesList" type="com.cyan.hotel.enumeration.RoomStyle"--%>
    <c:if test="${not empty roomTypesList}">
      <c:forEach var="roomType" items="${roomTypesList}">
        <option value="${roomType}">${roomType}</option>
      </c:forEach>
    </c:if>
    <input type="submit" value="Select"/>
  </select>
</form>

<%--@elvariable id="roomList" type="java.util.List"--%>
<form:form method="post" action="" modelAttribute="roomList">
  <table id="roomsTable" class="table table-bordered table-striped table-hover">
    <thead>
    <tr>
      <th>Id</th>
      <th>Booking Code</th>
      <th>Rooms</th>
      <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:set var="i" value="1"/>
    <c:forEach items="${roomList}" var="room">
      <tr>
        <td>${roomList.get(i).getRoomId()}</td>
        <td>${roomList.get(i).getPrice()}</td>
        <td>${roomList.get(i).getPrice()}</td>
        <td>${roomList.get(i).getDescription()}</td>
          <%-- when roomStatus is 0, room has been booked --%>
        <c:if test="${roomList.get(i).getRoomStatus() == 0}">
          <td><input class="btn btn-primary" type="button" value="Book Now" onclick="function openPage() {
                  location.href='/booking/' + '${roomList.get(i).getRoomId()}';
                  }
                  openPage()"></td>
        </c:if>
        <c:if test="${roomList.get(i).getRoomStatus() == 1}">
          <td><input class="btn btn-primary" type="button" value="Book Now" disabled></td>
        </c:if>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</form:form>
</body>
</html>
