/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AccountDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;
import utils.Helper;
import utils.Mail;

@WebServlet(name = "ForgotPwdController", urlPatterns = {"/forgetPassword"})
public class ForgotPasswordController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("forgetPassword.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        AccountDAO accDAO = new AccountDAO();
        Account acc = accDAO.getUserForgotPass(email);
        if (acc == null) {
            request.setAttribute("log", "The email is not exist");
            request.getRequestDispatcher("forgetPassword.jsp").forward(request, response);
        } else {
            request.getSession().setAttribute("email", email);
            String otp = Helper.getRandomNumberString();
            request.getSession().setAttribute("otp", otp);
            System.out.println(otp + "*");
            Mail.send(email, "MMM - Mentee Mentor Matching", otp);
            request.getRequestDispatcher("enterOTP.jsp").forward(request, response);
        }
    }

}
