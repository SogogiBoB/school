<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous">
</script>
<style>
table {border-collapse: collapse;}
</style>
<title>목록</title>
</head>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<td>TEMP_ID</td>
					<td>TEMP_VAL</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${list.size() < 1}">
					<tr>
						<td colspan="3">등록된 정보가 없습니다.</td>
					</tr>
				</c:if>
				<c:forEach var="result" items="${list}">
					<tr>
						<td>${result.tempId}</td>
						<td>
							<c:url var="viewUrl" value="/temp/select.do">
								<c:param name="tempId" value="${result.tempId}"></c:param>
							</c:url>
							<a href="${viewUrl}"><c:out value="${result.tempVal}"></c:out></a>
						</td>
						<td>
							<a href="/temp/delete.do?tempId=${result.tempId}">삭제</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<button class="btn-reg">등록하기</button>
<script>
	$(function() {
		$(".btn-reg").click(function() {
			location.href="/temp/regist.do";
		});
	})
</script>
	
</body>
</html>