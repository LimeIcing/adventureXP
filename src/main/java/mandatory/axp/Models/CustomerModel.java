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

    public CustomerModel(String ID) {


    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
}
