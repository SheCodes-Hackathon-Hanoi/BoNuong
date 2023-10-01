package dao;

import connection.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RoleDAO extends DBContext {

    public static int getRoleIdByRoleName(String name) {
        try {
            String sqlQuery = "select *\n"
                    + "from Role\n"
                    + "where Name = ?";
            PreparedStatement stm = new DBContext().getConnection().prepareStatement(sqlQuery);
            stm.setString(1, name);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
