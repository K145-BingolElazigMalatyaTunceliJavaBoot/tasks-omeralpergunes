package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Saturday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaturdayRepo extends CrudRepository<Saturday, Integer> {
    List<Saturday> findAllByDescription(String description);
    List<Saturday> findAllByDescriptionOrTime(String description, String time);
}
