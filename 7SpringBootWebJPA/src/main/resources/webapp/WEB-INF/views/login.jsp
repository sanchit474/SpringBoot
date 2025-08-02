<html>
<head><title>Login</title></head>
<body>
    <h2>Login</h2>
    <form method="post" action="/login">
        Email: <input type="email" name="email" required/><br/>
        Password: <input type="password" name="password" required/><br/>
        <input type="submit" value="Login"/>
    </form>
    <p style="color:red;">${error}</p>
    <a href="/register">Create account</a>
</body>
</html>
