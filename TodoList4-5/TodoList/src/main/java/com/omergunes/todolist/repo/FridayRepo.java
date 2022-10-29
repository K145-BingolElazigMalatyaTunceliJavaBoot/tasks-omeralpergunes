package com.omergunes.todolist.repo;

import com.omergunes.todolist.model.Friday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FridayRepo extends JpaRepository<Friday, Long> {

    List<Friday> findByDescription(String description);
}
