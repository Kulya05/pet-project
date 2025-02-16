package com.example.petproject.controller;

import com.example.petproject.entity.Idea;
import com.example.petproject.service.IdeaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/ideas")
public class AdminIdeaController {
    private final IdeaService ideaService; // Поле має бути final

    // Явний конструктор без Lombok
    public AdminIdeaController(IdeaService ideaService) {
        this.ideaService = ideaService;
    }

    @GetMapping
    public List<Idea> getAllIdeas() {
        return ideaService.getAllIdeas();
    }

    @GetMapping("/{id}")
    public Optional<Idea> getIdea(@PathVariable Long id) {
        return ideaService.getIdeaById(id);
    }

    @PostMapping
    public Idea addIdea(@RequestBody Idea idea) {
        return ideaService.saveIdea(idea);
    }

    @DeleteMapping("/{id}")
    public void deleteIdea(@PathVariable Long id) {
        ideaService.deleteIdea(id);
    }
}
