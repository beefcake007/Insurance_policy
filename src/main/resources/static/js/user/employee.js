function jundgeEmail(temp)
{
    if(temp == null || temp == "")
    {
        return true;
    }
    var jundge = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
    if(!jundge.test(temp))
    {
        return false;
    }
    return true;
}

function jundgePhone(temp)
{
    var regTel = /^0?1[3|4|5|8][0-9]\d{8}$/;
    if(!regTel.test(temp))
    {
        return false;
    }
    return true;
}

function jundgeSFZ(temp)
{
    var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    if(!reg.test(temp))
    {
        return false;
    }
    return true;
}

function jundge()
{
    var employeeId = $("input[name=employeeId]").val();
    if(employeeId == null || employeeId == "")
    {
        alert("请输入员工账号！");
        return false;
    }
    var employeeName = $("input[name=employeeName]").val();
    if(employeeName == null || employeeName == "")
    {
        alert("请输入员工名称！");
        return false;
    }
    var employeePwd = $("input[name=employeePwd]").val();
    if(employeePwd == null || employeePwd == "")
    {
        alert("请输入员工密码！");
        return false;
    }
    var employeeSex = $("input[name=employeeSex]:checked").val();
    if(employeeSex == null || employeeSex == "")
    {
        alert("请选择员工性别！");
        return false;
    }
    var employeeAge = $("input[name=employeeAge]").val();
    if(employeeAge == null || employeeAge == "")
    {
        alert("请输入员工年龄！");
        return false;
    }
    var employeePhone = $("input[name=employeePhone]").val();
    if(employeePhone == null || employeePhone == "")
    {
        alert("请输入员工电话！");
        return false;
    }
    if(!jundgePhone(employeePhone))
    {
        alert("请输入正确的电话格式！");
        return false;
    }
    var employeeMail = $("input[name=employeeMail]").val();
    if(!jundgeEmail(employeeMail))
    {
        alert("请输入正确的邮箱格式！");
        return false;
    }
    var employeePosition = $("input[name=employeePosition]").val();
    if(employeePosition == null || employeePosition == "")
    {
        alert("请输入员工职位！");
        return false;
    }
    var employeeJob = $("input[name=employeeJob]").val();
    if(employeeJob == null || employeeJob == "")
    {
        alert("请输入员工岗位！");
        return false;
    }
    var employeeCardId = $("input[name=employeeCardId]").val();
    if(employeeCardId == null || employeeCardId == "")
    {
        alert("请输入员工身份证！");
        return false;
    }
    if(!jundgeSFZ(employeeCardId))
    {
        alert("请输入正确的身份证号码！");
        return false;
    }
    return true;
}