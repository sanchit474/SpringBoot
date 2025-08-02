<html>
<head><title>Register</title></head>
<body>
    <h2>Register here</h2>


    <form method="post" action="/register" >
        Name: <input type="text" name="name" required/><br/><br/>
        Email: <input type="email" name="email" required/><br/><br/>
        Password: <input type="password" name="password" required/><br/><br/>
        Phone no: <input type ="text" name="phone no" required/><br/><br/>
        <input type="submit" value="Register"/>
    </form>
    <c:if test="${param.success != null}">
        <p style="color: green;">User Registered Successfully!</p>
    </c:if>
    <a href="/login">Already have an account?</a>
</body>
</html>
