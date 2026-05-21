package com.example.helpdesk.controller;

import java.util.List;

import com.example.helpdesk.model.Ticket;
import com.example.helpdesk.service.TicketService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private final TicketService ticketService;

    public PageController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Help Desk");
        model.addAttribute("welcomeMessage", "Добро пожаловать в Help Desk");
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
        model.addAttribute("supportEmail", "support@helpdesk.local");
        model.addAttribute("phone", "+7 (000) 000-00-00");
        model.addAttribute("workTime", "Пн-Пт, 09:00-18:00");
        return "contacts";
    }


}