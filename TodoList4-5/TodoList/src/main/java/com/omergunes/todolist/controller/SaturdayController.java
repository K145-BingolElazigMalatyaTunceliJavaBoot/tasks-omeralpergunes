package com.omergunes.todolist.controller;

import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.SaturdayRepo;
import com.omergunes.todolist.services.SaturdayService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saturday")
public class SaturdayController {

    @Autowired
    public SaturdayRepo saturdayRepo;
    SaturdayService saturdayService;

    @GetMapping("/getList")
    public List<Saturday> findAll(){
        return saturdayRepo.findAll();
    }
    @PostMapping("/add")
    public Saturday add(@Validated @NotNull @RequestBody Saturday saturday){
        return saturdayRepo.save(saturday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Saturday> thursdayList(@PathVariable("id") Long id){
        saturdayRepo.deleteById(id);
        return null;
    }
}
