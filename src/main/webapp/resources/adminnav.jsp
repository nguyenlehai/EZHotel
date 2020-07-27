<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="${pageContext.request.contextPath}/">EZ Hotel</a>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a href="${pageContext.request.contextPath}/admin/list">List Booking</a></li>
        <li><a href="${pageContext.request.contextPath}/admin/room">Room</a></li>
        <li><a href="${pageContext.request.contextPath}/admin/event">Event</a></li>
      </ul>
      <div>
        <form action="" method="get">
          <%--@elvariable id="login" type="java.lang.String"--%>
          <c:if test="${sessionScope.adminLogin == 'true'}">
            <ul class="nav navbar-nav navbar-right">
              <li><p style="color: #cccccc; padding-top: 15px">
                Welcome <%--@elvariable id="username" type="java.lang.String"--%>
                <c:out value="${username}"/>!</p></li>
              <c:set var="username" scope="session" value="${username}"/>
              <li>
                <button style="padding-top: 15px" type="button" class="btn btn-link"
                        onclick="location.href='/admin/logout'">
                  Logout
                </button>
              </li>
            </ul>
          </c:if>
        </form>
      </div>
    </div>
  </div>
</nav>
<div class="mb-2 bg-info text-white text-center">Ez Hotel</div>