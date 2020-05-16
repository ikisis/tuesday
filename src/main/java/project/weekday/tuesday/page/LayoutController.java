package project.weekday.tuesday.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.weekday.tuesday.repository.map.UserMapRepository;

@Controller
public class LayoutController {

    @Autowired
    private UserMapRepository userMapRepository;

    @GetMapping("/view/user")
    public String userview(
        @RequestParam(name = "id", required = false, defaultValue = "ikisis") String id,
        Model model
        ) {

        this.userMapRepository.findById(id).ifPresent(user -> {
            model.addAttribute("user", user);
        });

        return "userview";

    }

}