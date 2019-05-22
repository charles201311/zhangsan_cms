<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人设置</title>
</head>
<body>


	<div class="form-group">
		<label for="username"></label> <input type="text" class="form-control"
			id="username" name="username" value="${u.username}" placeholder="用户名">
	</div>

	<div class="form-group">
		<label for="password"></label> <input type="password"
			class="form-control" name="password" value="${u.password}"
			id="password" placeholder="用户名">
	</div>

	<div class="form-group">
		<label for="nickname"></label> <input type="text" class="form-control"
			name="nickname" value="${u.nickname}" id="nicknname"
			placeholder="用户名">
	</div>
	<div class="form-group">
		<label for="gender"></label> <input type="radio" class="form-control"
			name="gender" id="gender" value="1" ${u.gender==1?"checked":"" }>男
		<input type="radio" class="form-control" name="gender" id="gender"
			value="2" ${u.gender==2?"checked":"" }>女
	</div>

	<div class="form-group">
		<label for="headpic"></label> <input type="file" class="form-control"
			id="headpic">
	</div>

<div class="form-group">
		  <button class="btn btn-info" type="submit">提交</button>
	</div>



</body>
</html>