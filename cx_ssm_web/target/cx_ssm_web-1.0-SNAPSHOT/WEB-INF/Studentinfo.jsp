<%@ page import="cx.student.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/11/16
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Student stu=(Student)request.getAttribute("student");
%>
<!-- 通过表单展示此人信息 -->
<form action="upDateStudentBySno">
    学号 :<input type="text" name="sno" value="<%=stu.getSno() %>" readonly="readonly"/><br/>
    姓名 :<input type="text" name="sname" value="<%=stu.getSname() %>"/><br/>
    年龄:<input type="text" name="sage" value="<%=stu.getSage() %>"/><br/>
    地址 :<input type="text" name="saddress" value="<%=stu.getSaddress() %>"/><br/>
    <input type="submit" value="修改"/>
    <a href="findAllController">返回</a>

</form>
</body>
</html>
