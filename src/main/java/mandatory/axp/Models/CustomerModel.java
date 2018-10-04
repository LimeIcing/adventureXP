package mandatory.axp.Models;

public class CustomerModel {

    private String name;
    private int ID;
    private String password;

    public CustomerModel(String name, int ID, String password) {

        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public CustomerModel(int ID) {

        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
}
