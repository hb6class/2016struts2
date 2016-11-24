<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/struts02/resource/css/grid.css" />
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div>
	<img alt="" src="../resource/img/logo_ai.png" />
</div>
	<div class="container_12">
		
		<div class="grid_12">
			<h1>상세페이지</h1>
		</div>
		<div class="clear"></div>
		<div class="grid_5">사번:</div>
		<div class="grid_7">${bean.sabun }</div>
		<div class="clear"></div>
		<div class="grid_5">이름:</div>
		<div class="grid_7">${bean.name }</div>
		<div class="clear"></div>
		<div class="grid_5">날짜:</div>
		<div class="grid_7">${bean.nalja }</div>
		<div class="clear"></div>
		<div class="grid_5">금액:</div>
		<div class="grid_7">${bean.pay }</div>
		<div class="clear"></div>
		<div class="grid_12">
			<a href="edit.action?idx=${bean.sabun }">수 정</a>
			<a href="delete.action?idx=${bean.sabun }">삭 제</a>
		</div>
		<div class="clear"></div>
		
	</div>
</body>
</html>








