package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.FridayConverter;
import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Monday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FridayService {
    @Autowired
    FridayConverter fridayConverter;

    public List<Friday> findAll(){
        List<Friday> fridayList = GeneralConfiguration.fridayList;
        for(Friday friday:fridayList){
            fridayConverter.fridayConverter(friday);

        }
        return fridayList;
    }
}
