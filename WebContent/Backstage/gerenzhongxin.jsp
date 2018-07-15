<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />

<meta http-equiv="Expires" content="0">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-control" content="no-cache">
<meta http-equiv="Cache" content="no-cache">

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

<style type="text/css">
.about-left-w3ls {
    background-size: cover;
    padding: 0;
    min-height: 794px;
    position: relative;
    text-align: center;
    z-index: 999;
    margin: 0;
}
</style>

<script type="text/javascript">
	function lose(number) {
		number.blur();
	}
</script>

</head>
<body>

	<!-- //banner -->
	<!-- about -->
	<div class="about" id="about">
		<div class="col-md-6 about-left-w3ls">
			<img alt="" src="getIconUser" width="100%" height="100%">
		</div>
		<div class="col-md-6 person-info-agileits-w3layouts">
			<h3 class="w3_head w3_head1">About Me</h3>
			<form action="modifyUser" method="post" enctype="multipart/form-data" id="modify_form">
				<ul style="margin-left: 140px">
					<li>
						<span>学号 &nbsp;&nbsp;:</span>
						<input type="text" name="number" value="${loginedUser.number}" onfocus="lose(this)" />
					</li>
					<li >
						<span>姓名&nbsp;&nbsp;:</span>
						<input type="text" name="name" value="${loginedUser.name}" />
					</li>
					<li >
						<span>密码 &nbsp;&nbsp;:</span>
						<input type="password" name="password" value="${loginedUser.password}" />
					</li>
					<li >
						<span>性别</span>
						<c:if test="${loginedUser.sex == 0}">
							<input type="radio" name="sex" value="0" checked="checked" />男
							<input type="radio" name="sex" value="1" />女
						</c:if>
						<c:if test="${loginedUser.sex == 1}">
							<input type="radio" name="sex" value="0" checked="checked"  />男
							<input type="radio" name="sex" value="1" />女
						</c:if>
					</li>
					<li >
						<span>班级&nbsp;&nbsp;:</span>
						<input type="text" name="classes" value="${loginedUser.classes}" />
					</li>
					<li>
						<span>联系方式&nbsp;&nbsp;:</span>
						<input type="text" name="contactWay" value="${loginedUser.contactWay}" />
					</li>
					<li>
						<span>照片:</span>
						<input type="file" name="icon" size="5" style="display: inline-block;" />
					</li>
					<li style="margin-left: 150px"><input type="submit" value="修改" /></li>
				</ul>
			</form>
			
			<br/><br/>
			<c:if test="${loginedUser.position.id == 1}">
				<h3 align="center">会长身份转让</h3>
				<form action="tranfer" method="post">
					<ul style="margin-left: 140px">
						<li>
							<span>身份接收者学号:</span>
							<input type="text" name="number" />
						</li>
						<li style="margin-left: 150px"><input type="submit" value="转让" /></li>
					</ul>
				</form>
			</c:if>
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
	<c:if test="${!empty modifyResult and modifyResult==true}">							
		<script type="text/javascript">
			alert("修改成功");
		</script>
	</c:if>
		<c:if test="${!empty tranferResult and tranferResult==true}">							
		<script type="text/javascript">
			alert("转让成功");
		</script>
	</c:if>
</body>
</html>