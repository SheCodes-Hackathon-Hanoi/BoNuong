<%-- 
    Document   : landingpage
    Created on : Sep 30, 2023, 10:23:33 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <!-- Bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Bootstrap-select -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.14.0-beta3/dist/css/bootstrap-select.min.css">
    </head>

    <style>

        .center-content {
            display: flex;
            flex-direction: column;
            justify-content: center;
        }
    </style>

    <body style="background: url('https://i.imgur.com/KuMmxw5.png') no-repeat center center fixed; background-size: cover; overflow-y: hidden;background-color: #F4EEA5">
        <%@include file="navbar.jsp" %>

        <div class="center-content">
            <h1 class="text-center" style="top: 0%;">
                <a href="#" class="btn" style="border-color: #080660" >
                    <h3> &nbsp; <img src="https://i.imgur.com/rcN9obg.png" alt="alt"  width="30"> Login with Google&nbsp;</h3>
                </a>
                <br><br>
                <p style="margin-left: -38%;font-size: 25px;" style="font-size: 25px;">Enter username: </p>
                <input type="text" style="width: 800px;height: 60px;margin-left: 25%" class="form-control"  placeholder="User Name">
                <br>
                <p style="margin-left: -38%;font-size: 25px;" style="font-size: 25px;">Enter password: </p>
                <input type="text" style="width: 800px;height: 60px;margin-left: 25%" class="form-control"  placeholder="Password">
                <div>
                    <a href="forgotpassword.jsp"  style="font-size: 20px;margin-left: 4%;color: #080660">Forgot password?</a>
                    <a href="askrole.jsp" class="btn btn-dark" style="width: 6rem;margin-left: 28%;background-color: #080660">Register</a>&nbsp;
                    <a href="login.jsp" class="btn btn-dark" style="width: 6rem;background-color: #080660">Log in</a>
                </div>
            </h1>


        </div>
    </body>
</html>
