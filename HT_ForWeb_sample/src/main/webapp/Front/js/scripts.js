jQuery(document).ready(function () {
  jQuery("#jquery-accordion-menu").jqueryAccordionMenu();
});

$(function(){
//顶部导航切换
//floors(1);
$("#demo-list li").click(function(){
  $("#demo-list li.active").removeClass("active")
  $(this).addClass("active");
})
})



function  inputs(num) {


layui.use('layer', function(){
var layer = layui.layer;
layer.prompt(function(val, index){
  if(num=='1'){
  layer.msg('用地面积：'+val);
  layer.close(index);
  }
  else {
    layer.msg('楼层数：'+val);
    layer.close(index);
  

  }
}
);

});


}



function showimg(){
$("#imgz").empty();
disButton('button1');
disButton('button2');
console.log("showimg");
$("#imgz").append(


'<div style="  border:1px solid;flex:1;display:flex;flex-direction:row">'+
  '<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1;" onClick=" HugeImg(1)" ><img src="./img/project/Unit_1.jpg" alt="方案1" height="100%" width="100%"/></div>'+
  '<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1;" onClick=" HugeImg(2)"><img  src="./img/project/Unit_2.jpg" alt="方案2"  height="100%" width="100%"/></div>'+
'</div>'+
'<div style="border:1px solid;flex:1;display:flex;flex-direction:row">'+
'<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1;" onClick=" HugeImg(3)"><img  src="./img/project/Unit_3.jpg" alt="方案3"  height="100%" width="100%"/></div>'+
'<div class="layui-anim layui-anim-fadein" style="  border:1px solid;flex:1;" onClick=" HugeImg(4)"><img  src="./img/project/Unit_4.jpg" alt="方案4"  height="100%" width="100%"/></div>'+
'</div>'
);



}
function showElevation(){
$("#imgz").empty();
disButton('button1');
disButton('button2');
$("#imgz").append(


'<div style="  border:1px solid;flex:1;display:flex;flex-direction:row">'+
  '<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1;" onClick=" HugeImg(5)" ><img src="./img/project/Elevation_5.jpg" alt="立面图" height="100%" width="100%"/></div>'+
  '<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1;" onClick=" HugeImg(6)"><img  src="./img/project/Elevation_6.jpg" alt="立面图"  height="100%" width="100%"/></div>'+
'</div>'+
'<div style="border:1px solid;flex:1;display:flex;flex-direction:row">'+
'<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1;" onClick=" HugeImg(7)"><img  src="./img/project/Elevation_7.jpg" alt="立面图"  height="100%" width="100%"/></div>'+
'<div class="layui-anim layui-anim-fadein" style="  border:1px solid;flex:1;" onClick=" HugeImg(8)"><img  src="./img/project/Elevation_8.jpg" alt="立面图"  height="100%" width="100%"/></div>'+
'</div>'
);



}


function HugeImg(val){
$("#imgz").empty();

if(val < 5){

$("#imgz").append(
'<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1; z-index:1"  ><img  src="./img/project/Unit_'+val+'.jpg" alt="方案'+val+'" height="100%" width="100%"/></div>'
);
enButton('button1');
disButton('button2');
}
if(val >= 5){
$("#imgz").append(
  '<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1; z-index:1"  ><img  src="./img/project/Elevation_'+val+'.jpg" alt="立面图" height="100%" width="100%"/></div>'
);
enButton('button2');
disButton('button1');
}

}
function disButton(str){

var obj = document.getElementById(str);
 //obj.className = "style2";
 obj.setAttribute("class", "no");
}
function enButton(str){
var obj = document.getElementById(str);
 //obj.className = "style2";
 obj.setAttribute("class", "layui-btn layui-btn-radius layui-btn-warm float-button");
}
function returns(str){
if (str==null) return ;
disButton('button1');
disButton('button2');
if(str=='button1'){
  showimg();
}
if(str=='button2') {
 showElevation();
}
}
function Isometric_Diagram(){
$("#imgz").empty();
$("#imgz").append(

  '<div class="layui-anim layui-anim-fadein" style=" border:1px solid;flex:1; z-index:1"  ><img  src="./img/project/Isometric_Diagram.jpg" alt="轴侧图" height="100%" width="100%"/></div>'
);

}
