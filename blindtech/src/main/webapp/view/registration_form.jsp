<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	<link href= "<c:url value="/resources/css/tagsStyle.css" />" rel="stylesheet" type="text/css">
	<script src="<c:url value="/resources/js/responsivevoice.js" />"></script>
	<script src="<c:url value="/resources/js/customJS.js" />"></script>
	
	<style>
		.txt
		{
			width: 210px;
			height: 30px;
			padding: 5px;
			margin: 5px 2px 10px 2px;
			border-radius: 7px;
			border: 1px solid #0da3e2;
			outline: none;
			font-size: 130%;
			text-align: center;
			box-shadow: 3px 3px gray;
		}
		
		.pStyle
		{
			font-size : 130%
		}
		
		.cen
		{
			text-align : center;
		}
	</style>
</head>

<body>
	<h1 class = "hTag">Form For Blind People</h1>
	
	<form action = "/blindtech/registration" onsubmit="return(validate())">
		<div class = "cen">
			<input type = "text" name="fn" placeholder="enter first name" id = "fn" class = "txt" onmouseover="responsiveVoice.speak('first name');" onfocus="responsiveVoice.speak('first name');">
		</div>
		<br><br>
		
		<div class = "cen">
			<input type = "text" name="mn" placeholder="enter middle name" id = "mn" class = "txt" onmouseover="responsiveVoice.speak('middle name');" onfocus="responsiveVoice.speak('middle name');">
		</div>
		
		<br><br>
		
		<div class = "cen">
			<input type = "text" name="ln" placeholder="enter last name" id = "ln" class = "txt" onmouseover="responsiveVoice.speak('last name');" onfocus="responsiveVoice.speak('last name');">
		</div>
		
		<br><br>
		
		<div class = "cen">
			<input type = "text" name="mobile" id = "mobile" placeholder="enter mobile name" class = "txt">
		</div>
		
		<p class = "pStyle cen">
			Gender:
				<input type = "radio" name = "gender" id = "male" value = "male">male
				<input type = "radio" name = "gender" id = "female" value = "female">female
				
			<br><br>
			
			Hobby:
				<input type = "checkbox" name = "hobby" value = "sports" id = "hobby1">sports
				<input type = "checkbox" name = "hobby" value = "teaching" id = "hobby2">teaching
		</p>
		
		<br><br>
		
		<div class = "cen">
			<input type = "submit" value = "submit" onfocus="responsiveVoice.speak('submit');">
		</div>
	</form>
</body>
</html>