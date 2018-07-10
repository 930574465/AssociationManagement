<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>与马者管理系统</title>
<link href="images/metinfo.css" rel="stylesheet" />
<script type="text/javascript" src="images/jQuery1.7.2.js"></script>
<script type="text/javascript" src="images/cookie.js"></script>
<script type="text/javascript">
function kzqie(my){
	if(my.text()=='宽版'){
		$('#metcmsbox').css('width','100%');
		$.ajax({url : 'include/config.php?lang=cn&met_kzqie=1',type: "POST"});
		my.attr('title','切换到窄版');
		my.text('窄版');
	}else{
		$('#metcmsbox').css('width','1000px');
		$.ajax({url : 'include/config.php?lang=cn&met_kzqie=0',type: "POST"});
		my.attr('title','宽版');
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
				您好 <a href="#" id="mydata" title="编辑 admin 的个人资料" class='tui' style="text-decoration:underline;">admin</a><span>-</span><a target="_top" href="#" id="outhome" title="退出" class='tui'>退出</a><span>|</span><a href="javascript:;" onclick="kzqie($(this))" title="切换到窄版">窄版</a>
			</div>
	      <div class="langs">

        <div class="langtxt">
			<div class="langkkkbox">
				<div id="langcig">
					<span id="langcion" title="cn">简体中文</span>
				  <span class="langqie">语言设置</span>
				</div>
				<div class="langlist shadow" style="display:none;"></div>
			</div>
			<div class="webyy">网站语言：</div>
		</div>

		  </div>
		</div>
		
	  </div>
    </div>
    <div class="floatl">
	    <a href="#" hidefocus="true" id="met_logo"><img src="images/logoen.gif" alt="MetInfo企业网站管理系统" title="MetInfo企业网站管理系统" /></a>
	</div>
</div>
<div id="content">
    <div class="floatl" id="metleft">
        <div class="fast">
	        <a  href="#" id="qthome" title="网站首页">网站首页</a>
			<span></span>
			<a href="#" id="hthome" title="后台首页">后台首页</a>
		</div>
	    <div class="nav_list" id="leftnav">

<ul  id="ul_1">
<li ><a href="gerenxinxi.jsp" target='main' id='nav_1_9' class="on" title="个人中心" hidefocus="true">个人中心</a></li>
<li ><a href="chengyuanguanli.jsp" target='main' id='nav_1_8'  title="用户管理" hidefocus="true">用户管理</a></li>
<li ><a href="Gonggao.jsp" target='main' id='nav_1_9' title="公告管理" hidefocus="true">公告管理</a></li>
<li ><a href="shouzhijilu.jsp" target='main' id='nav_1_10' title="收支记录" hidefocus="true">收支记录</a></li>
<li ><a href="ricahnghuodong.jsp" target='main' id='nav_1_11' title="日常活动" hidefocus="true">日常活动</a></li>
<li ><a href="xiehuixinxi.jsp" target='main' id='nav_1_11' title="信息管理" hidefocus="true">信息管理</a></li>
<li ><a href="zhiliao.jsp" target='main' id='nav_1_11' title="文件管理" hidefocus="true">文件管理</a></li>
<li ><a href="shijianzhou.jsp" target='main' id='nav_1_11' title="时间轴管理" hidefocus="true">时间轴管理</a></li>
</ul>
</div>
        
<div class="claer"></div>
<div class="left_footer">感谢使用 <a href="#" target="_blank">MetInfo</a><span class="none">Powered by <b><a href=http://www.metinfo.cn target=_blank>MetInfo 5.1.7</a></b> &copy;2008-2013 &nbsp;<a href=http://www.metinfo.cn target=_blank>MetInfo Inc.</a></span></div>
		
	</div>
    <div class="floatr" id="metright">
      <div class="iframe">
	    <div class="min"><iframe frameborder="0" id="main" name="main" src="gerenxinxi.jsp" scrolling="no"></iframe></div>
		</div>
    </div>
	<div class="clear"></div>
	</div>
</div>
<script src="images/metinfo.js" type="text/javascript"></script>

</body>
</html>

