$(function () {
    $.ajax({
        type:"post",
        url:"/wikiType/list",
        dataType:"json",
        contentType:"application/json",
        data:{},
        success:function(data){
            //$(".user_head_img").attr("src",data.headImage);
            var table=document.getElementById("selectWikiType");
            var tab="";
            data.forEach((item) => {
                tab+="<option value='"+item.type_id+"'>"+item.typeName+"</option>";
        });
            table.innerHTML=tab;
        }
    });
});

function pageCurrent(url) {
    $.ajax({
        type:"post",
        url:url,
        dataType:"json",
        contentType:"application/json",
        data:{},
        success:function(data){
            if(data.success=="true"){
                var table=document.getElementById("list-group2");
                var tab="";
                data.wikiList.forEach((item) => {
                    tab+="<a href='/wiki/"+item.wiki_id+"/detail' class='list-group-item'><span class='badge'>"+item.click_num+"</span>"+item.title+"</a>";
                });
                table.innerHTML=tab;
                var pageCurrent=document.getElementById("pagecurrent");
                var page=data.page;
                pageCurrent.innerHTML=page;
            }else{
                var table=document.getElementById("list-group2");
                var tab="暂无数据查询";
                table.innerHTML=tab;
            }
        }
    });
}
