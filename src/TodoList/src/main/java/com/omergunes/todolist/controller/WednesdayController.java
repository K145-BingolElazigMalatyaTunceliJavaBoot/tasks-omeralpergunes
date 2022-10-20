package com.omergunes.todolist.controller;

import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.model.Wednesday;
import com.omergunes.todolist.repo.TuesdayRepo;
import com.omergunes.todolist.repo.WednesdayRepo;
import com.omergunes.todolist.services.TuesdayService;
import com.omergunes.todolist.services.WednesdayService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/wednesday")
public class WednesdayController {
    @Autowired
    public WednesdayRepo wednesdayRepo;
    WednesdayService wednesdayService;

    @GetMapping("/getList")
    public List<Wednesday> findAll(){
        return wednesdayRepo.findAll();
    }
    @PostMapping("/add")
    public Wednesday add(@Validated @NotNull @RequestBody Wednesday wednesday){
        return wednesdayRepo.save(wednesday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Wednesday> wednesdayList(@PathVariable("id") Long id){
        wednesdayRepo.deleteById(id);
        return null;
    }
}

