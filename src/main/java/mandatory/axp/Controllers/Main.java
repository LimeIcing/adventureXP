package src.main.java.mandatory.axp.Controllers;

public class Main
{
    public static void main(String[] args) {
        Main test = new Main();

        System.out.println(test.loginMethod("jack","hi"));

        System.out.println(test.loginMethod("admin","admin"));

    }

    //Missing data from project, wait to continued!!!
    public boolean loginMethod(String username, String password)
    {
        boolean login = false;
        //secret code
        String sUsername = "admin", sPassword = "admin";



        //checks if username and password is correct
        if (sUsername.equals(username) && sPassword.equals(password))
        {
            login = true;
        }
        return login;
    }
}
