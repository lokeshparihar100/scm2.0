package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
    
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name", "Lokesh");
        model.addAttribute("githubRepo", "https://github.com/lokeshparihar100/scm2.0");
        return "Home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        return "services";
    }
}
