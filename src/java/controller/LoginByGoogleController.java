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

@WebServlet(name = "LoginByGoogleController", urlPatterns = {"/LoginGoogleControler"})

public class LoginByGoogleController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = request.getParameter("code");
        String accessToken = Helper.getToken(code);

        UserGoogleDTO userInfo = Helper.getUserInfo(accessToken);
        AccountDAO accDAO = new AccountDAO();     
        if(!accDAO.isExistAccount(accDAO.LOGIN_EMAIL, userInfo.getEmail())){
            request.getSession().setAttribute("log", "Account not registered. Contact admin");
            response.sendRedirect("./login");
            return;
        }
        else{
            request.getSession().setAttribute("account",
                    accDAO.getAccount(accDAO.LOGIN_EMAIL, userInfo.getEmail()));
            response.sendRedirect(request.getContextPath());
            return;
        }
        }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
