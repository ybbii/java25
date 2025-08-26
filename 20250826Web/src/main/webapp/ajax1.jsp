<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="box"
		style="width: 200px; height: 200px; background-color: lightgray;"
		onmouseover="hoverBox()" onmouseout="resetBox()"></div>

	<textarea id="textInput" oninput="countChars()" placeholder="글을 입력하세요"></textarea>
	<p>
		글자 수 : <span id="charCount">0</span>
	</p>

	<script>
		function hoverBox() {
			document.getElementById("box").style.backgroundColor = "orange";
		}

		function resetBox() {
			document.getElementById("box").style.backgroundColor = "lightgray";
		}

		function countChars() {
			const text = doucument.getElementById("textInput").value;
			document.getElementById("charCount").innerText = text.length;
		}
	</script>
</body>
</html>