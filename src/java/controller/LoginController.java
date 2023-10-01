package controller;

import constant.Constant;
import dao.AccountDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet{
               
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("loginGoogleURL", Constant.GOOGLE_URL_LOGIN);
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usernameOrEmail = (String) req.getParameter("usernameOrPassword");
        String password = (String) req.getParameter("password");

        AccountDAO accDAO = new AccountDAO();
        Account acc = accDAO.getAccount(accDAO.LOGIN_EMAIL, usernameOrEmail, password);
        if (acc == null) {
            acc = accDAO.getAccount(accDAO.LOGIN_USERNAME, usernameOrEmail, password);
            if (acc == null) {
                req.getSession().setAttribute("log", "Username or password incorrect!");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
                return; 
            } 
        }

        req.getSession().setAttribute("account", acc);
        
    }
    }
    
