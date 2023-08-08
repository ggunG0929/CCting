<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table>
	<tr>
		<!-- 메인페이지의 클래스에서 가져오는 메인타이틀정보를 띄움 -->
		<td colspan="4" width="900px"><h1><%=request.getAttribute("mainTitle") %></h1></td>
	</tr>
	<tr align="center">
		<td><a href="">회사소개</a></td>
		<td><a href="">제품</a></td>
		<td><a href="">갤러리</a></td>
		<td><a href="/arts/AList">게시판</a></td>
	</tr>
</table>