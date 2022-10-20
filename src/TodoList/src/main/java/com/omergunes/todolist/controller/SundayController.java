package com.omergunes.todolist.controller;

import com.omergunes.todolist.model.Sunday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.SundayRepo;
import com.omergunes.todolist.services.SundayService;
import com.sun.istack.NotNull;
import org.aspectj.bridge.IMessageContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sunday")
public class SundayController {
    @Autowired
    public SundayRepo sundayRepo;
    SundayService sundayService;


    @GetMapping("/getList")
    public List<Sunday> findAll(){
        return sundayRepo.findAll();
    }
    @PostMapping("/add")
    public Sunday add(@Validated @NotNull @RequestBody Sunday sunday){
        return sundayRepo.save(sunday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Sunday> sundayList(@PathVariable("id") Long id){
        sundayRepo.deleteById(id);
        return null;
    }
}