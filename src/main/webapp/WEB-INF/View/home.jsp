<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>
Demo Security
</title>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Reference Bootstrap files -->
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="float-right">

        <security:authentication property="principal.username"/>

         <br>Role(s) :
         <security:authentication property="principal.authorities"/>


<br>
</div>
<hr>
<form:form action="${pageContext.request.contextPath}/logout" method="post" class="form-horizontal">
    <i> <input type="submit" value="Logout" class="btn btn-default btn-sm btn-dark position-absolute top-5 end-0"/>
</form:form>
This is a test page.
And we will implement Spring security soon.
</body>
</html>