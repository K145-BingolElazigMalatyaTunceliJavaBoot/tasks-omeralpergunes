package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.SundayConverter;
import com.omergunes.todolist.converter.ThursdayConverter;
import com.omergunes.todolist.model.Sunday;
import com.omergunes.todolist.model.Thursday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SundayService {
    @Autowired
    SundayConverter sundayConverter;

    public List<Sunday> findAll(){
        List<Sunday> sundayList = GeneralConfiguration.sundayList;
        for(Sunday sunday:sundayList){
            sundayConverter.sundayConverter(sunday);

        }
        return sundayList;
    }
}
