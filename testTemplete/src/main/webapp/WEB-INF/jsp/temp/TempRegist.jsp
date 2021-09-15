<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:choose>
	<c:when test="${not empty vo.tempId}">
		<c:url var="actionUrl" value="/temp/update.do"></c:url>
	</c:when>
	<c:otherwise>
		<c:url var="actionUrl" value="/temp/insert.do"></c:url>
	</c:otherwise>
</c:choose>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져오기 </title>
</head>
<body>
	<form action="${actionUrl}" method="post" name="tempVO">
		<input type="hidden" name="tempId" value="${result.tempId}" readonly>
		<label for="tempVal">값 정보 : </label>
		<input type="text" id="tempVal" name="tempVal" value="${result.tempVal}">
		<br>
		<button type="submit">등록</button>
	</form>
</body>
</html>