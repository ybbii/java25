<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container1 {
	width: 500px;
	height: 300px;
	border: 1px solid #222;
}
</style>

</head>
<body>
	<div class="container1"></div>
	<div class="container">
		<img alt="" src="images/cat.jpg" id="cat">
		<h1 onclick="method()" id="test">안녕</h1>
		<h1 id="heading">에디오피아 게뎁</h1>
		<img alt="커피잔" src="images/coffee-pink.jpg" id="cup" width="200"
			height="200">
	</div>

	<p id="demo">원래 텍스트입니다.</p>
	<button onclick="changeText()">텍스트 변경</button>
	
	<input type="text" id="nameInput" placeholder="이름을 입력하세요">
	<button onclick="printName()">출력</button>
	<p id="output"></p>

	<p id="text">이 문장의 색상을 바꿔보세요.</p>
	<button onclick="changeColor()">색상 변경</button>
	
	<button onclick="addItem()">항목 추가</button>
	<ul id="list"></ul>

	<script type="text/javascript">
	let container = document.querySelector(".container1");
	container.onclick = (event) => {
		alert('이벤트 발생 위치 : '+ event.pageX + ', ' + event.pageY);
	}
	
	function addItem() {
		const ul = document.getElementById("list");
		const ㅣㅑ = document.getElementById("li");
		li.textContent = "새 항목";
		ul.appendChild(li);
		
	}
	
	function changeColor() {
		document.getElementById("text").style.color = "blue";
	}
	
	function printName() {
		const name = document.getElementById("nameInput").value;
		document.getElementById("output").innerText = "안녕하세요, " + name + "님@";
	}
	
	
	function changeText() {
		document.getElementById("demo").innerText = "변경된 텍스트입니다!";
	}
	
	const cat = document.querySelector('#cat');
	//cat.onclick = () => alert("클릭!");
	cat.onclick = changePic;
	function changePic() {
		cat.src = "images/kitty-2.png";
	}
	let heading = document.querySelector('#heading');
		console.log(heading);
		let cup = document.querySelector('#cup');
		console.log(cup);
		heading.onclick = () => hading.innerText = '추천! 오늘의 커피';
		cup.onclick = () => cup.src = "images/coffee-blue.jpg";
		
		let test = document.querySelector('#test');
		function method() {
			test.innerText = '나온다!';
		}
		</script>
</body>
</html>