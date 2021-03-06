<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="images/metinfo.css" />
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
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
	text-align: right;
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

<script>
	//显示图片
	function displayImg() {
		var img = document.getElementById("image");

		var x = event.clientX + document.body.scrollLeft + 20;
		var y = event.clientY + document.body.scrollTop - 5;

		img.style.left = x + "px";
		img.style.top = y + "px";
		img.style.display = "block";
	}

	//图片消失
	function vanishImg() {
		var img = document.getElementById("image");
		img.style.display = "none";
	}
</script>
<!-- 悬浮显示图片结束 -->
</head>

<body>



	<!-- End Header -->

	<!-- Container -->
	<div id="container">
		<div class="shell">
			<div class="shell">
				<div class="metinfotop">
					<div class="position">管理系统 > 收支记录</div>
				</div>
			</div>
			<!-- End Message Error -->
			<br />
			<!-- Main -->
			<div id="main">
				<div class="cl">&nbsp;</div>

				<!-- Content -->
				<div id="content">

					<!-- Box -->
					<div class="box">
						<div align="center" style="margin:10px">
							<label> <font size="5" color="#6666ff">资金余额:${money.size}元</font></label>
						</div>
						<!-- Box Head -->
						<div class="box-head">
							<h2 class="left">收支记录</h2>
							<div class="right">
								<input type="text" class="field small-field" /> <input
									type="submit" class="button" value="  查找  " />
							</div>
						</div>
						<!-- End Box Head -->
						<!-- id
						支出或者收入
						金额
						去向/来源
						日期
						经办人
						申请人 -->

						<!-- Table -->
						<div class="table">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>编号</td>
									<th>类型</th>
									<th>金额</th>
									<th>来源或去向</th>
									<th>时间</th>
									<th>申请人</th>
									<th>经办人</th>
									<th>删除</th>

								</tr>
								<c:forEach items="${incomeOrPayoutList}" var="incomeOrPayout">
									<tr>
										<td>${incomeOrPayout.id}</td>
										<td>
											<c:if test="${incomeOrPayout.type == 0}">
												支出
											</c:if>
											<c:if test="${incomeOrPayout.type == 1}">
												收入
											</c:if>
										</td>
										<td>${incomeOrPayout.money}</td>
										<td>${incomeOrPayout.sourceOrDestination}</td>
										<td><fmt:formatDate value="${incomeOrPayout.date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
										<td>
											<a href="queryByNumberUser?number=${incomeOrPayout.applicant.number}">
												${incomeOrPayout.applicant.name}
											</a>
										</td>
										<td>
											<a href="queryByNumberUser?number=${incomeOrPayout.agent.number}">
												${incomeOrPayout.agent.name}
											</a>
										</td>
										<td><a href="removeincomeOrPayout?id=${incomeOrPayout.id}">删除</a></td>
									</tr>
								</c:forEach>
							</table>
							<!-- Pagging -->
							<div class="pagging">
								<div class="right">
									<a href="queryByPageMoney?page=0">首页</a> 
									<c:if test="${currPage == 1}">
										<a href="javascript:void(0)">上一页</a>
									</c:if>
									<c:if test="${currPage != 1}">
										<a href="queryByPageMoney?page=${currPage-2}">上一页</a>
									</c:if>
									<s:if test="#request.countNumber*1.0/10 == #request.countNumber/10*1.0">
										${currPage}/共<s:property value="#request.countNumber/10" />页
									</s:if>
									<s:if test="#request.countNumber*1.0/10 != #request.countNumber/10*1.0">
										${currPage}/共<s:property value="#request.countNumber/10+1" />页
									</s:if>
									
									<s:if test="#request.countNumber*1.0/10 == #request.countNumber/10*1.0">
										<s:if test="#request.countNumber/10 == #request.currPage">
											<a href="javascript:void(0)">下一页</a> 
										</s:if>
										<s:if test="#request.countNumber/10 != #request.currPage">
											<a href="queryByPageMoney?page=${currPage}">下一页</a> 
										</s:if>
										<a href="queryByPageMoney?page= <s:property value='#request.countNumber/10'/>">尾页</a>
									</s:if>
									<s:if test="#request.countNumber*1.0/10 != #request.countNumber/10*1.0">
										<s:if test="#request.countNumber/10+1 == #request.currPage">
											<a href="javascript:void(0)">下一页</a> 
										</s:if>
										<s:if test="#request.countNumber/10+1 != #request.currPage">
											<a href="queryByPageMoney?page=${currPage}">下一页</a> 
										</s:if>
										<a href="queryByPageMoney?page= <s:property value='#request.countNumber/10'/>">尾页</a>
									</s:if>
								</div>
							</div>
						</div>
						<!-- Table -->

					</div>
					<!-- End Box -->

					<!-- Box -->
					<div class="box">
						<!-- Box Head -->
						<div class="box-head">
							<h2>添加收支记录</h2>
						</div>
						<!-- End Box Head -->

						<form action="addincomeOrPayout" method="post">

							<!-- Form -->
							<div class="form">
								<label>金额</label> <input type="text" class="field" size="25" name="money" />
							</div>
							<div class="form">
								<label>类型</label> <input type="radio" value="0" name="type"
									checked="checked" />支出 <input type="radio" value="1"
									name="type" />收入
							</div>
							<div class="form">
								<label>来源或去向</label>
								<textarea class="field" rows="3" cols="30" name="sourceOrDestination"></textarea>
							</div>
							<div class="form">
								<label>申请人学号</label> <input type="text" class="field" size="25" name="applicantUser" />
							</div>
							<!-- End Form -->

							<!-- Form Buttons -->
							<div class="form" align="left">
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

	<c:if test="${!empty addResult and addResult==true}">							
		<script type="text/javascript">
			alert("添加成功");
		</script>
	</c:if>
	<c:if test="${!empty removeResult and removeResult==true}">							
		<script type="text/javascript">
			alert("删除成功");
		</script>
	</c:if>
</body>
</html>
