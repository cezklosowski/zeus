package com.cezklosowski.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(Model model) {

        PersonDto person1 = new PersonDto("Cezary", "Kłosowski", 18);
        PersonDto person2 = new PersonDto("Jan", "Nowak", 19);
        PersonDto person3 = new PersonDto("Krzysztof", "Kowalski", 20);

        List<PersonDto> persons = List.of(person1, person2, person3);

        model.addAttribute("name", "Adaś");
        model.addAttribute("person",person1);
        model.addAttribute("persons",persons);
        return "home";
    }
}
