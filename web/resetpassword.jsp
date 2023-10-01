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

    <body style="background: url('https://i.imgur.com/dRuSAlf.png') no-repeat center center fixed; background-size: cover; overflow-y: hidden;background-color: #F4EEA5">
        <%@include file="navbar.jsp" %>

        <div class="center-content">
            <h1 class="text-center" style="top: 0%;">
                <p style="margin-left: -36%;font-size: 30px;">Reset Password </p>
                <br>
                <p style="margin-left: -35%;font-size: 25px;">Enter new password: </p>
                <input type="text" style="width: 800px;height: 60px;margin-left: 25%" class="form-control"  placeholder="New Password">
                <br>
                <p style="margin-left: -35%;font-size: 25px;">Confirm password: </p>
                <input type="text" style="width: 800px;height: 60px;margin-left: 25%" class="form-control"  placeholder="Confirm password">
                <div style="margin-left: 43%;">
                    <a href="enterOTP.jsp" class="btn btn-dark" style="width: 6rem;background-color: #080660">Back</a> &nbsp;&nbsp;
                    <a href="login.jsp" class="btn btn-dark" style="width: 6rem;;background-color: #080660">Enter</a>&nbsp;&nbsp;&nbsp;
                </div>
            </h1>


        </div>
    </body>
</html>
