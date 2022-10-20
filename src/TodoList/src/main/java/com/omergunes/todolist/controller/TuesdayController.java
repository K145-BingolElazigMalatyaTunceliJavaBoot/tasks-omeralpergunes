package com.omergunes.todolist.controller;

import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.repo.TuesdayRepo;
import com.omergunes.todolist.services.TuesdayService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tuesday")
public class TuesdayController {

    @Autowired
    public TuesdayRepo tuesdayRepo;
    TuesdayService tuesdayService;

    @GetMapping("/getList")

    public List<Tuesday> findAll(){
        return tuesdayRepo.findAll();
    }
    @PostMapping("/add")
    public Tuesday add(@Validated @NotNull @RequestBody Tuesday tuesday){
        return tuesdayRepo.save(tuesday);
    }
    @DeleteMapping("/delete/{id}")
    public List<Tuesday> tuesdayList(@PathVariable("id") Long id){
        tuesdayRepo.deleteById(id);
        return null;
    }
}
