<%@ include file="header.jsp" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>LOGIN</title>
    <link rel="stylesheet" type="text/css" href="/static/css/login-style.css">
    <link rel="stylesheet" href="/static/css/test.css"/>
</head>

<body>

<script type="text/javascript">
    $('.message a').click(function () {
        $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
    });
</script>
<main>
    <div class="login-page">
        <div class="form">
            <form class="login-form" action="login" method="post">
                <input type="text" placeholder="username" name="usr"/>
                <input type="password" placeholder="password" name="psw"/>
                <input type="submit" value="login">
                <p class="message">Not registered? <a href="newuser">Create an account</a></p>
            </form>
        </div>
    </div>
    </div>


</main>

</body>
</html>

<%@ include file="footer.jsp" %>