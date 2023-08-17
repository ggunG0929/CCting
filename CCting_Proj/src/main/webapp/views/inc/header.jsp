<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table>
	<tr>
		<!-- 메인페이지의 클래스에서 가져오는 메인타이틀정보를 띄움 -->
		<td colspan="4" width="900px"><h1><%=request.getAttribute("mainTitle") %></h1></td>
	</tr>
<tr align="center">
			<th><a href="/CCting_Proj/info">공지사항</a></th>
			<th><a href="/CCting_Proj/review/RList">리뷰게시판</a></th>
			<th><a href="/CCting_Proj/arts/AList">배우게시판</a></th>
			<th><a href="/CCting_Proj/dist/DList">작품게시판</a></th>
			<th><a href="/CCting_Proj/member/MList">회원정보</a></th>
		</tr>
</table>