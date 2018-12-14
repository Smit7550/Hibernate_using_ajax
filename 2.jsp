<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
	function fn() {
		var x = document.getElementById('fn');
		var htp = new XMLHttpRequest();
		htp.onreadystatechange = function() {
			if (htp.readyState == 4) {
				var jsn = JSON.parse(htp.responseText);
				if (jsn.length > 0) {
					for (var i = 0; i < jsn.length; i++) {
						t1.style.display = "";
						var r = t1.insertRow(-1);

						var c0 = r.insertCell(0);
						c0.innerHTML = jsn[i].Fn;
						var c1 = r.insertCell(1);
						c1.innerHTML = jsn[i].Ln;
						var c2 = r.insertCell(2);
						c2.innerHTML = jsn[i].Un;
					}
				} else {
					alert("Incorrect Name")
				}
			}
		}
		htp.open("post", "RegCont?fn=" + x.value, true);
		htp.send();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<center>
		Username<input type="text" id="fn"><br> <br>
		<button onclick="fn()">Submit</button>
		<br> <br>
		<table border="1" id="t1"
			style="display: none; border-collapse: collapse; font-family: jokerman">
			<tr>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Username</th>
			</tr>
		</table>
	</center>
</body>
</html>