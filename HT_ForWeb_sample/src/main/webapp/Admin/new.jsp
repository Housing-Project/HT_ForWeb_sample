<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>添加新闻</title>
 <script type="text/javascript" src="./ueditor/ueditor.config.js"></script>
 <script type="text/javascript" src="./ueditor/ueditor.all.js"></script>
 <link rel="stylesheet" type="text/css" href="./udeditor/themes/default/css" />
 
 </head>
 <body id="body" >
 <form action=" " method=" ">
 <table border="0" id="table">
 <tr>
 <td width="10%"></td>
 <td width="90%"> 
 <table border="0" id="table">
 <tr>
 <td>新闻标题</td> <td><input type="text" name="headtitle"></td>
 </tr>
 
 <tr>
 <td> </td>
 <td>
 <div align="center" style="width:80%"> 
 <textarea id="newsEditor" name="content" style="height: 80%"></textarea> 
 <br/> 
 <input type="submit" value="发 布"> 
 <script type="text/javascript">
 UE.getEditor('newsEditor');
 // var content = UE.getPlainTxt();//content就是编辑器的带格式的内容
 //focus时自动清空初始化时的内容
 
 </script> 
 </div>
 
 </td>
 <td> </td>
 </tr>
 </table> 
 </form>
 </body>
</html>