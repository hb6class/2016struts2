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
			<h1>입력페이지</h1>
		</div>
		<div class="clear"></div>
		<form action="insert.action">
		<div class="grid_5">사번:</div>
		<div class="grid_7"><input type="text" name="sabun" /> </div>
		<div class="clear"></div>
		<div class="grid_5">이름:</div>
		<div class="grid_7"><input type="text" name="name" /> </div>
		<div class="clear"></div>
		<div class="grid_5">금액:</div>
		<div class="grid_7"><input type="text" name="pay" /> </div>
		<div class="clear"></div>
		<div class="grid_12">
			<button type="submit">입 력</button>
			<button type="reset">취 소</button>
		</div>
		</form>
		<div class="clear"></div>
		
	</div>
</body>
</html>








