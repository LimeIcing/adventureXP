package mandatory.axp.Controllers;

import mandatory.axp.Models.ActivityModel;
import mandatory.axp.Models.Repositories.ActivityRepository;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

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

    private ActivityRepository activityRepository = new ActivityRepository();

    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createActivity(Model model)
    {
        model.addAttribute("activity", new ActivityModel());

        return "create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createActivity(@ModelAttribute ActivityModel activityModel)
    {
        activityRepository.create(activityModel);

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

    private ActivityModel getSpecificActivity(int id)
    {
        SqlRowSet rs = activityRepository.getSpecificView(id);

        return factoryController.getSpecificView(rs);
    }

    @RequestMapping(value="/deleteActivity",method = RequestMethod.GET)
    public String deleteActivity(@RequestParam("id") int id, Model model)
    {
        model.addAttribute("viewModel", getSpecificActivity(id));

        //bruges til søg
        model.addAttribute("tempModel", factoryController.createDoctor());

        return "requestDeleteActivity";
    }

}