var editor;

var E = window.wangEditor;
editor = new E('#editor');
// 或者 var editor = new E( document.getElementById('editor') )
editor.customConfig.uploadImgServer='/wiki/upload';     //上传URL
editor.customConfig.uploadImgMaxSize=10*1024*1024;
editor.customConfig.uploadFileName='fileName';
editor.create();

function getContent(){
    var content=editor.txt.html();
    alert(content);
}