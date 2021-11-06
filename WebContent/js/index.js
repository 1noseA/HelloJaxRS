window.onload = function() {

	var btn = document.getElementById("btn");
	btn.onclick = function() {
		var salary = document.getElementById("salary");
		// alert(salary.value);
		var obj = {};
		obj.empno = 7369;
		obj.salary = salary.value;
		// alert(obj.value);

		var xmlHttp = new XMLHttpRequest();
		xmlHttp.onreadystatechange = function() {
			if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
				alert("finish");
			}
		}
		// ここをDELETEにしたらDELETEになる
		xmlHttp.open("PUT", "rest/hello");
		xmlHttp.setRequestHeader("Content-type", "application/json");
		// JSON形式にしてくれる
		xmlHttp.send(JSON.stringify(obj));
	}

}