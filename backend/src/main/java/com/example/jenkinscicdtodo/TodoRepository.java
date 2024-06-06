package com.example.jenkinscicdtodo;

import org.springframework.data.jpa.repository.JpaRepository;

// TodoRepository.java
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
