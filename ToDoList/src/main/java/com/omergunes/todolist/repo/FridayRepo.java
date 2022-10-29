package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Friday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FridayRepo extends CrudRepository<Friday, Integer> {

    List<Friday> findAllByDescription(String description);
    List<Friday> findAllByDescriptionOrTime(String description, String time);
}
