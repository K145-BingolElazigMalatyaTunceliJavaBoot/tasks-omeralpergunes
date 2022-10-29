package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Tuesday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TuesdayRepo extends JpaRepository<Tuesday, Integer> {

    List<Tuesday> findAllByDescription(String description);
    List<Tuesday> findAllByDescriptionOrTime(String description, String time);
}
