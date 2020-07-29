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

<div class="container">
  <div class="col-md-offset-1 col-md-10">

    <input type="button" value="Add New Booking"
           onclick="window.location.href='showForm'; return false;"
           class="btn btn-primary"/>
    <br/><br/>
    <div class="panel panel-info">
      <div class="panel-heading">
        <div class="panel-title">Room list</div>
      </div>
      <div class="panel-body">
        <table class="table table-striped table-bordered">
          <tr>
            <th>ID</th>
            <th>Booking Code</th>
            <th>Rooms</th>
            <th>Action</th>
          </tr>

          <!-- loop over and print our customers -->
          <c:forEach var="booking" items="${bookingList}">

<%--            <c:url var="updateLink" value="/">--%>
<%--              <c:param name="customerId" value="${tempCustomer.id}"/>--%>
<%--            </c:url>--%>

<%--            <c:url var="deleteLink" value="/">--%>
<%--              <c:param name="customerId" value="${tempCustomer.id}"/>--%>
<%--            </c:url>--%>

            <tr>
              <td>${booking.id}</td>
              <td>${booking.bookingCode}</td>
              <td>${booking.rooms}</td>

              <td>
                <!-- display the update link --> <a href="${updateLink}">Update</a>
                | <a href="${deleteLink}"
                     onclick="if (!(confirm('Are you sure you want to delete this booking?'))) return false">Delete</a>
              </td>

            </tr>

          </c:forEach>

        </table>

      </div>
    </div>
  </div>

</div>
</body>
</html>
