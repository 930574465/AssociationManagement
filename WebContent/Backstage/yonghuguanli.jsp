<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="images/metinfo.css" />
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="images/jQuery1.7.2.js"></script>
<style type="text/css">
* {
	padding: 0;
	margin: 0;
	outline: 0;
}

body {
	background: #cccccc;
	font-family: Verdana, sans-serif;
	font-size: 11px;
	line-height: 14px;
	color: #5e5e5e;
}

input,textarea,select {
	font-family: Verdana, sans-serif;
	font-size: 13px;
}

textarea {
	overflow: hidden;
}

.field {
	border: solid 1px #d3cfc7;
	background: #fff;
	padding: 5px;
}

.small-field {
	border: solid 1px #d3cfc7;
	background: #fff;
	padding: 3px 1px;
	font-size: 11px;
}

.checkbox {
	width: 13px;
	height: 13px;
	vertical-align: top;
	position: relative;
	top: 2px;
}

.button {
	background: #eee url(images/button.gif) repeat-x 0 0;
	border: solid 1px #b1a874;
	color: #7f7f7f;
	font-size: 11px;
	padding: 2px 6px 2px 6px;
	cursor: pointer;
	line-height: 14px !important;
}

.button:hover {
	color: #333;
	border-color: #857b42;
}

.field:focus {
	color: #000;
	border-color: #857b42;
}

a img {
	border: 0;
}

a {
	color: #ba4c32;
	text-decoration: underline;
	cursor: pointer;
}

a:hover {
	color: #8d341f;
	text-decoration: none;
}

.left,.alignleft {
	float: left;
	display: inline;
}

.right,.alignright {
	float: right;
	display: inline;
}

.cl {
	font-size: 0;
	line-height: 0;
	clear: both;
	display: block;
	height: 0;
}

.al {
	text-align: left;
}

.ar {
	text-align: right;
}

.ac {
	text-align: center !important;
}

h1 {
	font-size: 22px;
	line-height: 24px;
	color: #fff;
	font-weight: normal;
}

h1 a {
	color: #fff;
	text-decoration: none;
}

h2 {
	font-size: 15px;
	font-weight: normal;
}

h3 {
	font-size: 12px;
	line-height: 14px;
	font-weight: normal;
}

h3 a {
	text-decoration: none;
}

.shell {
	width: 988px;
	margin: 0 auto;
}

#header {
	height: 89px;
	background: url(images/header.gif);
	white-space: nowrap;
}

#header h1 {
	float: left;
	display: inline;
	padding-top: 12px;
}

#top-navigation {
	float: right;
	white-space: nowrap;
	color: #fff;
	padding-top: 15px;
}

#top-navigation a {
	color: #fff;
}

#top-navigation span {
	color: #dca598;
}

#top {
	height: 53px;
}

#navigation {
	height: 36px;
}

#navigation ul {
	list-style-type: none;
}

#navigation ul li {
	float: left;
	display: inline;
	margin-right: 2px;
}

#navigation ul li a,#navigation ul li a span {
	float: left;
	height: 36px;
	background: url(images/tab.gif) no-repeat 0 0;
	padding: 0 0 0 15px;
}

#navigation ul li a span {
	background-position: right 0;
	padding: 0 15px 0 0;
}

#navigation ul li a {
	line-height: 36px;
	color: #907525;
	text-decoration: none;
}

#navigation ul li a.active,#navigation ul li a:hover {
	background-position: 0 bottom;
}

#navigation ul li a.active span,#navigation ul li a:hover span {
	background-position: right bottom;
}

#navigation ul li a.active {
	font-size: 12px;
	font-weight: bold;
	color: #887e42;
}

#container {
	padding: 20px 0;
}

.small-nav {
	color: #978b48;
	padding-bottom: 20px;
}

.small-nav a {
	color: #6f6636;
}

#main {
	
}

#content {
	float: left;
	width: 100%;
}

#sidebar {
	float: right;
	width: 225px;
}

.table {
	
}

.table th {
	background: #fffdfa url(images/th.gif) repeat-x 0 0;
	color: #818181;
	text-align: center;
	padding: 7px 10px;
	border-bottom: solid 1px #d2d1cb;
}

.table td {
	background: #fbfcfc;
	border-bottom: solid 1px #e0e0e0;
	padding: 8px 10px;
	text-align: center;
}

.table tr.odd td {
	background: #f8f8f8;
	text-align: center;
}

.table tr:hover td {
	background: #fff9e1;
}

.table a.ico {
	
}

.box {
	background: #eeeeee;
	height: 100%;
	padding: 1px;
	margin-bottom: 20px;
}

.box-head {
	background: #aaaaaf;
	height: 32px;
	color: #fff;
	padding: 0 10px;
	line-height: 32px;
	white-space: nowrap;
	border-bottom: solid 1px #fff;
}

.box-head .right {
	padding-top: 5px;
	line-height: 13px;
}

.box-head .right label,.box-head .right input {
	float: left;
}

.box-head .right label {
	padding: 4px 0 0 0;
}

.box-head .right input {
	margin-left: 5px;
}

.pagging {
	height: 20px;
	padding: 8px 10px;
	line-height: 19px;
	color: #949494;
}

.pagging a {
	background: url(images/pagging.gif) repeat-x 0 0;
	height: 20px;
	float: left;
	padding: 0 8px;
	border: solid 1px #d5d5d5;
	text-decoration: none;
	color: #949494;
	margin-left: 5px;
}

.pagging a:hover {
	border-color: #8c3521;
	background: #ba4c32;
	color: #fff;
}

.pagging span {
	float: left;
	margin-left: 5px;
	padding-top: 2px;
}

a.ico {
	color: #9d9c9a;
	font-size: 10px;
	text-decoration: none;
	padding: 0 0 0 14px;
	background-repeat: no-repeat;
	background-position: 0 0;
}

a.ico:hover {
	color: #333;
}

a.del {
	background-image: url(images/del.gif)
}

a.edit {
	background-image: url(images/edit.gif);
	margin-left: 14px;
}

.form {
	padding: 15px 10px 5px 10px;
}

.form label {
	display: block;
	font-weight: bold;
	font-size: 13px;
	padding-bottom: 4px;
}

.form label span {
	color: #999;
	font-weight: normal;
}

.form .field {
	display: block;
}

.form .inline-field .field {
	display: inline;
}

.form .req {
	font-size: 13px;
	float: right;
	white-space: nowrap;
	color: #999;
}

.form p {
	padding-bottom: 15px;
}

.size1 {
	width: 716px;
}

.size2 {
	width: 80px;
}

.size3 {
	width: 120px;
}

textarea.size1 {
	height: 180px;
}

.buttons {
	text-align: left;
	padding: 10px;
	background: #eee;
	border-top: solid 1px #e0e0e0;
}

.buttons .button {
	margin-left: 3px;
}

.box-content {
	padding: 10px;
}

.sort {
	border-top: solid 1px #e0e0e0;
	padding-top: 10px;
	margin-top: 15px;
}

.sort label {
	display: block;
	font-weight: bold;
}

.sort .field {
	display: block;
	margin-top: 5px;
}

.sort select.field {
	width: 203px;
}

.box-content p {
	padding-top: 10px;
}

.select-all {
	
}

.select-all label {
	text-decoration: underline;
	padding-left: 4px;
}

.add-button,.add-button span {
	float: left;
	height: 26px;
	background: url(images/add-button.gif) no-repeat 0 0;
	padding: 0 0 0 28px;
}

.add-button span {
	background-position: right 0;
	padding: 0 10px 0 0;
}

.add-button {
	font-weight: bold;
	font-size: 12px;
	color: #747474;
	text-decoration: none;
	line-height: 26px;
}

.add-button:hover {
	color: #333;
}

#footer {
	height: 44px;
	background: url(images/footer.gif);
	line-height: 44px;
	color: #fff;
}

#footer a {
	color: #fff;
}

.msg {
	position: relative;
	padding-right: 35px;
	margin-bottom: 10px;
}

.msg p {
	padding: 9px 10px 9px 40px;
	font-size: 12px;
	background-repeat: no-repeat;
	background-position: 10px 5px;
}

.msg a.close {
	font-size: 0;
	line-height: 0;
	position: absolute;
	top: 0;
	right: 0;
	width: 34px;
	height: 34px;
	background: url(images/close.gif);
	text-indent: -4000px;
}

.msg-ok p {
	background-color: #fffac2;
	border: solid 1px #dbd6a2;
	color: #5e5c40;
	background-image: url(images/msg-ok.gif);
}

.msg-error p {
	background-color: #f3c598;
	border: solid 1px #e8b084;
	color: #ba4c32;
	background-image: url(images/msg-error.gif);
}
/*** CSS3 ***/
.box {
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	-moz-box-shadow: 0 0 6px #978f6c;
	-webkit-box-shadow: 0 0 6px #978f6c;
}

.box-head {
	-moz-border-radius-topleft: 5px;
	-moz-border-radius-topright: 5px;
	-webkit-border-top-left-radius: 5px;
	-webkit-border-top-right-radius: 5px;
}

.field,.button {
	-moz-border-radius: 4px;
	-webkit-border-radius: 4px;
}

.small-field,.button,.pagging a {
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
}

.msg p {
	-moz-border-radius: 6px;
	-webkit-border-radius: 6px;
}

.button {
	-moz-box-shadow: 0 0 2px #978f6c;
	-webkit-box-shadow: 0 0 2px #978f6c;
}
</style>
<script type="text/javascript" src="js/vue.min.js"></script>
<!-- 网页悬浮显示图片 -->
<style>
a {
	
}

img {
	width: 300px;
	border: black 1px solid;
}

#image {
	position: absolute;
	display: none;
}
</style>
<!-- 悬浮显示图片结束 -->
<script type="text/javascript">
	//===================================弹框js部分 start by:songfayuan=========================================
	//弹出隐藏层
	function ShowDiv(show_div, bg_div) {
		var scrollHeight = document.body.scrollHeight; //文档高度
		document.getElementById(bg_div).style.height = scrollHeight + 'px';

		document.getElementById(show_div).style.display = 'block';
		document.getElementById(bg_div).style.display = 'block';
	};
	//关闭弹出层
	function CloseDiv(show_div, bg_div) {
		document.getElementById("label").value = '';
		document.getElementById(show_div).style.display = 'none';
		document.getElementById(bg_div).style.display = 'none';
	};
	//关闭弹出层
	function CloseDiv2() {
		document.getElementById("MyDiv").style.display = 'none';
		document.getElementById("fade").style.display = 'none';
	};
	//===================================弹框js部分 end by:songfayuan=========================================
</script>
<style type="text/css">
/* ===================================弹框css部分 start by:songfayuan========================================= */
.black_overlay {
	display: none;
	position: absolute;
	top: 0%;
	left: 0%;
	width: 100%;
	height: 100%;
	background-color: black;
	z-index: 1001;
	-moz-opacity: 0.8;
	opacity: .50;
	filter: alpha(opacity = 50);
}

.white_content {
	display: none;
	position: absolute;
	top: 35%;
	left: 36%;
	width: 33%;
	border: 2px solid #d3d3d3;
	background-color: white;
	z-index: 1002;
	/* overflow: auto; */
}

.white_content_small {
	display: none;
	position: absolute;
	top: 20%;
	left: 30%;
	width: 40%;
	height: 50%;
	border: 16px solid lightblue;
	background-color: white;
	z-index: 1002;
	overflow: auto;
}
/* ===================================弹框css部分 end by:songfayuan========================================= */
</style>
</head>

<body>
	<!-- Container -->
	<div id="container">
		<div class="shell">
			<div class="shell">
				<div class="metinfotop">
					<div class="position">管理系统 > 用户管理</div>
				</div>
			</div>
			<!-- End Message Error -->
			<br />
			<!-- Main -->
			<div id="main">
				<div class="cl">&nbsp;</div>
				<div id="content">
					<div class="box">
						<div class="box-head">
							<h2 class="left">马儿名册</h2>
							<div class="right">
								<input type="text" class="field small-field" /> <input
									type="submit" class="button" value="  查找  " />
							</div>
						</div>
						<!-- Table -->
						<div class="table">
							<table width="100%" border="0" cellspacing="0" cellpadding="0"
								align="center">
								<tr align="center">
									<th>学号</th>
									<th>姓名</th>
									<th>性别</th>
									<th>班级</th>
									<th>联系方式</th>
									<th>缴费情况</th>
									<th>权限</th>
									<th>密码</th>
									<th>职务</th>
									<th>删除</th>
									<th>修改</th>
								</tr>
								<c:forEach items="${userList}" var="user">
									<tr align="center">
										<td><h3>${user.number}</h3></td>
										<td><a href="getIconUser?number=${user.number}">${user.name}</a>
										</td>
										<td>${user.sex}</td>
										<td>${user.classes }</td>
										<td>${user.contactWay}</td>
										<td>
											<c:if test="${user.payState == 0}">已缴</c:if>
											<c:if test="${user.payState == 1}">未缴</c:if>
										</td>
										<td class="permissionText">
											<c:forEach items="${user.permissions}" var="permission">${permission.id}</c:forEach>
										</td>
										<td>${user.password}</td>
										<td>
											<c:if test="${empty user.position}">
												<a href="#" class="ico del">
													同意申请
												</a>
											</c:if>
											<c:if test="${!empty user.position}">${user.position.name}</c:if>
										</td>
										<td><a href="#" class="ico del">删除&nbsp;&nbsp;&nbsp;</a></td>
										<td><a class="button border-green button-little"
											onclick="javasrcipt:ShowDiv('MyDiv','fade')">修改</a></td>
									</tr>
								</c:forEach>
								
								
								<!--弹出层时背景层DIV---start-->
								<div id="fade" class="black_overlay"></div>
								<div id="MyDiv" class="white_content">
									<div
										style="text-align: right; cursor: default; margin-top:10px;margin-bottom:10px;">
										<span
											style="font-size: 10px; margin-right: 11px; color: #56BE2D; font-weight: 600;cursor:pointer;"
											onclick="CloseDiv('MyDiv','fade')">关闭</span>
									</div>
									<div class="itempanel" style="    margin-left: 13%;">
										<div class="floatleft title" style="text-align: left;">
											修改学号：<input type="text" id="label" name="label"
												placeholder="确认正确" />
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改姓名：<input type="text" id="label" name="label"
												placeholder="确认正确" />
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改性别：<input type="text" id="label" name="label"
												placeholder="确认正确" />
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改班级：<input type="text" id="label" name="label"
												placeholder="确认正确" />
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改联系方式：<input type="text" id="label" name="label"
												placeholder="确认正确" />
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改缴费情况： <input type="radio" checked="checked" name="1">已缴费</input>&nbsp;&nbsp;
											<input type="radio" name="1">未缴费</input>
										</div>
										<br />
										<div class="floatleft title" style="text-align: left;">
											修改权限： <input type="checkbox" name="vehicle" value="Car"
												checked="checked" />1&nbsp;&nbsp; <input type="checkbox"
												name="vehicle" value="Car" checked="checked" />2&nbsp;&nbsp;
											<input type="checkbox" name="vehicle" value="Car"
												checked="checked" />3&nbsp;&nbsp; <input type="checkbox"
												name="vehicle" value="Car" checked="checked" />4&nbsp;&nbsp;
											<input type="checkbox" name="vehicle" value="Car"
												checked="checked" />5&nbsp;&nbsp;
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改密码：<input type="text" id="label" name="label"
												placeholder="确认正确" />
										</div>
										<br/>
										<div class="floatleft title" style="text-align: left;">
											修改头像：<input type="file" name="" size="5" />
										</div>
										<br/>
										<div class="floatleft message"></div>
										<div class="clear"></div>
									</div>
									<div
										style="margin-bottom: 23px; margin-top: 23px; margin-left: 23%;">
										<input type="button" class="greenbutton2"
											style="width: 110px;margin-left: 30px;"
											onclick="javasrcipt:goToAdd()" value="修改"
											style="width: 123px; margin-left: 20%; "/> <input
											type="button" class="greenbutton2"
											style="width: 110px;margin-left: 30px;"
											onclick="CloseDiv('MyDiv','fade')" value="取消"
											style="width: 123px; margin-left: 20%; "/>
									</div>
								</div>
								<!--弹出层时背景层DIV---end-->

							</table>
							<!-- Pagging -->
							<div class="pagging">
								<div class="right">
									<a href="#">首页</a> <a href="#">1</a> <a href="#">2</a> <a
										href="#">3</a> <a href="#">4</a> <span>...</span> <a href="#">245</a>
									<a href="#">下一页</a> <a href="#">尾页</a>
								</div>
							</div>
							<!-- End Pagging -->
						</div>
					</div>
					<!-- End Box -->
					<!-- Box -->
					<div class="box">
						<!-- Box Head -->
						<div class="box-head">
							<h2>添加新用户</h2>
						</div>
						<!-- End Box Head -->
						<form action="registerUser" method="post" enctype="multipart/form-data">
							<!-- Form -->
							<div class="form">
								<p>
									<label> 学号</label> <input type="text" class="field size1" name="number" />
								</p>
								<p>
									<label> 姓名 </label> <input type="text" class="field size1" name="name" />
								</p>
								<p>
									<label> 性别</label> <input type="radio" checked="checked" value="0" name="sex"/>男&nbsp;&nbsp; 
									<input type="radio" value="1" name="sex"/>女
								</p>
								<p>
									<label> 班级 </label> <input type="text" class="field size1" name="classes" />
								</p>
								<p>
									<label>联系方式<span></span></label> <input type="text" class="field size1" name="contactWay" />
								</p>
								<p>
									<label> 缴费情况 </label> <input type="radio"  value="0" name="payState"/>已缴费&nbsp;&nbsp; 
									<input type="radio" value="1" name="payState" checked="checked"/>未缴费
								</p>
								<p>
									<label>职位</label>
									<input type="radio" name="positionId" value="1" />${positionList[0].name}&nbsp;&nbsp; 
									<input type="radio" name="positionId" value="2" />${positionList[1].name}&nbsp;&nbsp;
									<input type="radio" name="positionId" value="3"  />${positionList[2].name}&nbsp;&nbsp; 
									<input type="radio" name="positionId" value="4" checked="checked"  />${positionList[3].name}&nbsp;&nbsp;
								</p>
								<p>
									<label>权限</label> 
									<input type="checkbox" name="permission" value="1" />${permissionList[0].name}&nbsp;&nbsp; 
									<input type="checkbox" name="permission" value="2" />${permissionList[1].name}&nbsp;&nbsp;
									<input type="checkbox" name="permission" value="3"  />${permissionList[2].name}&nbsp;&nbsp; 
									<input type="checkbox" name="permission" value="4"  />${permissionList[3].name}&nbsp;&nbsp;
									<input type="checkbox" name="permission" value="5" />${permissionList[4].name}&nbsp;&nbsp;
								</p>
								<p>
									<label>密码</label> <input type="text" class="field size1" name="password" />
								</p>
								<p>
									<label>照片</label> <input type="file" name="icon" size="5" />
								</p>
							</div>
							<!-- End Form -->
							<!-- Form Buttons -->
							<div class="buttons">
								<input type="submit" class="button" value="  提交  " />
							</div>
							<!-- End Form Buttons -->
						</form>
					</div>
					<!-- End Box -->
				</div>
				<!-- End Content -->
				<div class="cl">&nbsp;</div>
			</div>
			<!-- Main -->
		</div>
	</div>
	<c:if test="${!empty registerResult and registerResult==true}">							
		<script type="text/javascript">
			alert("添加成功");
		</script>
	</c:if>
	<script type="text/javascript">
		$(document).ready(function() {
			$(".permissionText").each(function() {
				this.innerHTML = $(this).text().trim().split("").sort().toString().replace(/,/g, "");
			});
		});
	</script>
</body>
</html>








