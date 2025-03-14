package com.example.clients.controllers;

import com.example.clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientRepository clientRepo;

    @GetMapping({"","/"})
    public String getClients(Model model) {
        var clients  = clientRepo.findAll(Sort.by(Sort.Direction.DESC,"id"));
        model.addAttribute("clients", clients);

        return "clients/index";
    }
}
