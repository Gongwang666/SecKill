<!DOCTYPE html>
<html lang="en">

<head>
   <#include "head_resources.ftl">
</head>

<body data-type="login">
    <script src="../assets/js/theme.js"></script>
    <div class="am-g tpl-g">
        <!-- 风格切换 -->
        <#include "change_style.ftl">
        <!-- 登录 -->
        <div class="tpl-login">
            <div class="tpl-login-content">

                <div class="tpl-login-logo">

                </div>

                <form class="am-form tpl-form-line-form">
                    <div class="am-form-group">
                        <input type="text" class="tpl-form-input" id="user-name" placeholder="请输入账号">

                    </div>

                    <div class="am-form-group">
                        <input type="password" class="tpl-form-input" id="user-name" placeholder="请输入密码">

                    </div>
                    <div class="am-form-group tpl-login-remember-me">
                        <input id="remember-me" type="checkbox">
                        <label for="remember-me">
       
                        记住密码
                         </label>

                    </div>

                    <div class="am-form-group">

                        <button type="button" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">提交</button>

                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="../assets/js/amazeui.min.js"></script>
    <script src="../assets/js/app.js"></script>

</body>

</html>