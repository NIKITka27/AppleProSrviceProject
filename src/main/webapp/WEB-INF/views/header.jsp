<%@ page language="java" contentType="text/html;charset=cp1251" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<header>
    <link rel="stylesheet" href="/static/css/menu.css"/>
    <h1>This is a header title</h1>
    <h3>Here you are, scroll down.</h3>
    <div class="back"></div>
    <nav>
        <a href="<c:url value='/home'/>">Главная</a>
        <a href="<c:url value='/iphone'/>">iPhone</a>
        <a href="<c:url value='/ipad'/>">iPad</a>
        <a href="<c:url value='/accessories'/>">Аксессуары</a>
        <a href="<c:url value='/contact'/>">Контакты</a>
        <a href="<c:url value='/login'/>">Вход</a>

    </nav>

    <!-- Unsplash copyright -->
<%--    <a class="thx"--%>
<%--       style="background-color:black;color:white;text-decoration:none;padding:4px 6px;font-family:-apple-system, BlinkMacSystemFont, quot;San Francisco&quot;, &quot;Helvetica Neue&quot;, Helvetica, Ubuntu, Roboto, Noto, &quot;Segoe UI&quot;, Arial, sans-serif;font-size:12px;font-weight:bold;line-height:1.2;display:inline-block;border-radius:3px;"--%>
<%--       href="http://unsplash.com/@oldskool2016?utm_campaign=photographer-credit" target="_blank"--%>
<%--       rel="noopener noreferrer"--%>
<%--       title="Download free do whatever you want high-resolution photos from paul morris"><span--%>
<%--            style="display:inline-block;padding:2px 3px;"><svg xmlns="http://www.w3.org/2000/svg"--%>
<%--                                                               style="height:12px;width:auto;position:relative;vertical-align:middle;top:-1px;fill:white;"--%>
<%--                                                               viewBox="0 0 32 32"><title></title><path--%>
<%--            d="M20.8 18.1c0 2.7-2.2 4.8-4.8 4.8s-4.8-2.1-4.8-4.8c0-2.7 2.2-4.8 4.8-4.8 2.7.1 4.8 2.2 4.8 4.8zm11.2-7.4v14.9c0 2.3-1.9 4.3-4.3 4.3h-23.4c-2.4 0-4.3-1.9-4.3-4.3v-15c0-2.3 1.9-4.3 4.3-4.3h3.7l.8-2.3c.4-1.1 1.7-2 2.9-2h8.6c1.2 0 2.5.9 2.9 2l.8 2.4h3.7c2.4 0 4.3 1.9 4.3 4.3zm-8.6 7.5c0-4.1-3.3-7.5-7.5-7.5-4.1 0-7.5 3.4-7.5 7.5s3.3 7.5 7.5 7.5c4.2-.1 7.5-3.4 7.5-7.5z"></path></svg></span><span--%>
<%--            style="display:inline-block;padding:2px 3px;">paul morris</span></a>--%>

</header>
</html>