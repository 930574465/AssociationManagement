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
						<li id="nav_3" style="width:138px;" class="navdown"><a href="Activity1.jsp" class="hover-none nav"><span>日常活动</span></a></li>
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
				<h3 class='title myCorner' data-corner='top 5px'>日常活动</h3>
				<div class="active" id="sidebar" data-csnow="2" data-class3="0" data-jsok="2">
					<dl class="list-none navnow">
						<dt id='part2_4'>
							<a href='Activity1.jsp' title='协会介绍 ' class="zm"><span>日常训练</span></a>
						</dt>
					</dl>
					<dl class="list-none navnow">
						<dt id='part2_5'>
							<a href='Activity2.jsp' title='部门介绍' class="zm"><span>假期拉练</span></a>
						</dt>
					</dl>
					<dl class="list-none navnow">
						<dt id='part2_5'>
							<a href='Activity3.jsp' title='规章制度' class="zm"><span>十一出行</span></a>
						</dt>
					</dl>
					<dl class="list-none navnow">
						<dt id='part2_5'>
							<a href='Activity4.jsp' title='假期远征' class="zm"><span>团队建设</span></a>
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
							<a href="Activity1.jsp">日常活动</a> >&nbsp;十一出行
						</div>
					<span>日常活动</span>
				</h3>
				<div class="clear"></div>
				<div class="active" id="shownews">
					<h1 class="title">十一出行</h1>
					<div class="editor">
						<div>
							<div>&nbsp; &nbsp;
								&nbsp;网站关键词是SEO优化的核心，关键词的选择将直接影响网站优化推广效果及网站的价值，选择关键词应该注意一下几点：</div>
							<div>&nbsp;</div>
							<ol>
								<li><span style="font-size:13px;"><strong>考虑用户搜索习惯</strong><span
										style="font-size:12px;">，</span></span>而并非企业名称或产品名称，尤其是对于一种新的产品，当市场还没有人知道的时候，自然不会有人去搜索这个关键词，因此选择关键词首先就应该去分析你的目标群体会在搜索引擎中搜索哪些关键词，而你应该选择那些与你的产品相关并能为你的销售带来帮助的关键词。<br />
									&nbsp;</li>
								<li>中小企业切忌<span style="font-size:13px;"><strong>不要将自己的公司名称或品牌作为主要关键词</strong><span
										style="font-size:12px;">，</span></span>因为在你的目标群体中，很多人是没有听说过你的公司和品牌的，小企业做产品，对于中小企业来说，客户一般都是通过产品和服务来了解你的公司和品牌的，因此，网站关键词如果设置为公司名称，则不能达到良好的营销效果。<br />
									&nbsp;
								</li>
								<li><span style="font-size:13px;"><strong>关键词不宜过长</strong><span
										style="font-size:12px;">，</span></span>太长的关键词很少会有人搜索；点击量不宜太热，点击量太大搜索的人越多那么竞争也就会越激烈；同时关键词也不能太冷门，冷门关键词排到第一位也不会有多少人搜索访问，具体可以参考&ldquo;百度指数&rdquo;中的关键词访问量。<br />
									&nbsp;</li>
								<li>碰到热门关键词时，<span style="font-size:13px;"><strong>最好在关键词前面或后面加上地域限制</strong></span>，譬如&ldquo;塑钢门窗&rdquo;，这个关键词竞争是非常激烈，但是&ldquo;长沙塑钢门窗&rdquo;就比较好做了，而且如果你做的是有地域限制的业务，那么其他地方搜索到你的网站也没有多大意义。<br />
									&nbsp;
								</li>
								<li><span style="font-size:13px;"><strong>标题关键词应该控制在1-3个之间</strong></span>，除非第四个以后的关键词是比较冷门的，否则在标题中添加多个关键词是没有任何意义的，反而会影响主关键词的排名。<br />
									&nbsp;</li>
							</ol>
							<div id="metinfo_additional"></div>
						</div>
						<div class="clear"></div>
					</div>
					<div class="met_hits">
						点击次数：<span><script language='javascript'
								src='../include/hits.php?type=news&id=10'></script></span>&nbsp;&nbsp;更新时间：2012-07-17
						16:53:59&nbsp;&nbsp;&nbsp;&nbsp;
					</div>
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
					<a href="Activity1.jsp" title="日常活动">日常活动</a><span>|</span>
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