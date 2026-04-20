package com.yugsoni.Portfolio.controller;

import com.yugsoni.Portfolio.model.Contacts;
import com.yugsoni.Portfolio.repository.PortfolioRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class PortfolioController {

    private final PortfolioRepo repo;

    public PortfolioController(PortfolioRepo repo) {
        this.repo = repo;
    }

    @PostMapping
    public Contacts addContact(@RequestBody Contacts contact) {
        return repo.save(contact);
    }

    @GetMapping
    public List<Contacts> getAll() {
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable Long id) {

        if (!repo.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("SORRY !! Contact not found with id: " + id);
        }

        repo.deleteById(id);
        return ResponseEntity.ok("Contact deleted successfully");
    }

}
