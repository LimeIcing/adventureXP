package mandatory.axp.Controllers;

import mandatory.axp.Models.ActivityModel;
import mandatory.axp.Models.Repositories.ActivityRepository;
import mandatory.axp.Models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ActivityRepository AR = new ActivityRepository();

    ActivityRepository activityRepository = new ActivityRepository();
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
    public String login(Model model)
    {
       model.addAttribute("userModel",new UserModel());

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, UserModel userModel)
    {
        if(loginMethod(userModel.getName(), userModel.getPassword()))
        {
            return "index";
        }

        return "/calendar";
    }

    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }

    @RequestMapping("/index")
    public String backToHome()
    {
        return "index";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public String activitiesPage(Model model)
    {
        model.addAttribute("activities", AR.getActivities());
        return "/activities";
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public String activityPage()
    {

        return "/activity";
    }
/*
    private ActivityModel getSpecificActivity(int id)
    {
        SqlRowSet rs = activityRepository.getSpecificActivityModelBasedOnId(id);

        return .getSpecificView(rs);
    }

    @RequestMapping(value="/deleteActivity",method = RequestMethod.GET)
    public String deleteActivity(@RequestParam("id") int id, Model model)
    {
        model.addAttribute("viewModel", getSpecificActivity(id));

        //bruges til søg
        model.addAttribute("tempModel", factoryController.createDoctor());

        return "requestDeleteActivity";

    }
    */

}