<html>
<head><title>Login</title></head>
<body>
    <h2>Login</h2>
    <c:if test="${not empty errorMsg }">
           <h4 style = "color: red" >${errorMsg} </h4>
    </c:if>
    <form method="post" action="/login">
        Email: <input type="email" name="email" required/><br/>
        Password: <input type="password" name="password" required/><br/>
        <input type="submit" value="Login"/>
    </form>
    <a href="/register">Create account</a>
</body>
</html>
