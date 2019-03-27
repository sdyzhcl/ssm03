$(document).ready(function () {
    $("#logout").click(function () {
        $.ajax({
            url:"/ssm01/user/logout",
            data:"",
            dataType:"text",
            type:"post",
            success:function (data) {
                alert(data);
                if(data=="注销成功"){
                    self.location.href="/ssm01/jsp/login.jsp"
                }
            },
            error:function () {
                alert("由于网络原因，注销失败");
            }
        });
        //强制阻止所有事件
        return false;
    });
});