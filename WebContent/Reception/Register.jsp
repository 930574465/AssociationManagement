<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<title>与马者自行车协会</title>
		<link href="favicon.ico" rel="shortcut icon">
		<link rel="stylesheet" type="text/css" href="images/metinfo.css">
		<script src="images/jQuery1.7.2.js" type="text/javascript"></script>
		<script src="images/ch.js" type="text/javascript"></script>
		<script language="javascript">
			/* 学号做一个验证 */
			function IsDigit(nCheck) {
				return (('0' <= nCheck) && (nCheck <= '9') && c(Check.length == 12));
			}
			
			function IsValid() {
				var number = reg.number.value;
				for (nIndex = 0; nIndex < number.length; nIndex++) {
					nCheck = number.charAt(nIndex);
					if (!(IsDigit(nCheck))) {
						return false;
					}
				}
				return true;
			}
			/* 同理，验证手机号是否符合规定 */
			function chkPhone(pCheck){
				return (('0' <= pCheck) && (pCheck <= '9') && c(pCheck.length == 11));
			}
			function PhoneIsValid() {
				var contactWay = reg.contactWay.value;
				for (nIndex = 0; nIndex < contactWay.length; nIndex++) {
					pCheck = contactWay.charAt(nIndex);
					if (!(IsDigit(pCheck))) {
						return false;
					}
				}
				return true;
			}
			
			function docheck() {
				if (reg.number.value == "") {
					alert("请填写学号");
					return false;
				} else if (!IsValid()) {
					alert("学号输入违反规则");
					return false;
				}if (reg.contactWay.value == "") {
					alert("请填写手机号");
					return false;
				} else if(!PhoneIsValid()){
					alert("请输入正确手机号");
					return falue;
				} else if (reg.password.value == "") {
					alert("请填写密码");
					return false;
				} else if (reg.password.value != reg.rPassword.value) {
					alert("两次密码不一致");
					return false;
				} else if (reg.name.value == "") {
					alert("请填写姓名");
					return false;
				}else if (reg.classes.value == "") {
					alert("请填写专业班级");
					return false;
				}
				  else {
					return true;
				}
			}
		</script>
		<style type="text/css">
			body {
				background:#F0F8FF; zoom:1
			}
			table {
				margin:auto;
			    border-collapse: collapse;
			    font-family: Futura, Arial, sans-serif;
			}
			caption {
			    font-size:large;
			    margin: 1em auto;
			}
			th,td {
			    padding: .65em;
			}
			th,td {
			    border-bottom: 1px solid #ddd;
			    border-top: 1px solid #ddd;
			}
			.duigou {
				vertical-align: middle;
			}
		</style>
	</head>
	
	<body>
	
		<!-- 头部 -->
		<header>
			<div class="inner">
				<div class="top-logo">
					<a href="index.html" title="网站名称" id="web_logo"><img src="images/logo.png" alt="网站名称" title="网站名称" style="margin:20px 0px 0px 0px;"></a>
					<ul class="top-nav list-none">
						<li class="t">
							<a class="fontswitch" id="StranLink" href="javascript:StranBody()">繁体中文</a><span>|</span>
							<c:if test="${empty loginedUser}">
								<a href="Login.jsp" title="登录">登录</a>
								<span>|</span>
								<a href="Register.jsp" title="注册" class="shopweba">注册</a>
							</c:if>
							<c:if test="${!empty loginedUser}">
								你好，
								<a href="../Backstage/index.jsp">${loginedUser.name}</a>
								<span>|</span>
								<a href="logoutUser">注销</a>
							</c:if>
						</li>
					</ul>
				</div>
			
				<nav>
					<ul class="list-none">
						<li id="nav_10001" style="width: 138px; border-top-left-radius: 5px;" data-corner="tl 5px"><a href="Home.jsp" class="nav"><span>网站首页</span></a></li>
						<li class="line"></li>
						<li id="nav_1" style="width:138px;" class=""><a href="queryByIdAssociationInfo" class="hover-none nav"><span>关于我们</span></a></li>
						<li class="line"></li>
						<li id="nav_2" style="width:138px;" class=""><a href="Notice.jsp" class="hover-none nav"><span>车协公告</span></a></li>
						<li class="line"></li>
						<li id="nav_3" style="width:138px;" class=""><a href="queryDailyActivity" class="hover-none nav"><span>日常活动</span></a></li>
						<li class="line"></li>
						<li id="nav_32" style="width:138px;"><a href="Time.jsp" class="hover-none nav"><span>时间轴</span></a></li>
						<li class="line"></li>
						<li id="nav_33" style="width:138px;"><a href="Download1.jsp" class="hover-none nav"><span>下载中心</span></a></li>
						<li class="line"></li>
						<li id="nav_22" style="width: 139px; border-top-right-radius: 5px;" data-corner="tr 5px" ><a href="Contact.jsp" class="hover-none nav"><span>联系我们</span></a></li>
					</ul>
				</nav>
			</div>
		</header>
	
		<!-- 广告位 -->
		<div class="inner met_flash">
			<div class="flash">
				<a href='#' target='_blank' title=''>
					<img src='images/1342430358.gif' width='980' alt='' height='90'>
				</a>
			</div>
		</div>
		<div class="sidebar inner ">
		    <div class="sb_box1">
			    <h3 class="title">
					<div class="position">当前位置：<a href="Home.jsp" title="网站首页">网站首页</a> &gt; &nbsp;注册</div>
					<span>注册</span>
				</h3>
					
					<div align="center">
						<form name="reg" action="registerUser" method="post" onSubmit="return docheck()" enctype="multipart/form-data">
							<table width="38%" border="0">
								<caption>成员注册</caption>
								<tr>
									<td width="25%" align="right" height="25">学号：</td>
									<td width="75%" align="left" height="25"><input type="text"  name="number"> <font color="red">输入正确学号</font></td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">姓名：</td>
									<td width="75%" align="left" height="25"><input type="text" name="name"></td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">性别：</td>
									<td width="75%" align="left" height="25"><input type="radio" name="sex" value="0" checked="checked">男&nbsp;&nbsp;<input type="radio" name="sex" value="1">女</td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">班级：</td>
									<td width="75%" align="left" height="25"><input type="text" name="classes"></td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">密码：</td>
									<td width="75%" align="left" height="25"><input type="password" name="password"></td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">确认密码：</td>
									<td width="75%" align="left" height="25"><input type="password" id="rPassword"></td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">联系方式：</td>
									<td width="75%" align="left" height="25"><input type="text" name="contactWay"></td>
								</tr>
								<tr>
									<td width="25%" align="right" height="25">照片上传：</td>
									<td width="75%" align="left" height="25"><input type="file" name="icon" size="8"></td>
								</tr>
							</table>
							<div>
				               	<input  class="duigou" type="checkbox">
				               	<span>已阅读并同意<a href="About3.jsp" target="_blank"><span class="lan">《与马者自行车协会规章制度》</span></a></span>
				         	</div>
				         	<br>
							<p>
								<input type="submit" value="注册"> &nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
							</p>
						</form>
					</div>
			</div>
		    <div class="clear"></div>
		</div>
		<!-- 底部 -->
		<footer data-module="10001" data-classnow="10001">
			<div class="inner">
				<div class="foot-nav">
					<a href="Home.jsp" title="网站首页">网站首页</a><span>|</span>
					<a href="queryByIdAssociationInfo" title="关于我们">关于我们</a><span>|</span>
					<a href="Notice.jsp" title="车协公告">车协公告</a><span>|</span>
					<a href="queryDailyActivity" title="日常活动">日常活动</a><span>|</span>
					<a href="Time.jsp" title="时间轴">时间轴</a><span>|</span>
					<a href="Download1.jsp" title="下载中心">下载中心</a><span>|</span>
					<a href="Contact.jsp" title="联系我们">联系我们</a><span>|</span>
					<a href="http://www.imut.edu.cn/" title="网站首页">工大官网</a></div>
				<div class="foot-text">
					<p>我们的网站 版权所有 2018-2022 蒙ICP备88888</p>
					<p>电话：0472-12345678 12345678  QQ:88888888 999999  Email:123456@qq.com</p>
				</div>
			</div>
		</footer>
		
		<script src="images/fun.inc.js" type="text/javascript"></script>
		<div style="text-align:center;">
			<p>来源：软件15-3班 </p>
		</div>
	
	</body>
</html>