$(function () {
    $.ajax({
        type:"post",
        url:"/wiki/recommend/list",
        dataType:"json",
        contentType:"application/json",
        data:{},
        success:function(data){
            var recommend=document.getElementById("recommend");
            var re="";
            re+="<span class='glyphicon glyphicon-eye-open'></span> <span class='head'>精品推荐</span>";
            data.forEach((item) => {
                re+="<h5><a href='/wiki/"+item.wiki_id+"/detail'>"+item.title+"</a></h5>";
            });
            re+="<embed wmode='transparent' src='http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf' quality='high' bgcolor='#ffffff' width='160' height='70' name='honehoneclock' align='middle' allowscriptaccess='always' type='application/x-shockwave-flash' pluginspage='http://www.macromedia.com/go/getflashplayer'>";
            recommend.innerHTML=re;
        }
    });
});