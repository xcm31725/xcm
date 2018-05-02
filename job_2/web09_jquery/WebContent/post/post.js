function post() {
	//1.创建异步对象
	var xhr = createXMLHttp();
	//2.设置状态改变的监听 回调函数，
	xhr.onreadystatechange = function() {
		if(xhr.readuState == 4) {
			if(xhr.Status == 200) {
				document.getElementById("d1").innerHTML = xhr.responseText;
			}
		}
	}
	//3.打开路径
	xhr.open("POST","/web09_jquery/ServletDemo1",true);
	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	//4.发送请求
	xhr.send("name=XCM&pass=317");
}

function createXMLHttp() {
	var xmlHttp;
	try { // Firefox, Opera 8.0+, Safari
		xmlHttp = new XMLHttpRequest();
	} catch (e) {
		try {// Internet Explorer
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
			}
		}
	}

	return xmlHttp;
}