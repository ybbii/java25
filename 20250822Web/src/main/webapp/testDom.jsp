<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 id="a1">나온다</h1>
<h1 class="c1">나온22222다</h1>
<script type="text/javascript">
// #이 붙으면 위의 id값을 가져온다는 것
let test = document.querySelector('#test');
test.innerText = "홍길동";

let c1 = document.querySelector('.c1');
c1.innerText = "김하나";

let a1 = document.querySelector('#a1');
console.log(a1);
console.log(a1.innerText);
console.log(a1.innerHTML);
console.log(a1.textContent);

let a2 = document.getElementById('a1');
console.log(a2);
console.log(a2.innerText);
console.log(a2.innerHTML);
console.log(a2.textContent);

</script>
</body>
</html>