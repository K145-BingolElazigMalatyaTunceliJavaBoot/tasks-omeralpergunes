package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.SaturdayConverter;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Tuesday;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaturdayService {
    @Autowired
    SaturdayConverter saturdayConverter;

    public List<Saturday> findAll(){
        List<Saturday> saturdayList = GeneralConfiguration.saturdayList;
        for(Saturday saturday:saturdayList){
            saturdayConverter.saturdayConverter(saturday);

        }
        return saturdayList;
    }
}
