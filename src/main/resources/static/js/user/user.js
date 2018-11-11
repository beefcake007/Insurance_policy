$(function(){
	
	$.ajax({
		type:"post",
		url:"/employee/employeeInfo",
		dataType:"json",
		contentType:"application/json",
		data:{},
		success:function(data){
			//alert(data.nickname);
			//$(".user_head_img").attr("src",data.headImage);
			$(".user_name").html(data.employeeName);
		}
	});
});