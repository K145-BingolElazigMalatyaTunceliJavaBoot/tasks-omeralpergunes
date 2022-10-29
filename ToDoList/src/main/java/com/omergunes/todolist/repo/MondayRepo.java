package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Monday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MondayRepo extends CrudRepository<Monday, Integer> {

    List<Monday> findAllByDescription(String description);
    List<Monday> findAllByDescriptionOrTime(String description, String time);
}
