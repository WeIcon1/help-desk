package com.example.helpdesk.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("pageTitle", "Help Desk");

        model.addAttribute(
                "welcomeMessage",
                "Добро пожаловать в Help Desk"
        );

        model.addAttribute(
                "features",
                List.of(
                        "Регистрация обращений",
                        "Приоритизация задач",
                        "Контакты поддержки"
                )
        );
        model.addAttribute("features", List.of(
                "Регистрация обращений",
                "Приоритизация задач",
                "Контакты поддержки",
                "База знаний"
        ));
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute("pageTitle", "О нас");

        return "about";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {

        model.addAttribute("pageTitle", "Контакты");

        return "contacts";
    }
}