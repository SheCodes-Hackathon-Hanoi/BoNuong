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

@WebServlet(name = "ResetPassword", urlPatterns = {"/resetPassword"})
public class ResetPasswordController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newPassword = (String) req.getParameter("newPassword");
        String confirmPassword = (String) req.getParameter("confirmPassword");
        String email = (String) req.getSession().getAttribute("email");
        AccountDAO accDAO = new AccountDAO();
        if (confirmPassword.equals(newPassword) || confirmPassword != null || newPassword != null) {
            if (accDAO.getUserForgotPass(email) != null) {
                accDAO.changePassword(email, newPassword);
            }
        } else {
            req.setAttribute("log", "Password does not match! Please try again");
            req.getRequestDispatcher("auth/resetPassword.jsp");
        }
        req.getSession().removeAttribute("email");
        resp.sendRedirect("/login");
    }
}
