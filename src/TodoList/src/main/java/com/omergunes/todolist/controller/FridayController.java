package com.omergunes.todolist.controller;

import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.repo.FridayRepo;
import com.omergunes.todolist.repo.MondayRepo;
import com.omergunes.todolist.services.FridayService;
import com.omergunes.todolist.services.MondayService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friday")
public class FridayController {

    @Autowired
    public FridayRepo fridayRepo;
    FridayService fridayService;

    @GetMapping("/getList")
    public List<Friday> findAll(){
        return fridayRepo.findAll();
    }
    @PostMapping("/add")
    public Friday add(@Validated @NotNull @RequestBody Friday friday){
        return fridayRepo.save(friday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Friday> fridayList(@PathVariable("id") Long id){
        fridayRepo.deleteById(id);
        return null;
    }
}
