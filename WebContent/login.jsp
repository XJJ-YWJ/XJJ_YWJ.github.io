<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="UTF-8">
		<title>登录 -BLOG FAMILY</title>
		<style type="text/css">
			.body{margin: 0;padding: 0;}
			a{text-decoration: none;}
			.div{background-color: #f1f1f1;height: 700px;margin: -20px;padding: 0;}
			
			.logo1{position: relative;top: 120px;left: 140px;font-size:90px ;color: #ea6f5a;font-family: "宋体";}
			.logo2{position: relative;top: 250px;left: 1000px;font-size:90px ;color: #ea6f5a;font-family: "宋体";}
			
			.content{width: 400px;height: 500px;background-color: #fff;border-radius: 5px;position: relative;left: 450px;top:-90px;}
           .title-content .login{border-bottom: 2px solid #ea6f5a;}
           .title{width: 200px;height: 40px;position: relative;left: 100px;top: 40px;}
           .title-content{padding: 10px;}
           .title-content a{padding-bottom: 10px; }
           
           .center{margin-top: 100px;margin-left: 60px;}
           .center input{width: 250px;height: 45px;font-size: 14px;color:#c9c9c9;text-indent:20px;background-color: #f8f8f8;border: 1px solid #c8c8c8;}
		   .center a{margin-top: 50px;font-size: 20px;color: #FFFFFF;}
		   
		    .other{width: 300px;margin-top: 40px;margin-left: 50px;}
          .other a{float: left;text-decoration:none;width: 50px;height: 70px;margin-right: 25px;font-size: 12px;color: #999999;}
          .other img{width: 50px;height: 50px;}
		</style>
	</head>
	<body scroll="no" style="overflow-y: hidden;overflow-x: hidden;">
	<div class="div">
		<div class="logo1"><i>Blog</i></div>
		<div class="logo2"><i>Family</i></div>
		<div class="content">
			<h4 class="title">
			    <div class="title-content">
                    <a  class="login"href="login.jsp" style="font-size: 20px;color: #ea6f5a;letter-spacing: 10px;padding-left: 5px;">登录</a>
                    &nbsp;&nbsp;&nbsp;<b style="color:#969696 ;">·</b>&nbsp;&nbsp;&nbsp;
                    <a  class="reg" href="reg.jsp"style="font-size: 20px;color: #969696;letter-spacing: 10px;font-weight: 100;" >注册</a>
                </div>
			</h4>
			<div class="center">
		    	<form action="login" method="post">
		    		<!--<select style="width: 80px;height: 40px;font-size: 12px;">
                	<option>用户</option>
                	<option>管理员</option>
                    </select>-->
				    <input type="text" name="username"  placeholder="用户名" style="border-bottom: hidden;border-radius: 4px 4px 0 0;">
                    <input type="password" name="password" placeholder="密码" style="border-radius:  0 0 4px 4px;">
                     <div style="width: 260px;height: 40px;line-height:40px;text-align: center;text-decoration: none;background-color: #3194d0;border-radius:20px ;margin-top: 50px;"  >
            	        <input type="submit" value="登录" style="background-color: #3194d0;border-radius:20px ; width: 260px;height: 40px;line-height:40px;text-align: center;text-decoration: none;" />
                    </div>
		    	</form>
		    </div>
		     <!--其他登录方式-->
                <div class="other">          
            		<a href="" title="微信"><img src="img/微信.png"/>&nbsp;&nbsp;&nbsp;&nbsp;微信</a>
            		<a href="" title="qq"><img src="img/QQ.png"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ</a>
            		<a href="" title="新浪微博"><img src="img/新浪.png"/>新浪微博</a>
            		<a href="" title="网易邮箱"><img src="img/网易.png"/>网易邮箱</a>
                </div>
		    	
     		</div>

		</div>
	</div>
	</body>
</html>