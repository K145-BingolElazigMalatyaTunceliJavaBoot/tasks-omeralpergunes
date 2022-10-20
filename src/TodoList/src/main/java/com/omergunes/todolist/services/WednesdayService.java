package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.converter.WednesdayConverter;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.model.Wednesday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WednesdayService {
    @Autowired
    WednesdayConverter wednesdayConverter;

    public List<Wednesday> findAll(){
        List<Wednesday> wednesdayList = GeneralConfiguration.wednesdayList;
        for(Wednesday wednesday:wednesdayList){
            wednesdayConverter.wednesdayConverter(wednesday);

        }
        return wednesdayList;
    }
}
