$(document).ready(function () {
    var username;
    var password;
    var auth;

    //用户名输入框失去焦点事件
    $("#userName").blur(function () {
        username = $(this).val();
        var zz1 = /^[a-zA-Z0-9_]{5,10}$/;
        if(username==null || username==""){
            $("#span1").html("用户名不能为空");
        }else if(!zz1.test(username)){
            $("#span1").html("用户名只能是字母/数字/_(5-10位)");
        }else{
            $("#span1").html("");
        }
    });

    //密码输入框失去焦点事件
    $("#passWord").blur(function () {
        password = $(this).val();
        var zz2 = /^[a-zA-Z0-9_.]{5,15}$/;
        if(password==null || password==""){
            $("#span2").html("密码不能为空");
        }else if(!zz2.test(password)){
            $("#span2").html("密码只能是字母/数字/_/.(5-15位)");
        }else{
            $("#span2").html("");
        }
    });

    //验证码输入框失去焦点事件
    $("#auth").blur(function () {
        auth = $(this).val();
        if(auth==null || auth==""){
            $("#span3").html("验证码不能为空");
        }else if(auth.length!=6){
            $("#span3").html("请输入6位验证码");
        }else{
            $("#span3").html("");
        }
    });

    $("#button").click(function () {
        var result1 = ( $("#span1").html()==""||$("#span1").html()==null );
        var result2 = ( $("#span2").html()==""||$("#span2").html()==null );
        var result3 = ( $("#span3").html()==""||$("#span3").html()==null );
        if(username==null && password==null && auth==null){
            alert("请输入用户名/密码/验证码");
        }else if(result1 && result2 && result3 ){
            username = $("#username").val();
            password = $("#passWord").val();
            $.ajax({
                url:"/ssm01/user/login",
                data:{"user_username":username,"user_password":password,"auth":auth},
                dataType:"text",
                type:"POST",
                success:function (data) {
                    alert(data);
                    if(data=="登陆成功"){
                        self.location.href="../../../jsp/index.jsp"
                    }
                },
                error:function () {
                    alert("由于网络原因无法正常连接，请稍后重试！")
                }
            });
        }else{
            alert("请输入正确的用户名和密码");
        }



    });


    function change() {
        //重新获得验证码图片。后面的随机数不可少，这样就不会去缓存中取，而是重新访问服务器，获得新的验证码图片
        document.getElementById("veryCode").src = "../authImg?t=" + Math.random();

    }
});