package mandatory.axp.Models;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class UserModel {

    private String name;
    private String ID;
    private String password;

    public UserModel(String name, String ID, String password) {

        this.name = name;
        this.ID = ID;
        this.password = password;
    }

}
