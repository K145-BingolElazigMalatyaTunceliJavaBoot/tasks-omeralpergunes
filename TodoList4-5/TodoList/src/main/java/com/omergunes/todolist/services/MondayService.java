package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.model.Monday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MondayService {


    @Autowired
    MondayConverter mondayConverter;

    public List<Monday> findAll(){
        List<Monday> mondayList = GeneralConfiguration.mondayList;
        for(Monday monday:mondayList){
            mondayConverter.mondayConvert(monday);

        }
        return mondayList;
    }
}
