package com.mirea.web.controllers;

import com.mirea.web.models.Cards;
import com.mirea.web.repo.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private CardsRepository cardsRepository;

    @GetMapping("/")
    public String home(Model model){
        Iterable<Cards> cards = cardsRepository.findAll();
        model.addAttribute("cards", cards);
        return "home";
    }
}
