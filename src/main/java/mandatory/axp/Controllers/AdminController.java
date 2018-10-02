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

    @RequestMapping(value = "/admin/editActivity/{id}", method = RequestMethod.GET)
    public String edit(Model model, @PathVariable(value = "id") int id, ActivityModel activityModel) {
        model.addAttribute("activity", AR.getId(id));

        return "/admin/editActivity";
    }
    @RequestMapping(value = "/admin/editActivity/{id}", method = RequestMethod.POST)
    public String edit(@PathVariable(value = "id") int id, ActivityModel activityModel)
    {
        AR.update(activityModel, id);

        return "redirect:/admin/";
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
    @RequestMapping(value = "/admin/", method = RequestMethod.GET)
    public String adminStudents (Model model) {
        model.addAttribute("activities", AR.getActivities());

        return "/admin/admin";
    }
}
