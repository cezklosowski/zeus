package com.cezklosowski.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(Model model) {

        PersonDto person = new PersonDto(
                "Cezary",
                "Kłosowski",
                18
        );

        model.addAttribute("person",person);
        return "home";
    }
}
