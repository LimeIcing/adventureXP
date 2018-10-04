package mandatory.axp.Models;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class CustomerModel {

    private String name;
    private String ID;
    private String password;

    public CustomerModel(String name, String ID, String password) {

        this.name = name;
        this.ID = ID;
        this.password = password;
    }
}
