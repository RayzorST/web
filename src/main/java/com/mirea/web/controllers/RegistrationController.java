package com.mirea.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String registraion(Model model){
        model.addAttribute("title", "Не Главная страница");
        return "registration";
    }
}
