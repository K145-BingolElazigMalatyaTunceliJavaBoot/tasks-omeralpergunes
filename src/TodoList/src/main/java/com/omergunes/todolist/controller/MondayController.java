package com.omergunes.todolist.controller;

import com.omergunes.todolist.services.MondayService;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.repo.MondayRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monday")
public class MondayController {

    @Autowired
    public MondayRepo mondayRepo;
    MondayService mondayService;

    @GetMapping("/getList")
    public List<Monday> findAll(){
        return mondayRepo.findAll();
    }
    @PostMapping("/add")
    public Monday add(@Validated @NotNull @RequestBody Monday monday){
        return mondayRepo.save(monday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Monday> mondayList(@PathVariable("id") Long id){
        mondayRepo.deleteById(id);
        return null;
    }
}
