<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Login</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<script src="js/common/base.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/w.css">
</head>
<script type="text/javascript">
	
</script>


<body>
	<div>
		<form action="Login.htm" name="Login" method="post">
			<input type="hidden" id="mode" value="Login">

			<div align="center" class="Title">Login</div>
			<table border="1" align="center">
				<tr>
					<td>user:</td>
					<td><input type="text" id="username" name="username" />
					</td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="text" id="passwd" name="passwd" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Login" class="ApplicationButton" /></td>
				</tr>
			</table>
			<div align="center">
				<font color="red"><c:out value="${error_message}" />
				</font>
			</div>
			<div align="center">
				<font color="red"><c:out value="${validateError}" />
				</font>
			</div>
		</form>
	</div>
</body>
</html>
