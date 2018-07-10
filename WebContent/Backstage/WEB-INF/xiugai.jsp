<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.css" rel="stylesheet"> 
<link rel="stylesheet" href="css/lightbox.css" type="text/css" media="all" /><!--gallery-popup-css-->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" /><!-- Pop-up -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--fonts-->
<link href="http://fonts.googleapis.com/css?family=Josefin+Sans:100,300,400,600,700" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<!--//fonts-->

</head>
<body>

<!-- //banner -->
<!-- about -->
<div class="about" id="about">
	<div class="col-md-6 about-left-w3ls">
		<h5>Follow <br>me on <br><span>twitter</span><i class="fa fa-twitter" aria-hidden="true"></i></h5>
	</div>
		<div class="col-md-6 person-info-agileits-w3layouts">
		<h3 class="w3_head w3_head1">About Me <span>I am Andrew Smith</span></h3>
			<ul>
				<li><span>学号</span>: <input type="text"/></li>
				<li><span>姓名</span>: <input type="text"/></li>
				<li><span>性别</span>: <input type="text"/></li>
				<li><span>班级</span>: <a href="mailto:info@example.com"><input type="text"/></a></li>
				<li><span>联系方式</span>: <input type="text"/></li>
				<li><a href="#" class="botton-w3ls">修改</a>
					
				</li>
			</ul>
		</div>
	<div class="clearfix"></div>
</div>
<!-- //about-bottom -->

				<div id="small-dialog" class="mfp-hide w3ls_small_dialog wthree_pop">		
					<div class="agileits_modal_body">
						<iframe src=""></iframe>
					</div>
				</div>



<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>

</body>
</html>