package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Thursday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThursdayRepo extends CrudRepository<Thursday, Integer> {

    List<Thursday> findAllByDescription(String description);
    List<Thursday> findAllByDescriptionOrTime(String description, String time);
}
