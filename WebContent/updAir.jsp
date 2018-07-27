<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="from" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<from:form action="updAir.sw" method="put" commandName="airbyId">
<from:hidden path="aid"/><br>
航线名称<from:input path="aname"/><br>
起飞城市<from:input path="aqcity"/><br>
到达城市<from:input path="adcity"/><br>
起飞时间<from:input path="ardate"/><br>
起飞日期<from:input path="asdate"/><br>
<input type="submit" value="修改"><br>
</from:form>

</body>
</html>