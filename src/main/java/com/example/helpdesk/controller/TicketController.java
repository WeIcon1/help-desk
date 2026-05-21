package com.example.helpdesk.controller;

import com.example.helpdesk.model.Ticket;
import com.example.helpdesk.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/tickets/customer")
    public String getTicketsByCustomer(@RequestParam("name") String name, Model model) {
        // Ищем тикеты, где имя клиента содержит 'name' без учета регистра
        List<Ticket> tickets = ticketRepository.findByCustomerNameContainingIgnoreCase(name);
        model.addAttribute("tickets", tickets);
        return "tickets"; // возвращаем view tickets.html
    }
}