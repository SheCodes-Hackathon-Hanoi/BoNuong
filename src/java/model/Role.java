package model;
import dao.RoleDAO;
public class Role {
    public static int ROLE_MENTEE = RoleDAO.getRoleIdByRoleName("Mentee");
    public static int ROLE_MENTOR = RoleDAO.getRoleIdByRoleName("Mentor");
    private int ID;
    private String name;

    public Role() {
    }

    public Role(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
