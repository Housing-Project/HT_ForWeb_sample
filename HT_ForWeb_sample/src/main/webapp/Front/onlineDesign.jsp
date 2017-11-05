<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
        <title>在线设计</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!--[if lte IE 7]>
        <link rel="stylesheet" type="text/css" href="css-files/ie-fix/ie67.css" />
        <![endif]--> 
        
        <!--[if IE 8]>
            <link rel="stylesheet" type="text/css" href="css-files/ie-fix/ie8.css">
        <![endif]--> 
        
        <!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
   
    <!-- Main CSS file -->
        <link rel="stylesheet" href="css/style.css" />


        <link rel="stylesheet" href="external/bootstrap/css/bootstrap.css"/> <!-- CSS: Bootstrap -->
        <link rel="stylesheet" type="text/css" href="css-files/getCss.css" /> <!-- CSS: Our css :)  -->
            
        <!-- jQuery -->    
        <script type="text/javascript" src="js/jquery.min.js"></script>    
        <script type="text/javascript" src="external/jquery-ui-1.8.21.custom.min.js"></script>  <!-- JS: effects core + fold and clip -->   
        
        <!-- JS -->
        <script type="text/javascript" src="js/scripts.js"></script><!-- Scripts -->
        
    <!-- design-demo -->
        <link href="css/jquery-accordion-menu.css" rel="stylesheet" type="text/css" />
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css" />
        <link href="js/css/layui.css" rel="stylesheet" type="text/css" />
        <link href="js/css/csss.css" rel="stylesheet" type="text/css" />
        <script src="js/jquery-accordion-menu.js" type="text/javascript"></script>
        <script src="js/layui.js" type="text/javascript"></script>
        <script src="js/onlDes.js" type="text/javascript"></script>

    </head>
    <body>

        
        <div class="container">
            <div class="row header">
                <div class="span4">
                     <!-- logo -->
                    <a href="">
                        <img class="logo" src="images/header/logo.png" alt="" style="width:207px;"/>
                    </a>
                </div>
                <div class="span8">
                    <!-- responsive dropdown menu -->
                    <div class="js-jquery-dropdown-wrapper">    
                        <ul class="js-jquery-dropdown">
                            
                            <li >
                                <a href="index-demo.jsp#header">首页</a>
                            </li>

                            <li class="">
                                <a href="news.jsp">新闻动态</a>
                            </li>

                            <!-- submenu -->
                            <li class="sub_menu menu-selected">
                                 <a href="onlineDesign.jsp">在线设计</a>
                                <!-- <ul>
                                    <li >
                                        <a href="index3b26.jsp?page=page_portofolio_new">农房住宅</a>
                                        <div class="dropdown-separator"></div>
                                    </li>
                                    <li >
                                        <a href=" ">城市住宅</a>
                                        <div class="dropdown-separator"></div>
                                    </li>
                                    <li class="menu-selected">
                                        <a href=" ">内装修设计</a>
                                    </li>
                                </ul> -->
                            </li>

                            <li class="sub_menu">
                                <a href="onlineDec.jsp">在线咨询</a>
                                <ul>
                                    <li >
                                        <a href="onlineDec.jsp#part1">农房工业化优势</a>
                                        <div class="dropdown-separator"></div>
                                    </li>
                                    <li >
                                        <a href="onlineDec.jsp#part2">建造过程解说等</a>
                                        <div class="dropdown-separator"></div>
                                    </li>
                                    <li class="menu-selected">
                                        <a href="onlineDec.jsp#part3">在线咨询</a>
                                    </li>
                                </ul>
                            </li>
                            
                            <li class="sub_menu">
                                <a href="Download.jsp">下载 </a>
                            </li>
                            
                            <li class="sub_menu">
                                <a href="index-demo.jsp#contact">联系方式</a>
                            </li>
                        </ul>
                        
                    </div> <!-- /menu -->
                </div>
            </div> <!-- /.row -->
        </div> <!-- /.container -->                
            
          
            
<div class="content father">
   <button class="no" id="button1" onclick="returns('button1')"> <i class="layui-icon">返回</i> </button>
   <button class="no" id="button2" onclick="returns('button2')"> <i class="layui-icon">返回</i> </button>
   <div class=" jquery-accordion-menu  son1" style="background-color:#fff;">
    <div id="jquery-accordion-menu" class="jquery-accordion-menu white ">
      <div class="jquery-accordion-menu-MENU">
      MENU
    </div>
     <ul id="demo-list">

      <li><a href="#"><i class="fa fa-glass"></i>输入用地面积 </a>
        <ul class="submenu">
          <li><a href="#"><input class="inpt" type="tel" placeholder="输入用地面积"/></a></li>
        </ul>
      </li>
      <li><a href="#"><i class="fa fa-glass"></i>输入建筑层数 </a>
        <ul class="submenu">
          <li data-c="isure"><a href="#"><input class="inpt" type="tel" placeholder="输入建筑层数"/></a></li>
        </ul>
      </li>
      <li><a href="#"><i class="fa fa-cog"></i>输入功能房 </a>
       <ul class="submenu">
        <li><a href="#">一层 </a>
         <ul class="submenu">
          <li><a href="#">客&nbsp;&nbsp;&nbsp;厅：&nbsp;&nbsp;&nbsp;<input type="text" class="inpt" /></a></li>
          <li><a href="#">卧&nbsp;&nbsp;&nbsp;室：&nbsp;&nbsp;&nbsp;<input type="text" class="inpt" /></a></li>
          <li><a href="#">厨&nbsp;&nbsp;&nbsp;房：&nbsp;&nbsp;&nbsp;<input type="text" class="inpt" /></a></li>
          <li><a href="#">洗手间：&nbsp;&nbsp; <input type="text" class="inpt" /></a></li>
         </ul> </li>
       </ul>
       <ul class="submenu">
        <li><a href="#">二层 </a>
         <ul class="submenu">
          <li><a href="#">客&nbsp;&nbsp;&nbsp;厅：&nbsp;&nbsp;&nbsp;<input type="text" class="input_type" /></a></li>
          <li><a href="#">卧&nbsp;&nbsp;&nbsp;室：&nbsp;&nbsp;&nbsp;<input type="text" class="input_type" /></a></li>
          <li><a href="#">厨&nbsp;&nbsp;&nbsp;房：&nbsp;&nbsp;&nbsp;<input type="text" class="input_type" /></a></li>
          <li><a href="#">洗手间：&nbsp;&nbsp; <input type="text" class="input_type" /></a></li>
         </ul> </li>
       </ul> </li>
      <li><a href="#" onclick="showimg()"><i class="fa fa-home"></i>一键布置户型 </a></li>
      <li><a href="#" onclick="Isometric_Diagram()"><i class="fa fa-suitcase"></i>生成轴测图 </a></li>
      <li><a href="#" onclick="showElevation()"><i class="fa fa-suitcase"></i>生成立面图 </a></li>
     </ul>
    </div>
   </div>
   <div class="son2 box_column" id="imgz">
   </div>
</div>



    <!-- FOOTER -->
    <footer id="footer">
        <div class="container">
            <div class="row">
                <!-- SOCIAL ICONS -->
                <div class="text-center">
                        <a href="index-demo.jsp#header">首页</a>
                    
                    |
                        <a href="news.jsp">新闻动态</a>
                    |
                         <a href="onlineDesign.jsp">在线设计 </a>
                    |
                        <a href="onlineDec.jsp">在线咨询</a>
                    |
                        <a href="Download.jsp">下载 </a>
                    <br/>
                </div>
                <div class="text-center">
                    <p class=""><i class="fa fa-map-marker"></i> <strong> 地址： </strong> 宁波市江北区风华路 201号 宁波工程学院 建筑与交通工程学院大楼 B310</p>
                    <p>Copyright &copy; 2017.11.1 XXXX公司保留所有权利</p>
                </div>
            </div>
        </div>
    </footer>
    <!-- /FOOTER -->
</body>
</html>
