<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button id="colorBtn">색상변경</button>
<p id="text">이 문장의 색상 ㅏ바꾸라</p>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
	$('#colorBtn').click(function() {
		$('#text').css('color', 'blue');
	});
});
</script>
</body>
</html>