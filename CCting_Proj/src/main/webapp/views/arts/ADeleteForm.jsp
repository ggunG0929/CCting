<%@page import="model_a.PageData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PageData pd = (PageData)request.getAttribute("pd");

	// 같은 이름의 클래스에서 넘겨받은 메인데이터 출력
	String id = request.getParameter("id");
%>
<form action="ADeleteReg" method="post">
<!-- 아이디 정보를 숨겨서 보냄 -->
<input type="hidden" name="id" value="<%=id%>" />
<input type="hidden" name="page" value="<%=pd.page%>" />
	<table border="">
		<tr>
			<td width="200px">암호</td>
			<td width="700px"><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="삭제" />
				<a href="ADetail?id=<%=id %>&page=<%=pd.page %>">뒤로</a>
			</td>
		</tr>
	</table>
</form>