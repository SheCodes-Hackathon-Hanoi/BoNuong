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
        <title>Ask Role</title>
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

        .footer-content {
            display: flex;
            flex-direction: column;
            justify-content: center;
            margin-top: 10%;
        }
    </style>

    <body style="background: url('https://i.imgur.com/y0bLdzr.png') no-repeat center center fixed; background-size: cover; overflow-y: hidden;background-color: #F4EEA5">
        <%@include file="navbar.jsp" %>

        <div class="center-content">
            <h1 class="text-center" style="top: 0%;">
                <h1 class="text-center" >  <b>Are you</b> </h1>
                <br>
                <div style="margin-left: 43%;">
                    <a href="registerMentor.jsp" class="btn btn-dark" style="width: 200px;height: 50px;background-color: #080660;font-size: 25px;">Mentor</a>
                </div>
                <br>
                <h1 class="text-center" >  <b>Or</b> </h1>
                <br>
                <div style="margin-left: 43%;">
                    <a href="registerMentee.jsp" class="btn btn-dark" style="width: 200px;height: 50px;background-color: #080660;font-size: 25px;">Mentee</a>
                </div>
            </h1>
        </div>
        <div class="footer-content">
            <a href="login.jsp" style="font-size: 20px;margin-left: 7%;color: #080660">< Back</a>
        </div>
    </body>
</html>
