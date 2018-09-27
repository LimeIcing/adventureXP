package mandatory.axp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
    //Missing data from project, wait to continued!!!
    public boolean loginMethod(String username, String password) {
        boolean login = false;
        //secret code
        String sUsername = "admin", sPassword = "admin";

        //checks if username and password is correct
        if (sUsername.equals(username) && sPassword.equals(password)) {
            login = true;
        }
        return login;
    }

    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public String activitiesPage()
    {

        return "/activities";
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public String activityPage()
    {

        return "/activity";
    }
}