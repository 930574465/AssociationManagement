<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="css/lightbox.css" type="text/css"
	media="all" />
<!--gallery-popup-css-->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- Pop-up -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--fonts-->
<link
	href="http://fonts.googleapis.com/css?family=Josefin+Sans:100,300,400,600,700"
	rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,900"
	rel="stylesheet">
<!--//fonts-->

</head>
<body>

	<!-- //banner -->
	<!-- about -->
	<div class="about" id="about">
		<div class="col-md-6 about-left-w3ls"></div>
		<div class="col-md-6 person-info-agileits-w3layouts">
			<h3 class="w3_head w3_head1">About Me</h3>
			<ul>
				<li align="center"><span>学号 &nbsp;&nbsp;:</span><input
					type="text" value="201520205001" /></li>
				<li align="center"><span>姓名&nbsp;&nbsp;:</span><input
					type="text" value="李某人" /></li>
				<li align="center"><span>密码 &nbsp;&nbsp;:</span> <input
					type="password" value="123456" /></li>
				<li align="center"><span>性别&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><input
					type="radio" name="sex" value="0" checked="checked" />男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
					type="radio" name="sex" value="1" />女</li>
				<li align="center"><span>班级&nbsp;&nbsp;:</span> <input
					type="text" name="classes" value="软件15-3" /></li>
				<li align="center"><span>联系方式&nbsp;&nbsp;:</span> <input
					type="text" value="17643176635" /></li>
				<li align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
					type="file" name="" size="2" style="display: inline-block;" /></li>
				<li align="center"><span>授权&nbsp;&nbsp;:</span> <input
					type="text" name="classes" value="学号" /></li>
				<li align="center"><a href="#" class="botton-w3ls">修改</a></li>
				<br/><br/><br/>
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