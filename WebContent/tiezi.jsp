<%@ page language="java" import="vo.*" import="dao.*" import="impl.*"
	import="model.*" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>tiezi</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<link href="resources/css/jquery-ui-themes.css" type="text/css"
	rel="stylesheet" />
<link href="resources/css/axure_rp_page.css" type="text/css"
	rel="stylesheet" />
<link href="data/styles.css" type="text/css" rel="stylesheet" />
<link href="files/tiezi/styles.css" type="text/css" rel="stylesheet" />
<style type="text/css">
#apDiv1 {
	position: absolute;
	left: 171px;
	top: 253px;
	height: 120px;
	z-index: 1;
}

#apDiv2 {
	position: absolute;
	left: 1051px;
	top: 563px;
	width: 137px;
	height: 71px;
	z-index: 2;
}

#apDiv3 {
	position: absolute;
	left: 170px;
	top: 961px;
	width: 2200px;
	height: 392px;
	z-index: 2;
}
</style>
<script src="resources/scripts/jquery-1.7.1.min.js"></script>
<script src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
<script src="resources/scripts/axure/axQuery.js"></script>
<script src="resources/scripts/axure/globals.js"></script>
<script src="resources/scripts/axutils.js"></script>
<script src="resources/scripts/axure/annotation.js"></script>
<script src="resources/scripts/axure/axQuery.std.js"></script>
<script src="resources/scripts/axure/doc.js"></script>
<script src="data/document.js"></script>
<script src="resources/scripts/messagecenter.js"></script>
<script src="resources/scripts/axure/events.js"></script>
<script src="resources/scripts/axure/action.js"></script>
<script src="resources/scripts/axure/expr.js"></script>
<script src="resources/scripts/axure/geometry.js"></script>
<script src="resources/scripts/axure/flyout.js"></script>
<script src="resources/scripts/axure/ie.js"></script>
<script src="resources/scripts/axure/model.js"></script>
<script src="resources/scripts/axure/repeater.js"></script>
<script src="resources/scripts/axure/sto.js"></script>
<script src="resources/scripts/axure/utils.temp.js"></script>
<script src="resources/scripts/axure/variables.js"></script>
<script src="resources/scripts/axure/drag.js"></script>
<script src="resources/scripts/axure/move.js"></script>
<script src="resources/scripts/axure/visibility.js"></script>
<script src="resources/scripts/axure/style.js"></script>
<script src="resources/scripts/axure/adaptive.js"></script>
<script src="resources/scripts/axure/tree.js"></script>
<script src="resources/scripts/axure/init.temp.js"></script>
<script src="files/tiezi/data.js"></script>
<script src="resources/scripts/axure/legacy.js"></script>
<script src="resources/scripts/axure/viewer.js"></script>
<script type="text/javascript">
	$axure.utils.getTransparentGifPath = function() {
		return 'resources/images/transparent.gif';
	};
	$axure.utils.getOtherPath = function() {
		return 'resources/Other.html';
	};
	$axure.utils.getReloadPath = function() {
		return 'resources/reload.html';
	};
</script>
</head>
<body>
	<div id="base" class="">

		<!-- Unnamed (形状) -->
		<div id="u0" class="ax_形状">
			<img src="images/tiezi/u0.png" height="1284" class="img " id="u0_img" />
			<!-- Unnamed () -->
			<div id="u1" class="text"></div>
		</div>

		<!-- Unnamed (流程形状) -->
		<!-- Unnamed (图片) -->
		<div id="u4" class="ax_图片">
			<img id="u4_img" class="img " src="images/login/u0.png" />
			<!-- Unnamed () -->
			<div id="u5" class="text"></div>
		</div>

		<!-- Unnamed (水平线) -->
		<!-- Unnamed (水平线) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<div id="u10" class="ax_文本">
			<!-- Unnamed () -->
		</div>

		<!-- Unnamed (形状) -->
		<div id="u12" class="ax_文本">
			<!-- Unnamed () -->
		</div>

		<!-- Unnamed (形状) -->
		<div id="u14" class="ax_文本">
			<!-- Unnamed () -->
		</div>

		<!-- Unnamed (形状) -->
		<div id="u16" class="ax_文本">
			<!-- Unnamed () -->
		</div>

		<!-- Unnamed (图片) -->
		<!-- Unnamed (水平线) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<div id="u23" class="ax_文本">
			<img id="u23_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u24" class="text">
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">楼主</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (图片) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<div id="u33" class="ax_文本">
			<img id="u33_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u34" class="text">
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">用户在线</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u35" class="ax_文本">
			<img id="u35_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u36" class="text">
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">个</span><span
						style="font-family: 'Applied Font Regular', 'Applied Font';">人中心
						<% 
						                            	 String userno = request.getParameter("userno");
				LoginDAO loginDAO = new LoginDAOImpl();
				String type = loginDAO.rtLoginType(userno);
				out.println("<a href=\"http://172.17.201.21:8080/X-Plan/LoginTypeCheck?&userno="+ userno + "\">"+userno+"</a>");
				
			%>
					</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u37" class="ax_文本">
			<img id="u37_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u38" class="text">
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">退</span><span
						style="font-family: 'Applied Font Regular', 'Applied Font';">出</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u39" class="ax_图片">
		<% 
				String type2 = loginDAO.rtLoginType(userno);
				NormalUserDAO nmudao = new NormalUserDAOImpl();
				String img = null;
				if(type2.equals("normal")||type2.equals("NORMAL"))
				{
				NormalUserVO nm = nmudao.rtNUserInfo(userno);
				img=nm.getImage();
				}
				else if(type2.equals("manager")||type2.equals("MANAGER"))
				{
					img="images\\tiezi\\u71.gif";
				}
				else if(type2.equals("teacher")||type2.equals("TEACHER"))
				{
					img="images\\tiezi\\u73.gif";
				}%>
		
			<img id="u39_img" class="img " 
			<% out.println("src=\""+img+"\""); %>
			/>
			<!-- Unnamed () -->
			<div id="u40" class="text"></div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u41" class="ax_文本">
			<img id="u41_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->
			<div id="u42" class="text">
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">用</span><span
						style="font-family: 'Applied Font Regular', 'Applied Font';">户组：</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u43" class="ax_文本">
			<img id="u43_img" class="img " src="resources/images/transparent.gif" />
			<!-- Unnamed () -->

			<div id="u44" class="text">
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">
						<%
					out.println(""+type+"");
					%>
					</span>
				</p>
				<p>
					<span style="font-family: 'Applied Font Regular', 'Applied Font';">&nbsp;</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (水平线) -->
		<div id="u45" class="ax_水平线">
			<img id="u45_start" class="img "
				src="resources/images/transparent.gif" alt="u45_start" /> <img
				id="u45_end" class="img " src="resources/images/transparent.gif"
				alt="u45_end" /> <img id="u45_line" class="img "
				src="images/tiezi/u6_line.png" alt="u45_line" />
		</div>

		<!-- Unnamed (水平线) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (水平线) -->
		<!-- Unnamed (水平线) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (形状) -->
		<!-- Unnamed (水平线) -->
		<!-- Unnamed (水平线) -->
		<!-- Unnamed (流程形状) -->
		<!-- Unnamed (图片) -->
		<!-- Unnamed (图片) -->
		<div id="u73" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u74" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u75" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u76" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u77" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u78" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u79" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u80" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u81" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u82" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u83" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u84" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u85" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u86" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u87" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u88" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u89" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u90" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u91" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u92" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u93" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u94" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u95" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u96" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u97" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u98" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u99" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u100" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u101" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u102" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u103" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u104" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u118" class="ax_图片">
			<!-- Unnamed () -->
			<div id="u119" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<!-- Unnamed (图片) -->
		<div id="u122" class="ax_图片">
			<img id="u122_img" class="img " src="images/tiezi/u122.jpg" />
			<!-- Unnamed () -->
			<div id="u123" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u124" class="ax_图片">
			<img id="u124_img" class="img " src="images/tiezi/u124.png" />
			<!-- Unnamed () -->
			<div id="u125" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u126" class="ax_图片">
			<img id="u126_img" class="img " src="images/tiezi/u126.jpg" />
			<!-- Unnamed () -->
			<div id="u127" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u128" class="ax_图片">
											<%
					out.println("<a");
					out.println("href=\"http://172.17.201.21:8080/X-Plan/qunzu.jsp?userno="
							+ userno + "\">返回论坛</a>");
				%>
			<!-- Unnamed () -->
			<div id="u129" class="text"></div>
		</div>

		<!-- Unnamed (图片) -->
		<div id="u130" class="ax_图片">
			<img id="u130_img" class="img " src="images/tiezi/u126.jpg" />
			<!-- Unnamed () -->
			<div id="u131" class="text"></div>
		</div>

		<!-- Unnamed (菜单) -->
		<div id="u132" class="ax_菜单">
			<img id="u132_menu" class="img " src="images/zhuce/u35_menu.png"
				alt="u132_menu" />

			<!-- Unnamed (表格) -->
			<div id="u133" class="ax_表格">

				<!-- Unnamed (菜单项) -->
				<div id="u134" class="ax_表格单元">
					<img id="u134_img" class="img " src="images/zhuce/u37.png" />
					<!-- Unnamed () -->
					<div id="u135" class="text"></div>
				</div>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u136" class="ax_形状">
			<img id="u136_img" class="img " src="images/zhuce/u39.png" />
			<!-- Unnamed () -->
			<div id="u137" class="text">
				<p>
					<span style="font-family: 'Applied Font Bold', 'Applied Font';">					<%
					out.println("<a href = \"http://172.17.201.21:8080/X-Plan/luntan.jsp?userno="+ userno + "\">首页</a>");
					%></span>
				</p>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u138" class="ax_形状">
			<img id="u138_img" class="img " src="images/zhuce/u41.png" />
			<!-- Unnamed () -->
			<div id="u139" class="text">
				<p>
					<span style="font-family: 'Applied Font Bold', 'Applied Font';">在线教育</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u140" class="ax_形状">
			<img id="u140_img" class="img " src="images/zhuce/u43.png" />
			<!-- Unnamed () -->
			<div id="u141" class="text">
				<p>
					<span style="font-family: 'Applied Font Bold', 'Applied Font';">快</span><span
						style="font-family: 'Applied Font Bold', 'Applied Font';">捷导航</span>
				</p>
			</div>
		</div>

		<!-- Unnamed (形状) -->
		<div id="u142" class="ax_形状">
			<img id="u142_img" class="img " src="images/zhuce/u45.png" />
			<!-- Unnamed () -->
			<div id="u143" class="text">
				<p>
					<span style="font-family: 'Applied Font Bold', 'Applied Font';">论坛</span>
				</p>
			</div>
		</div>
	</div>
	<%
		String noteno = request.getParameter("noteno");
	%>
	<div id="apDiv1">
		<table width="1011" height="630" border="1" cellpadding="0"
			cellspacing="0" bgcolor="#FFFFFF">

			<%
		NoteDAO noteDAO = new NoteDAOImpl();
		Note note = noteDAO.loadNote(noteno);
		
		NoteDetailsDAO noteDetailsDAO = new NoteDetailsDAOImpl();
		%>

			<!-- 楼主 -->
			<tr>
				<%
				out.println("<td width=\"274\" height=\"57\">1L:&nbsp;"+note.getWriter()+"</td>");
				out.println("<td width=\"731\">&nbsp;"+note.getTime()+"</td>");
				type2 = loginDAO.rtLoginType(note.getWriter());
				nmudao = new NormalUserDAOImpl();
				img = null;
				if(type2.equals("normal")||type2.equals("NORMAL"))
				{
				NormalUserVO nm = nmudao.rtNUserInfo(note.getWriter());
				img=nm.getImage();
				}
				else if(type2.equals("manager")||type2.equals("MANAGER"))
				{
					img="images\\tiezi\\u71.gif";
				}
				else if(type2.equals("teacher")||type2.equals("TEACHER"))
				{
					img="images\\tiezi\\u73.gif";
				}
				%>
			</tr>
			<tr>
				<%
				out.println("<td height=\"266\">&nbsp;<img class=\"img \" src=\""+img+"\"/></td>");
				out.println("<td>&nbsp;"+note.getFcontext()+"</td>");%>
			</tr>

			<!-- for 回帖 -->
			<% 
	
			TeacherDAO tcdao = new  TeacherDAOImpl();
			for (NoteDetails noteDetails : noteDetailsDAO.listSortedNtDtils(noteno))
			{
			out.println("<tr><td height=\"57\">"+noteDetails.getFloor()+"L:&nbsp;"+noteDetails.getWriter()+"</td><td>&nbsp;"+noteDetails.getTime()+"</td></tr>");
			String img2 = null;
			type2 = loginDAO.rtLoginType(noteDetails.getWriter());
			if(type2.equals("normal")||type2.equals("NORMAL"))
			{
			NormalUserVO nm = nmudao.rtNUserInfo(noteDetails.getWriter());
			img2=nm.getImage();
			}
			else if(type2.equals("manager")||type2.equals("MANAGER"))
			{
				img2="images\\tiezi\\u71.gif";
			}
			else if(type2.equals("teacher")||type2.equals("TEACHER"))
			{
				img2="images\\tiezi\\u73.gif";
			}
			out.println("<tr><td height=\"248\">&nbsp;<img class=\"img \" src=\""+img2+"\"/></td><td>&nbsp;"+noteDetails.getContext()+"</td></tr>");
			}
			%>
		</table>
		<p>&nbsp;</p>
		<% 
		out.println("<form name = \"notedetailscomit\" action=\"SaveNoteDetails?noteno="+noteno+"&writer="+userno+"\" method=\"post\"> ");
		%>
		<div>
			</input>
		</div>
		<div>主要内容：</div>
		<p>
			<textarea name="contexts" rows="20" cols="100">主要内容</textarea>
		</p>
		<p>
			<%
					out.println("发帖人：<a");
					out.println("href=\"http://172.17.201.21:8080/X-Plan/LoginTypeCheck?userno="
							+ userno + "\">" + userno + "</a>");
				%>
		</p>
		<div>
			<input type="submit" value="发帖" />
			<!--表单数据提交按钮,点击将把其所在的form的数据提交到action位置-->
			<input type="reset" value="清空" />
		</div>
		</form>
	</div>


</body>
</body>
</html>