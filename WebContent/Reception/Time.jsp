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
		<link rel="stylesheet" href="css/style.css" />
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.SuperSlide2.1.2.js"></script>
		<style type="text/css">
			body {
				background:#F0F8FF; zoom:1
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
						<li id="nav_1" style="width:138px;" class=""><a href="About1.jsp" class="hover-none nav"><span>关于我们</span></a></li>
						<li class="line"></li>
						<li id="nav_2" style="width:138px;" class=""><a href="Notice.jsp" class="hover-none nav"><span>车协公告</span></a></li>
						<li class="line"></li>
						<li id="nav_3" style="width:138px;" class=""><a href="queryDailyActivity" class="hover-none nav"><span>日常活动</span></a></li>
						<li class="line"></li>
						<li id="nav_32" style="width:138px;" class="navdown"><a href="Time.jsp" class="hover-none nav"><span>时间轴</span></a></li>
						<li class="line"></li>
						<li id="nav_33" style="width:138px;"><a href="Download1.jsp" class="hover-none nav"><span>下载中心</span></a></li>
						<li class="line"></li>
						<li id="nav_22" style="width: 139px; border-top-right-radius: 5px;" class="myCorner" data-corner="tr 5px"><a href="Contact.jsp" class="hover-none nav"><span>联系我们</span></a></li>
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
	
		<!-- 位于网页左边的选项栏 -->
		<div class="sidebar inner">
			<div class="sb_box1">
				<h3 class="title">
					<div class="position">
							当前位置：<a href="Home.jsp" title="网站首页">网站首页</a> &gt;&nbsp;时间轴
						</div>
					<span>时间轴</span>
				</h3>
				<!--发展历程开始-->
				<div>
					<br>
					<div class="about_content history">
						<h2>与马者大事记</h2>
						<p class="about_txt">与马行天下，行者路无疆</p>
					</div>
					<div class="event_box">
						<div class="space_div">
							<p class="left_space"></p>
							<p class="right_space"></p>
						</div>
						<div class="parHd clearfix">
							<ul>
								<li class="act"><span></span>2004.09.20</li>
								<li><span></span>2014.06.03</li>
								<li><span></span>2016.06.26</li>
								<li><span></span>2016.09.04</li>
								<li><span></span>2016.11.05</li>
								<li><span></span>2016.12.18</li>
								<li><span></span>2017.01.13</li>
								<li><span></span>2017.02.18</li>
							</ul>
							<a class="sPrev"><img src="images/left_ico.png" alt="" title=""></a>
							<a class="sNext"><img src="images/right_ico.png" alt="" title=""></a>
						</div>
						<div class="parBd clearfix">
							<div class="slideBox">
								<h4>与马者成立于内蒙古工业大学机械学院</h4>
								<p>成立者：海洋</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>协会确立负责人机制</h4>
								<p>俩边有负责人</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>Cycling Association Inner Mongolia University of Technology</h4>
								<p>0000000</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>Cycling Association Inner Mongolia University of Technology</h4>
								<p>00000000</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>Cycling Association Inner Mongolia University of Technology</h4>
								<p>11111111</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>Cycling Association Inner Mongolia University of Technology</h4>
								<p>222222222</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>Cycling Association Inner Mongolia University of Technology</h4>
								<p>6666666</p>
							</div>
							<div class="slideBox" style="display: none;">
								<h4>Cycling Association Inner Mongolia University of Technology</h4>
								<p>99999999</p>
							</div>
						</div>
					</div>
				</div>
				<!--发展历程结束-->
				<script>
					$(function() {
						jQuery(".event_box").slide({ titCell: ".parHd li", mainCell: ".parBd", defaultPlay: false, titOnClassName: "act", prevCell: ".sPrev", nextCell: ".sNext" });
						jQuery(".parHd").slide({ mainCell: " ul", vis: 6, effect: "leftLoop", defaultPlay: false, prevCell: ".sPrev", nextCell: ".sNext" });
					});
				</script>
				<br>
			</div>
			<div class="clear"></div>
		</div>
		<!-- 底部 -->
		<footer data-module="10001" data-classnow="10001">
			<div class="inner">
				<div class="foot-nav">
					<a href="Home.jsp" title="网站首页">网站首页</a><span>|</span>
					<a href="About1.jsp" title="关于我们">关于我们</a><span>|</span>
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