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
		<link rel="stylesheet" type="text/css" href="calendar/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="calendar/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="calendar/demo.css">
		<script type="text/javascript" src="calendar/jquery.min.js"></script>
		<script type="text/javascript" src="calendar/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="calendar/locale/easyui-lang-zh_CN.js"></script>
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
						<li id="nav_10001" style="width: 138px; border-top-left-radius: 5px;" class="navdown myCorner" data-corner="tl 5px"><a href="Home.jsp" class="nav"><span>网站首页</span></a></li>
						<li class="line"></li>
						<li id="nav_1" style="width:138px;" class=""><a href="About1.jsp" class="hover-none nav"><span>关于我们</span></a></li>
						<li class="line"></li>
						<li id="nav_2" style="width:138px;" class=""><a href="Notice.jsp" class="hover-none nav"><span>车协公告</span></a></li>
						<li class="line"></li>
						<li id="nav_3" style="width:138px;" class=""><a href="queryDailyActivity" class="hover-none nav"><span>日常活动</span></a></li>
						<li class="line"></li>
						<li id="nav_32" style="width:138px;"><a href="Time.jsp" class="hover-none nav"><span>时间轴</span></a></li>
						<li class="line"></li>
						<li id="nav_33" style="width:138px;"><a href="Download1.jsp" class="hover-none nav"><span>下载中心</span></a></li>
						<li class="line"></li>
						<li id="nav_22" style="width: 139px; border-top-right-radius: 5px;" class="myCorner" data-corner="tr 5px"><a href="Contact.jsp" class="hover-none nav"><span>联系我们</span></a></li>
					</ul>
				</nav>
			</div>
		</header>
	
		<!-- 图片轮播 -->
		<div class="inner met_flash">
			<link href="images/css.css" rel="stylesheet" type="text/css">
			<script src="images/jquery.bxSlider.min.js"></script>
			<div class="flash flash6" style="width:980px; height:245px;">
				<div class="bx-wrapper" style="width:980px; position:relative;">
					<div class="bx-window" style="width:980px; height:245px; position:relative; overflow:hidden;">
						<ul id="slider6" class="list-none" style="height: 999999px; position: relative; top: -984px;">
							<li style="list-style: none; height: 246px;"><img src="images/3333.jpg" width="980" height="245"></li>
							<li class="pager" style="list-style: none; height: 246px;"><img src="images/5555.jpg" width="980" height="245"></li>
							<li class="pager" style="list-style: none; height: 246px;"><img src="images/1111.jpg" width="980" height="245"></li>
							<li class="pager" style="list-style: none; height: 246px;"><img src="images/6666.jpg" width="980" height="245"></li>
							<li class="pager" style="list-style: none; height: 246px;"><img src="images/2222.jpg" width="980" height="245"></li>
							<li style="list-style: none; height: 246px;"><img src="images/4444.jpg" width="980" height="245"></li>
						</ul>
					</div>
				</div>
			</div>
			<script type="text/javascript">$(document).ready(function(){ $('#slider6').bxSlider({ mode:'vertical',autoHover:true,auto:true,pager: true,pause: 5000,controls:false});});</script></div>
		<div class="index inner " >
			<!-- 车协介绍 -->
			<div class="aboutus style-1">
				<h3 class="title">
				<span class="myCorner" data-corner="top 5px" style="border-top-left-radius: 5px; border-top-right-radius: 5px;">车协简介</span><a href="About1.jsp" class="more" title="链接关键词">更多&gt;&gt;</a></h3>
				<div class="active editor clear contour-1" style="height: 225px;">
					<div>
					<img alt="" src="images/20180704145427.jpg" style="margin: 8px; width: 196px; float: left; height: 209px; "></div>
						<div style="padding-top:10px;padding-bottom:10px">
						<span style="font-size:20px;"><strong>内蒙古工业大学与马者自行车协会</strong></span>
						</div>
					<h1></h1>
						<div >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;内蒙古工业大学与马者自行车协会于2004年9月20日成立于内蒙古工业大学机械学院。在协会全体成员的共同努力下，现已发展成为以自行车为载体的综合性学生社团，是内蒙古地区开展最广泛、规模最大的大学生自行车运动的民间群众组织。以“与马行天下，行者路无疆”为口号。车协结合大学生的特点，通过旅行探险、科学考察、社会调查、参观游览、志愿服务等多种社会实践方式，达到学习和锻炼的目的，培养锻炼挑战、超越的品质。</div>
						<div>&nbsp;</div>
						<div class="clear"></div>
					</div>
			</div>
			<!-- 日历 -->
			<div class="case style-2">
				<h3 class="title myCorner" data-corner="top 5px" style="border-top-left-radius: 5px; border-top-right-radius: 5px;"></a>日历</h3>
			  	<div class="active dl-jqrun contour-1" style="height: 225px;">
					<div class="clear"></div>
					<div style="margin:0px 0"></div>
					<div class="easyui-calendar" style="width:270px;height:235px;"></div>
				</div>
			</div>
			<div class="clear"></div>
		  	<!-- 车协公告 -->
			<div class="index-news style-1">
				<h3 class="title">
					<span class="myCorner" data-corner="top 5px" style="border-top-left-radius: 5px; border-top-right-radius: 5px;">车协公告</span>
					<a href="Notice.jsp" class="more" title="链接关键词">更多&gt;&gt;</a>
				</h3>
					<div class="active clear listel contour-2" style="height: 300px;">
						<ol class="list-none metlist">
							<li class="list top"><span class="time">2012-07-17</span><a href="Template.jsp">aaaaaaa</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">bbbbbb</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">cccccccc</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">dddddddddd</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">eeeeeeeeeee</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">fffffffffffff</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">ggggggggggggg</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">hhhhhhhhhhhhh</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">iiiiiiiiiiiiii</a></li>
							<li class="list "><span class="time">2012-07-16</span><a href="Template.jsp">jjjjjjjjjjjjj</a></li>
						</ol>
					</div>
			</div>
		 	<!-- 日常活动 -->
			<div class="index-news style-1">
				<h3 class="title"><span class="myCorner" data-corner="top 5px" style="border-top-left-radius: 5px; border-top-right-radius: 5px;">日常活动</span><a href="queryDailyActivity" class="more" title="链接关键词">更多&gt;&gt;</a></h3>
					<div class="active clear listel contour-2" style="height: 300px;">
						<ol class="list-none metlist">
							<li class="list top"><span class="time"></span><a href="queryDailyActivity">日常训练</a></li>
							<li class="list "><span class="time"></span><a href="Activity2.jsp">假期拉练</a></li>
							<li class="list "><span class="time"></span><a href="Activity3.jsp">十一出行</a></li>
							<li class="list "><span class="time"></span><a href="Activity4.jsp">团队建设</a></li>
						</ol>
					</div>
			</div>
			<!-- 下载中心 -->
			<div class="index-conts style-2">
				<h3 class="title myCorner" data-corner="top 5px" style="border-top-left-radius: 5px; border-top-right-radius: 5px;">
					<a href="Download1.jsp" title="链接关键词" class="more">更多&gt;&gt;</a>下载中心
				</h3>
				<div class="active clear listel contour-2" style="height: 300px;">
					<ol class="list-none metlist">
						<li class="list top"><span class="time">2012-07-16</span><a href="#">uuuuuuuuuu</a></li>
						<li class="list "><span class="time">2012-07-16</span><a href="#">vvvvvvvvvv</a></li>
						<li class="list "><span class="time">2012-07-16</span><a href="#">wwwwwwwwwww</a></li>
						<li class="list "><span class="time">2012-07-16</span><a href="#">xxxxxxxxx</a></li>
						<li class="list "><span class="time">2012-07-16</span><a href="#">yyyyyyyyyyyy</a></li>
					</ol>
				</div>
			</div>
			<div class="clear p-line"></div>
			<div class="clear"></div>
			<!-- 友情链接 -->
			<div class="index-links">
				<h3 class="title">
					<a href="" title="链接关键词" class="more"></a>
				</h3>
				<div class="active clear">
					<div class="img">
						<ul class="list-none">
						</ul>
					</div>
					<div class="txt">
						<ul class="list-none">
							<li><a href="https://chexie.net/#main" target="_blank" title="">北大车协</a></li>
							<li><a href="http://cuca.hiwedo.cn/" target="_blank" title="">大自协</a></li>
							<li><a href="http://www.517318.com/portal.php" target="_blank" title="">川藏旅行</a></li>
							<li><a href="http://www.uccbikes.com/" target="_blank" title="">UCC官网</a></li>
							<li><a href="http://www.giant.com.cn/front/indexs" target="_blank" title="">捷安特官网</a></li>
						</ul>
					</div>
				</div>
				<div class="clear"></div>
			</div>
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