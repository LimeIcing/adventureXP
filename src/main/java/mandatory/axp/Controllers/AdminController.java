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

    @RequestMapping(value = "/admin/students", method = RequestMethod.GET)
    public String adminStudents (Model model) {
        model.addAttribute("students", ActivityRepository.());

        return "/admin/students";
    }
}
