package mandatory.axp.Controllers;

import mandatory.axp.Models.ActivityModel;
import mandatory.axp.Models.Repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;


@Controller
public class AdminController {

    @Autowired
    private ActivityRepository AR = new ActivityRepository();

    @RequestMapping(value = "/admin/", method = RequestMethod.GET)
    public String adminStudents (Model model) {
        model.addAttribute("activities", AR.getActivities());

        return "/admin/admin";
    }

    @RequestMapping(value = "admin/create", method = RequestMethod.GET)
    public String createActivity(Model model)
    {
        model.addAttribute("activity", new ActivityModel());

        return "admin/create";
    }

    @RequestMapping(value = "admin/create", method = RequestMethod.POST)
    public String createActivity(@ModelAttribute ActivityModel activityModel)
    {
        AR.create(activityModel);

        return "redirect:/admin/";
    }

    @RequestMapping(value= "admin/delete", method =RequestMethod.GET)
    public String deleteActivity(@RequestParam("id") int id, Model model)
    {
        activityRepository.getSpecificActivityModelBasedOnId(id);
        return "admin/delete";
    }

    @RequestMapping(value= "admin/delete/{id}", method=RequestMethod.POST)
    public String deleteActivity(Model model, @PathVariable int id)
    {
        activityRepository.deleteActivity(id);

        return "admin/delete";
    }
}
