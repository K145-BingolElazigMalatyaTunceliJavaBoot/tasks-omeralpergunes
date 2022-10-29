package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Wednesday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WednesdayRepo extends JpaRepository<Wednesday, Integer> {
    List<Wednesday> findAllByDescription(String description);
    List<Wednesday> findAllByDescriptionOrTime(String description, String time);
}
