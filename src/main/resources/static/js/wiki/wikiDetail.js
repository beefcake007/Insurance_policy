Date.prototype.format = function(fmt) {
    var o = {
        "M+" : this.getMonth()+1,                 //月份
        "d+" : this.getDate(),                    //日
        "h+" : this.getHours(),                   //小时
        "m+" : this.getMinutes(),                 //分
        "s+" : this.getSeconds(),                 //秒
        "q+" : Math.floor((this.getMonth()+3)/3), //季度
        "S"  : this.getMilliseconds()             //毫秒
    };
    if(/(y+)/.test(fmt)) {
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
    }
    for(var k in o) {
        if(new RegExp("("+ k +")").test(fmt)){
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        }
    }
    return fmt;
}

$(function(){
    var name=window.location.href;
    urlStr=name.split("/");
    url="/wiki/"+urlStr[urlStr.length-2]+"/wikiDetail";

    $.ajax({
        type:"post",
        url:url,
        dataType:"json",
        contentType:"application/json",
        data:{},
        success:function(data){
            var title=document.getElementById("title");
            var page=data.wiki.title;
            title.innerHTML=page;
            var click=document.getElementById("title-next");
            var page2="楼主："+data.wiki.user.nickname+"&nbsp;&nbsp;时间："+new Date(data.wiki.publishDate).format("yyyy-MM-dd hh:mm:ss")+"&nbsp;&nbsp;点击："+data.wiki.click_num;
            click.innerHTML=page2;
            var content=document.getElementById("wiki-content");
            var page3=data.wiki.content;
            content.innerHTML=page3;

            if(data.success=="true"){
                var table=document.getElementById("wiki-comment");
                var tab="";
                data.wikiCommentList.forEach((item) => {
                    tab+="<div class='col-md-1 left'>";
                    tab+="<a href='#'><img src='"+item.user.head_image+"'></a>";
                    tab+="</div>";
                    tab+="<div class='col-md-11 right'>";
                    tab+="<h4>"+item.user.nickname+"</h4>";
                    tab+="<p>"+item.content+"</p>";
                    tab+="<p class='buttom'><a href='#'>评论("+item.commentNum+")</a></p>";
                    tab+="<span>"+new Date(item.commentDate).format("yyyy-MM-dd hh:mm:ss")+"</span>";
                    tab+="</div>";
                    tab+="<br>";
                });
                table.innerHTML=tab;
            }else{
                var table=document.getElementById("wiki-comment");
                var tab="暂无数据查询";
                table.innerHTML=tab;
            }
        }
    });
});