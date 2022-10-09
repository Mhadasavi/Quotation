<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>
Demo Security
</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/logout" method="post" class="form-horizontal">
    <i> <input type="submit" value="Logout"/>
</form:form>
This is a test page.
And we will implement Spring security soon.
</body>
</html>