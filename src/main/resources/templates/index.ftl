<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">
    <#include "../common/nav.ftl">

    <#--主要内容content-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form role="form" method="post" action="">
                        <div class="form-group">
                            <label>姓名</label>
                            <input name="employeeName" type="text" class="form-control" value="${(employee.employeeName)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>性别</label>
                            <input name="employeeSex" type="text" class="form-control" value="${(employee.employeeSex)!''}"/>
                        </div>
                        <button type="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>