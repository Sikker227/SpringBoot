package org.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/home")
    public String home(String name, Model model) {
        model.addAttribute("name", name);
        return "/home";
    }
    @GetMapping("/uslugi")
    public String uslugi(String name, Model model) {
        model.addAttribute("name", name);
        return "/uslugi";
    }

}