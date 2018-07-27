<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="add.jsp">点击添加</a>
<table width="1000px">
<tr>
<td>航线ID </td>
<td>航线名称</td>
<td>起飞城市 </td>
<td>到达城市</td>
<td>出发日期 </td>
<td>出发时间</td>
<td>操作</td>
</tr>
<c:forEach items="${list}" var="list">
<tr>
<td>${list.aid}</td>
<td>${list.aname}</td>
<td>${list.aqcity} </td>
<td>${list.adcity}</td>
<td>${list.ardate}</td>
<td>${list.asdate}</td>
<td><a href="getId.sw?aid=${list.aid}">修改</a>
<a href="">删除</a>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>