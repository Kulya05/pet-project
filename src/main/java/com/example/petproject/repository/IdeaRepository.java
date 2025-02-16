package com.example.petproject.repository;

import com.example.petproject.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IdeaRepository extends JpaRepository<Idea, Long> {
    List<Idea> findByCategory(String category);
}
