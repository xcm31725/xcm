function checkUsername(){
	var sname = document.getElementById("sname").value;
	var xhr = createXmlHttp();
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4) {
			if(xhr.Status == 200) {
				var data = xhr.responseText;
				alert(data);
				if(data == 1) {
					document.getElementById("snameSpan").innerHTML = "<font color='green'>用户名可以使用</font>";
					document.getElementById("regBtn").disabled = false;
				} else {
					document.getElementById("snameSpan").innerHTML = "<font color='red'>用户名可以使用</font>";
					document.getElementById("regBtn").disabled = true;
				}
			}
		}
	}
	xhr.open("GET",ctxpath+"/ServletDemo2?sname="+sname,true);
	xhr.send(null);
	
}

function createXmlHttp(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){}
		      }
	    }
}