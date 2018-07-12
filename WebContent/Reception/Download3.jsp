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
						<li id="nav_3" style="width:138px;" ><a href="queryDailyActivity" class="hover-none nav"><span>日常活动</span></a></li>
						<li class="line"></li>
						<li id="nav_32" style="width:138px;"><a href="Time.jsp" class="hover-none nav"><span>时间轴</span></a></li>
						<li class="line"></li>
						<li id="nav_33" style="width:138px;" class="navdown"><a href="Download1.jsp" class="hover-none nav"><span>下载中心</span></a></li>
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
			<div class="sb_nav">
				<!-- 位于网站左边的 -->
				<h3 class='title myCorner' data-corner='top 5px'>下载中心</h3>
				<div class="active" id="sidebar" data-csnow="2" data-class3="0" data-jsok="2">
					<dl class="list-none navnow">
						<dt id='part2_4'>
							<a href='Download1.jsp' title='协会介绍 ' class="zm"><span>历年周刊</span></a>
						</dt>
					</dl>
					<dl class="list-none navnow">
						<dt id='part2_5'>
							<a href='Download2.jsp' title='部门介绍' class="zm"><span>出行路书</span></a>
						</dt>
					</dl>
					<dl class="list-none navnow">
						<dt id='part2_5'>
							<a href='Download3.jsp' title='规章制度' class="zm"><span>自我修养</span></a>
						</dt>
					</dl>
					<dl class="list-none navnow">
						<dt id='part2_5'>
							<a href='Download4.jsp' title='假期远征' class="zm"><span>资料模板</span></a>
						</dt>
					</dl>
					 
					<!-- 位于网站右边的 -->
					<div class="clear"></div>
				</div>
				<div class="active editor">
					<div class="clear"></div>
				</div>
			</div>
			<div class="sb_box">
			    <h3 class="title">
					<div class="position">
							当前位置：<a href="Home.jsp" title="网站首页">网站首页</a> &gt;
							<a href="Download1.jsp">下载中心</a> >&nbsp;自我修养
						</div>
					<span>自我修养</span>
				</h3>
				<div class="clear"></div> 
		        <div class="active" id="newslist">
					<ul class='list-none metlist'>
						<li class='list top'><span>[2012-07-17]</span><a href='shownews.html' title='aaaa' target='_self'>aaaa</a><img class='listhot' src='images/hot.gif' alt='图片关键词' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='bbbb' target='_self'>bbbb</a><img class='listhot' src='images/hot.gif' alt='图片关键词' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='cccc' target='_self'>cccc</a><img class='listhot' src='images/hot.gif' alt='图片关键词' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='dddd' target='_self'>dddd</a><img class='listhot' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='eeee' target='_self'>eeee</a><img class='listhot'  /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='ffff' target='_self'>ffff</a><img class='listhot' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='gggg' target='_self'>gggg</a><img class='listhot' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='hhhh' target='_self'>hhhh</a><img class='listhot' /></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='iiii' target='_self'>iiii</a><img class='listhot'/></li>
						<li class='list '><span>[2012-07-16]</span><a href='shownews.html' title='jjjj' target='_self'>jjjj</a><img class='listhot' /></li></ul>
					<div id="flip"><style>.digg4  { padding:3px; margin:3px; text-align:center; font-family:Tahoma, Arial, Helvetica, Sans-serif;  font-size: 12px;}.digg4  a,.digg4 span.miy{ border:1px solid #ddd; padding:2px 5px 2px 5px; margin:2px; color:#aaa; text-decoration:none;}.digg4  a:hover { border:1px solid #a0a0a0; }.digg4  a:hover { border:1px solid #a0a0a0; }.digg4  span.current {border:1px solid #e0e0e0; padding:2px 5px 2px 5px; margin:2px; color:#aaa; background-color:#f0f0f0; text-decoration:none;}.digg4  span.disabled { border:1px solid #f3f3f3; padding:2px 5px 2px 5px; margin:2px; color:#ccc;}.digg4 .disabledfy { font-family: Tahoma, Verdana;} </style><div class='digg4 metpager_8'><span class='disabled disabledfy'><b>«</b></span><span class='disabled disabledfy'>‹</span><span class='current'>1</span><span class='disabled disabledfy'>›</span><span class='disabled disabledfy'><b>»</b></span></div></div>
				</div>
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