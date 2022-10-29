package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.ThursdayConverter;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.model.Tuesday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThursdayService {
    @Autowired
    ThursdayConverter thursdayConverter;

    public List<Thursday> findAll(){
        List<Thursday> thursdayList = GeneralConfiguration.thursdayList;
        for(Thursday thursday:thursdayList){
            thursdayConverter.thursdayConverter(thursday);

        }
        return thursdayList;
    }
}
