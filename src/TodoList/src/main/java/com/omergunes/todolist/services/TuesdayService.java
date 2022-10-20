package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Tuesday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuesdayService {

    @Autowired
    TuesdayConverter tuesdayConverter;

    public List<Tuesday> findAll(){
        List<Tuesday> tuesdayList = GeneralConfiguration.tuesdayList;
        for(Tuesday tuesday:tuesdayList){
            tuesdayConverter.tuesdayConverter(tuesday);

        }
        return tuesdayList;
    }
}
