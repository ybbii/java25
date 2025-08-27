<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action=""> <label for="subject" class="hidden">주제</label>
	<input type="text" id="subject" autofocus />
	<button id ="addBtn">추가</button>
	</form>
	<hr>
	<ul id="itemList"></ul>
	<script type="text/javascript">
	$(document).ready(function(e) {
		$('#addBtn').click(function() {
			e.preventDefault();
			$('#itemList').append('<li>' +$('#subject').val() +'</li>');
			$('#subject').val('');
		
		});
		$('#itemList').click(function(e) {
			if (confirm("삭제?")) {
				e.target.remove();
			}
		});
	});
	</script>
</body>
</html>