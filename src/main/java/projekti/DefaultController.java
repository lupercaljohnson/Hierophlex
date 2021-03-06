package projekti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("*")
    public String getDefault(Model model) {
        model.addAttribute("message", "World!");
        return "index";
    }
    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("message", "World!");
        return "about";
    }
}
