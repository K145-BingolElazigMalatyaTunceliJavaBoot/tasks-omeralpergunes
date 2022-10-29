package com.omergunes.todolist.configuration;

import com.omergunes.todolist.model.*;
import com.omergunes.todolist.requestDto.SaveFridayRequestDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class GeneralConfiguration {


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

   public static List<Monday> mondayList = new ArrayList<>();
    public static List<Tuesday> tuesdayList = new ArrayList<>();
    public static List<Wednesday> wednesdayList = new ArrayList<>();
    public static List<Thursday> thursdayList = new ArrayList<>();
    public static List<SaveFridayRequestDto> saveFridayRequestDtoList = new ArrayList<>();
    public static List<Saturday> saturdayList = new ArrayList<>();
    public static List<Sunday> sundayList = new ArrayList<>();


}

