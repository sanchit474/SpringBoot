<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User Profile</title>
</head>
<body>

<h2>Welcome, <c:out value="${user.name}"/></h2>

<p><strong>Email:</strong> <c:out value="${user.email}"/></p>
<p><strong>Phone No:</strong> <c:out value="${user.phoneNo}"/></p>

</body>
</html>
