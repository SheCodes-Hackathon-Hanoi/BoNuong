package controller;

import dao.AccountDAO;
import dto.UserGoogleDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import utils.Helper;

@WebServlet(name = "RegisterController", urlPatterns = {"/register"})
public class RegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("auth/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountDAO accDAO = new AccountDAO();
        String code = req.getParameter("code");
        String accessToken = Helper.getToken(code);
        
        String username = req.getParameter("username");
        String email = req.getParameter("email");

        if (accDAO.isExistAccount(accDAO.LOGIN_USERNAME, username) == true) {
            req.setAttribute("log", "That username has already been registered");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }

        if (accDAO.isExistAccount(accDAO.LOGIN_EMAIL, email)) {
            req.setAttribute("log", "That email address has already been registered");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }

        String password = req.getParameter("password");

        String role = req.getParameter("role");
        int roleId = (role.equals("mentor")) ? 0 : 1;

        req.getSession().setAttribute("account", 
                accDAO.createUser(username, password, 
                        null, email, roleId, username, null)
        );
        resp.sendRedirect("./");
    }
}
