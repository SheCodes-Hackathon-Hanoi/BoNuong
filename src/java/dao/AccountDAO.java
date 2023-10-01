package dao;

import connection.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;
import model.Role;

public class AccountDAO extends DBContext {

    public static String LOGIN_USERNAME = "Username", LOGIN_EMAIL = "Email";

    //check if the account is exit or not
    public boolean isExistAccount(String field, String usernameOrPassword) {
        try {
            String sqlQuery = "SELECT * FROM dbo.[Account]\n"
                    + "WHERE " + field + " = ?\n";
            PreparedStatement stm = connection.prepareStatement(sqlQuery);
            stm.setString(1, usernameOrPassword);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    //get the email for logining by google
    public Account getAccount(String field, String usernameOrEmail) {
        try {
            String sqlQuery = "SELECT * , r.ID FROM [dbo].[Account] a\n"
                    + "  JOIN [dbo].[Role] r \n"
                    + "  ON a.Role_ID = r.ID WHERE" + field + "=?\n";
            PreparedStatement stm = connection.prepareStatement(sqlQuery);
            stm.setString(1, usernameOrEmail);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return new Account(rs.getInt(1), 
                        new Role(rs.getInt(2), String.valueOf(rs.getInt(7))), 
                        String.valueOf(3), 
                        String.valueOf(4), 
                        String.valueOf(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    //get username for traditional login
    public Account getAccount(String field, String usernameOrEmail, String password){
        try {
            String sqlQuery = "SELECT * , r.ID FROM [dbo].[Account] a\n"
                    + "  JOIN [dbo].[Role] r \n"
                    + "  ON a.Role_ID = r.ID WHERE" + field + "= ? AND Password = ?";
            PreparedStatement stm = connection.prepareStatement(sqlQuery);
            stm.setString(1, usernameOrEmail);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                return new Account(rs.getInt(1), 
                        new Role(rs.getInt(2), String.valueOf(rs.getInt(7))), 
                        String.valueOf(3), 
                        String.valueOf(4), 
                        String.valueOf(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Account getUserForgotPass(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void changePassword(String email, String newPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object createUser(String username, String password, Object object, String email, int roleId, String username0, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
