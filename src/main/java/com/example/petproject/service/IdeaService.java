package com.example.petproject.service;

import com.example.petproject.entity.Idea;
import com.example.petproject.repository.IdeaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdeaService {
    private final IdeaRepository ideaRepository;

    // Явний конструктор для ініціалізації ideaRepository
    public IdeaService(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    public List<Idea> getAllIdeas() {
        return ideaRepository.findAll();
    }

    public Optional<Idea> getIdeaById(Long id) {
        return ideaRepository.findById(id);
    }

    public Idea saveIdea(Idea idea) {
        return ideaRepository.save(idea);
    }

    public void deleteIdea(Long id) {
        ideaRepository.deleteById(id);
    }
}
