<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function logout(){
            window.location.replace("${path}/user?action=logout");
        }
    </script>
</head>
<body>t
    <c:if test="${sessionScope.username==null}">
        <a href="login.jsp"> <span style="color:white">请登录</span></a>&nbsp;&nbsp;&nbsp;
        <a href="regist.jsp"><span style="color:white;">免费注册</span></a>
    </c:if>&nbsp;&nbsp;&nbsp;
    <c:if test="${sessionScope.username!=null}">
        欢迎您，${sessionScope.username}&nbsp;&nbsp;&nbsp;
        <a href="javascript:void(0)" onclick="logout()">退出登录</a>
    </c:if>&nbsp;&nbsp;&nbsp;
    <div class="gouwuche fr"><a href="${path}/process/car?action=query">我的购物车</a>&nbsp;&nbsp;&nbsp;</div>
    <a href="/view/order.jsp"><span style="color:white"> 我的收货地址</span></a>&nbsp;&nbsp;&nbsp;
</body>
</html>
