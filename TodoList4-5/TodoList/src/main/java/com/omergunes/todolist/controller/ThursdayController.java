package com.omergunes.todolist.controller;

import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.MondayRepo;
import com.omergunes.todolist.repo.ThursdayRepo;
import com.omergunes.todolist.services.MondayService;
import com.omergunes.todolist.services.ThursdayService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/thursday")
public class ThursdayController {

    @Autowired

    public ThursdayRepo thursdayRepo;
    ThursdayService thursdayService;

    @GetMapping("/getList")
    public List<Thursday> findAll(){
        return thursdayRepo.findAll();
    }
    @PostMapping("/add")
    public Thursday add(@Validated @NotNull @RequestBody Thursday thursday){
        return thursdayRepo.save(thursday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Thursday> thursdayList(@PathVariable("id") Long id){
        thursdayRepo.deleteById(id);
        return null;
    }
}
