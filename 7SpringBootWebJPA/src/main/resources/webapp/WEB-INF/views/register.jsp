<html>
<head><title>Register</title></head>
<body>
    <h2>Register</h2>
    <form method="post" action="/register">
        Name: <input type="text" name="name" required/><br/>
        Email: <input type="email" name="email" required/><br/>
        Password: <input type="password" name="password" required/><br/>
        <input type="submit" value="Register"/>
    </form>
    <a href="/login">Already have an account?</a>
</body>
</html>
