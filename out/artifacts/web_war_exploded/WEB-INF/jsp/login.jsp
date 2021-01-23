<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath }/register"
      method="post">
    用户名：<input type="text" name="username" /><br />
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" /><br />
    金&nbsp;&nbsp;&nbsp;钱：<input type="text" name="money" /><br />
    <input type="submit" value="注册"/>
</form>

<form action="${pageContext.request.contextPath }/login"
      method="post">
    用户名：<input type="text" name="username" /><br />
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" /><br />
    <input type="submit" value="登录"/>
</form>

<form action="${pageContext.request.contextPath }/delete"
      method="post">
    用户名：<input type="text" name="username" /><br />
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" /><br />
    <input type="submit" value="删除"/>
</form>
</body>
</html>