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

        .center-content {
            display: flex;
            flex-direction: column;
            justify-content: center;
        }
    </style>

    <body style="background: url('https://i.imgur.com/y0bLdzr.png') no-repeat center center fixed; background-size: cover; overflow-y: hidden;background-color: #F4EEA5">
        <div class="row sticky-top" style="background-color: none; height: 10rem;">
            <!-- Home page -->
            <div class="col-2 align-self-center ps-5">
                <br><br>&nbsp;&nbsp;
                <img src="https://i.imgur.com/VkFlt34.png" width="100">
            </div>

            <!-- Empty -->
            <div class="col-6">

            </div>   
            <div class="col-2">

            </div>
            <div class="col-2 justify-content-end align-self-center d-flex" style="margin-left: -1rem;">
                <a href="./logout" class="btn btn-dark" style="width: 6rem;background-color: #080660">Register</a> &nbsp;&nbsp;
                <a href="login.jsp" class="btn btn-dark" style="width: 6rem;;background-color: #080660">Log in</a>&nbsp;&nbsp;&nbsp;
            </div>
        </div>

        <div class="center-content">
            <h1 class="text-center" style="top: 10%;"><b>MENTOR MENTEE MATCH</b></h1>
            <table style="top: 30%;">
                <tr>
                    <td>
                        <img src="https://i.imgur.com/ERxp6Sw.png" style="top: 30%;margin-left: 10%;width: 700px" alt="alt"/>
                    </td>
                    <td>
                        <h4><br><br><u>About us </u></h4>
                        <p style="font-size: 18px;"><br><br>
                            Nền tảng tiên phong kết nối các doanh nghiệp đang có nhu cầu  <br>
                            nâng cao chất lượng nhân sự thông và các chuyên gia hàng đầu  <br> 
                            trong nhiều lĩnh vực</p>                                    
                    </td>
                </tr>

            </table>


        </div>
    </body>
</html>
