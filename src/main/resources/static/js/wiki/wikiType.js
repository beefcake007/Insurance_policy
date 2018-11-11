$(function(){
	
	$.ajax({
		type:"post",
		url:"/wikiType/list",
		dataType:"json",
		contentType:"application/json",
		data:{},
		success:function(data){
			//$(".user_head_img").attr("src",data.headImage);
            var table=document.getElementById("list-group");
            var tab="";
            data.forEach((item) => {
                tab+="<button type='button' class='list-group-item'><a href='javascript:pageCurrent(\"/wiki/"+item.type_id+"/1/list\")'><span class='glyphicon glyphicon-star'></span>"+item.typeName+"</a></button>";
			});
            table.innerHTML=tab;
		}
	});
});