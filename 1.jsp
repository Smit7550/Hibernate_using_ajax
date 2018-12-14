<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function fn() 
{
	var x = document.getElementById('fn');
	var y = document.getElementById('pw');
	var htp = new XMLHttpRequest();
	htp.onreadystatechange = function()
	{
		if(htp.readyState==4)
			{
				alert(htp.responseText);
			}
	}
	htp.open("get","RegCont?un="+x.value+"&pw="+y.value,true);
	htp.send();
}
</script>
<title>Insert title here</title>
</head>
<body>
<center>
Username<input type="text" id="fn"><br><br>
Password<input type="password" id="pw"><br><br>
<button onclick="fn()">Login</button>
</center>
</body>
</html>