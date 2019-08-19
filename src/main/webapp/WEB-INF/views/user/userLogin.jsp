<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
 <style>
        body {
            background-image: url("../gif/back.jpg");
            background-repeat: no-repeat;
        }

        #Denglu {
            width: 350px;
            height: 350px;
            background-color: white;
            position: relative;
            left: 70%;
            margin-top: 100px;
        }
        font{
            font-size: 20px;
        }
    </style>
</head>
<body>
	<form action="login" method="post">
		<br/>
    <br/>
    <br/>
    <div id="Denglu">
        <div>
            <br/>
            <center><h3>登录</h3></center>
            <hr color="blue"/>
            <br/>
            <center>
                <font>学号:</font><input type="text" name="stu_id" width="20px"/><br/>
                <br/>
                <font>密码:</font><input type="password" name="stu_pwd" width="20px"/>
                <br/>
                <br/>
                <br/>
                <input type="submit" value="登录"/>
                <br/>
                <br>
                <div id="register">
                    <a href="">注册</a>
                </div>
            </center>
        </div>
    </div>
    </form>
	</form>
</body>
</html>