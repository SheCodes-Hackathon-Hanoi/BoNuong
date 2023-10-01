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
        <title>Landing Page</title>
        <!-- Bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Bootstrap-select -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.14.0-beta3/dist/css/bootstrap-select.min.css">


    </head>

    <style>

        .footer-content {
            display: flex;
            flex-direction: column;
            justify-content: center;
            margin-top: 4%;
        }
        td {
            padding: 8px;
            text-align: center;
        }

        .border-right {
            border-right: 1px solid #000; /* Border between adjacent cells horizontally */
        }

    </style>

    <body style="background: url('https://i.imgur.com/blmZDXL.png') no-repeat center center fixed; background-size: cover; overflow-y: hidden;background-color: #F4EEA5">
        <%@include file="navbar.jsp" %>
        <div class="center-content">
            <h1 class="text-center" style="top: 10%;"><b>MENTOR MENTEE MATCH</b></h1>
            <br><br>
            <table class="bordered-table" style="top: 30%;margin-left: 27%">
                <tr>
                    <td class="border-right">
                        <table>
                            <tr>
                            <p style="margin-left: -120%;font-size: 15px;">Enter username: </p>
                            <input type="text" style="margin-left: -30%;width: 300px;height: 40px" class="form-control"  placeholder="User Name">
                            </tr>
                            <tr>
                            <p style="margin-left: -120%;font-size: 15px;">Enter email </p>
                            <input type="text" style="margin-left: -30%;width: 300px;height: 40px" class="form-control"  placeholder="Email">
                            </tr>
                            <tr>
                            <p style="margin-left: -120%;font-size: 15px;">Enter password: </p>
                            <input type="text" style="margin-left: -30%;width: 300px;height: 40px" class="form-control"  placeholder="Password">
                            </tr>
                            <tr>
                            <p style="margin-left: -120%;font-size: 15px;">Confirm password: </p>
                            <input type="text" style="margin-left: -30%;width: 300px;height: 40px" class="form-control"  placeholder="Confirm password">
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr>
                            <p style="margin-right: 10%;font-size: 15px;">Enter expert skills: </p>
                            <input type="text" style="margin-left: 30%;width: 300px;height: 40px" class="form-control"  placeholder="Expert skills">
                            </tr>
                            <tr>
                            <p style="margin-right: -30%;font-size: 15px;">Enter education: </p>
                            <input type="text" style="margin-left: 30%;width: 300px;height: 40px" class="form-control"  placeholder="Education">
                            </tr>
                            <tr>
                            <p style="margin-right: -10%;font-size: 15px;">Enter contaxt number: </p>
                            <input type="text" style="margin-left: 30%;width: 300px;height: 40px" class="form-control"  placeholder="Contaxt Number">
                            </tr>
                            <tr>
                            <p style="margin-right: 0%;font-size: 15px;">Introduce your self: </p>
                            <input type="text" style="margin-left: 30%;width: 300px;height: 40px" class="form-control"  placeholder="Introductions">
                            </tr>
                        </table>                                    
                    </td>
                </tr>
            </table>
        </div>
        <div class="footer-content">
            <a href="askrole.jsp" style="font-size: 20px;margin-left: 7%;color: #080660">< Back</a>
            <a href="login.jsp" class="btn btn-dark" style="width: 6rem;margin-left: 80%;margin-top: -3%;background-color: #080660">Register</a>
        </div>
    </body>

</html>
