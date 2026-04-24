package com.yugsoni.Portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class GeneralController {

    @GetMapping("/contact")
    public RedirectView redirectToContacts() {
        return new RedirectView("/contacts");
    }

    @GetMapping("/")
    public RedirectView redirectToContact() {
        return new RedirectView("/contacts");
    }

}
