package com.mirea.web.controllers;

import com.mirea.web.models.Cards;
import com.mirea.web.repo.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @Autowired
    private CardsRepository cardsRepository;

    @GetMapping("/registration")
    public String registraion(Model model){
        model.addAttribute("title", "Не Главная страница");
        return "registration";
    }

    @PostMapping("/registration")
    public String registraionAdd(@RequestParam String name, @RequestParam String surname, Model model){
        Cards cards = new Cards(name, surname);
        cardsRepository.save(cards);
        return "redirect:/";
    }
}
