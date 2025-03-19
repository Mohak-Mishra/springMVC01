package com.oracle.mohak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping(value="/")
    public String welcome(Model model) {
        model.addAttribute("owner", "Mohak Mishra");
        return "Welcome";
    }
}
