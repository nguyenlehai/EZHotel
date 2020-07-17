<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<div style="color: #FF0000;">
    Error message: <%= exception.toString() %>
</div>
</body>
</html>
