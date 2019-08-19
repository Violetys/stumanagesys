<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
<style type="text/css">
body {
	margin: 0px;
}

#container {
	width: 100%;
	height: 1000px;
	background-color: #b9bbbe;
}

#heading {
	width: 100%;
	height: 4%;
	background-color: #20c997;
}

#search {
	width: 100%;
	height: 8%;
	background-color: rgba(235, 234, 107, 0.98);
}

#body {
	width: 100%;
	height: 80%;
	background-color: #b3d7ff;
}

#foot {
	width: 100%;
	height: 7%;
	background-color: #6f42c1;
}
</style>
</head>
<body>
welcome
	<div id="container">
		<div id="heading">
			<jsp:include page="head.jsp"></jsp:include>
		</div>
		<div id="search">
			<jsp:include page="search.jsp"></jsp:include>
		</div>
		<div id="body">
			<jsp:include page="body.jsp"></jsp:include>
		</div>
		<div id="foot">
			<jsp:include page="foot.jsp"></jsp:include>
		</div>
	</div>


</body>
</html>