package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Sunday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SundayRepo extends JpaRepository<Sunday, Integer>  {

    List<Sunday> findAllByDescription(String description);
    List<Sunday> findAllByDescriptionOrTime(String description, String time);
}
