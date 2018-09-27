package mandatory.axp.Controllers;

import mandatory.axp.Models.ActivityModel;
import mandatory.axp.Models.Repositories.ActivityRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {
    ActivityRepository activityRepository = new ActivityRepository();

    @RequestMapping(value = "/admin/students", method = RequestMethod.GET)
    public String adminStudents (Model model) {
        model.addAttribute("students", ActivityRepository.());

        return "/admin/students";
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
        activityRepository.create(activityModel);

        return "index";
    }
}
