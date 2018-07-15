<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta http-equiv="Expires" content="0"/>
<meta http-equiv="Pragma" content="no-cache"/>
<meta http-equiv="Cache-control" content="no-cache"/>
<meta http-equiv="Cache" content="no-cache"/>


<title>与马者管理系统</title>
<link href="images/metinfo.css" rel="stylesheet" />
<script type="text/javascript" src="images/jQuery1.7.2.js"></script>
<script type="text/javascript" src="images/cookie.js"></script>
<script type="text/javascript">
	function kzqie(my) {
		if (my.text() == '宽版') {
			$('#metcmsbox').css('width', '100%');
			$.ajax({
				url : 'include/config.php?lang=cn&met_kzqie=1',
				type : "POST"
			});
			my.attr('title', '切换到窄版');
			my.text('窄版');
		} else {
			$('#metcmsbox').css('width', '1000px');
			$.ajax({
				url : 'include/config.php?lang=cn&met_kzqie=0',
				type : "POST"
			});
			my.attr('title', '宽版');
			my.text('宽版');
		}
	}
</script>
</head>


<body id="indexid">
	<div id="metcmsbox">
		<div id="top">
			<div class="floatr">
				<div class="top-r-box">
					<div class="top-right-boxr">
						<div class="top-r-t">
							您好 <a href="redirectBackstage" title=""
								class='tui' style="text-decoration:underline;">${loginedUser.name}</a><span>-</span><a
								target="_top" href="logoutUser" id="outhome" title="退出" class='tui'>退出</a><span>|</span><a
								href="javascript:;" onclick="kzqie($(this))" title="切换到窄版">窄版</a>
						</div>
						<div class="langs">

							<div class="langtxt">
								<div class="langkkkbox">
									<div class="langlist shadow" style="display:none;"></div>
								</div>
							</div>

						</div>
					</div>

				</div>
			</div>
			<div class="floatl">
				<img src="images/logo.png" alt="MetInfo企业网站管理系统"
					title="MetInfo企业网站管理系统" />
			</div>
		</div>
		<div id="content">
			<div class="floatl" id="metleft">
				<div class="fast">
					<a href="../index.jsp" id="qthome"
						title="网站首页">网站首页</a> <span></span> <a
						href="redirectBackstage" title="后台首页">后台首页</a>
				</div>
				<div class="nav_list" id="leftnav">

					<ul id="ul_1">
						<li><a href="gerenzhongxin.jsp" target='main' id='nav_1_9'
							class="on" title="个人中心" hidefocus="true">个人中心</a></li>
						<c:forEach items="${permissionSet}" var="permission">
							<c:if test="${permission.id == 1}">
								<li><a href="queryByPageUser" target='main' id='nav_1_8'
									title="用户管理" hidefocus="true">用户管理</a></li>
							</c:if>
						</c:forEach>
						<c:forEach items="${permissionSet}" var="permission">
							<c:if test="${permission.id == 2}">
								<li><a href="queryByPageMoney" target='main' id='nav_1_10'
									title="收支记录" hidefocus="true">收支记录</a></li>
							</c:if>
						</c:forEach>
						<c:forEach items="${permissionSet}" var="permission">
							<c:if test="${permission.id == 3}">
								<li><a href="queryByPageNotice" target='main' id='nav_1_9'
									title="公告管理" hidefocus="true">公告管理</a></li>
							</c:if>
						</c:forEach>
						<c:forEach items="${permissionSet}" var="permission">
							<c:if test="${permission.id == 4}">
								<li><a href="queryByPageFile" target='main' id='nav_1_11'
									title="文件管理" hidefocus="true">文件管理</a></li>
							</c:if>
						</c:forEach>
						<c:forEach items="${permissionSet}" var="permission">
							<c:if test="${permission.id == 5}">
								<li><a href="queryAllDailyActivity" target='main' id='nav_1_11'
									title="日常活动" hidefocus="true">日常活动</a></li>
								<li><a href="queryAllAssociationInfo" target='main' id='nav_1_11'
									title="信息管理" hidefocus="true">信息管理</a></li>
								<li><a href="queryAllContactActiion" target='main' id='nav_1_11'
									title="联系方式" hidefocus="true">联系方式</a></li>
								<li><a href="queryAllKeyEventAction" target='main'
									id='nav_1_11' title="时间轴管理" hidefocus="true">时间轴管理</a></li>
							</c:if>
						</c:forEach>
					</ul>
				</div>

				<div class="claer"></div>
			</div>
			<div class="floatr" id="metright">
				<div class="iframe">
					<div class="min">
						<iframe frameborder="no" id="main" name="main"
							src="gerenzhongxin.jsp" scrolling="no" border="0"></iframe>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<script src="images/metinfo.js" type="text/javascript"></script>

</body>
</html>

