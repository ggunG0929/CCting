<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String mainUrl = request.getAttribute("mainPage") + ".jsp";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CCting</title>
</head>
<body>
<table border="">
	<tr>
		<td><jsp:include page="inc/header.jsp" /></td>
	</tr>
	<tr>
		<!-- 컨트롤러에서 준 정보의 페이지를 삽입함 -->
		<td><jsp:include page="<%=mainUrl %>" /></td>
	</tr>
	<tr>
		<td><jsp:include page="inc/footer.jsp" /></td>
	</tr>
</table>
</body>
</html>