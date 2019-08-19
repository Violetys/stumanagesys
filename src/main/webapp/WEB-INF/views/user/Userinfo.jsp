<%@page import="beans.Stu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
</head>
<body>
	<%
		Stu stu = (Stu) session.getAttribute("stu");
	%>
	<table>
		<tr>
			<td>id</td>
			<td><%=stu.getStu_id() %></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><%=stu.getStu_name()%></td>
		</tr>
		<tr>
			<td>专业</td>
			<td><%=stu.getStu_major() %></td>
		</tr>
		<tr>
			<td>年级</td>
			<td><%=stu.getStu_grade() %></td>
		</tr>
		<tr>
			<td>班级</td>
			<td><%=stu.getStu_class() %></td>
		</tr>
	</table>
</body>
</html>