package mandatory.axp.Controllers;

import mandatory.axp.Models.Repositories.ActivityRepository;
import mandatory.axp.Models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ActivityRepository activityRepository = new ActivityRepository();

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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
       model.addAttribute("userModel",new UserModel());

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, UserModel userModel) {
        if(loginMethod(userModel.getName(), userModel.getPassword())) {
            return "index";
        }

        return "/calendar";
    }

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/index")
    public String backToHome() {
        return "index";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public String activitiesPage(Model model) {
        model.addAttribute("activities", activityRepository.getActivities());
        return "/activities";
    }

    @RequestMapping(value = "/activity/{id}", method = RequestMethod.GET)
    public String activityPage(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("activity", activityRepository.getActivityById(id));
        return "/activity";
    }
}