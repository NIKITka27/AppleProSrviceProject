<%@ include file="header.jsp" %>
<head>
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="static/css/login-style.css">
    <link rel="stylesheet" href="static/css/test.css"/>
</head>
<body>

<main>
    <div class="login-page">
        <div class="form">
            <form class="register-form" action="newuser" method="post">
                <input type="text" placeholder="name" name="firstName" required/>
                <input type="text" placeholder="LastName" name="LastName" required/>
                <input type="text" placeholder="address" name="address" required/>
                <input type="password" placeholder="password" name="password" required/>
                <input type="password" placeholder="re-type password" name="pass2" required/>
                <input type="text" placeholder="email address" name="email" required/>
                <input type="text" placeholder="phone" name="phone" required/>
                <input type="submit" value="Register" class="btn btn-primary btn-sm"/>
                <p class="message">Already registered? <a href="login">Sign In</a></p>
            </form>
        </div>
    </div>
</main>

</body>
</html
<%@ include file="footer.jsp" %>