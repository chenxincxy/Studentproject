<%@ page import="cx.student.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="cx.student.page.Mypage" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/11/14
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    hello ssm!<br/>
    <table border="1px">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>地址</th>
            <th>操作</th>
        </tr>
        <%
            //获取request域中的数据
            List<Student> students=(List<Student>)request.getAttribute("students");
            for(Student stu:students){
        %>
        <tr>
            <td><a href="findBySnoController?sno=<%=stu.getSno()%>"><%=stu.getSno()%></a></td>
            <td><%=stu.getSname()%></td>
            <td><%=stu.getSage()%></td>
            <td><%=stu.getSaddress()%></td>
            <td><a href="deleteStudentBySno?sno=<%=stu.getSno()%>">删除</a></td>
        </tr>
        <%
            }
        %>
    </table>
    <a href="add.jsp">增加</a>

</body>
</html>
