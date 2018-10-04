package mandatory.axp.Models;

public class UserModel {

    private String name;
    private String ID;
    private String password;

    public UserModel() {

    }

    public UserModel(String name, String ID, String password) {
        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
