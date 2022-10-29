package com.omergunes.todolist.configuration;

import com.omergunes.todolist.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class GeneralConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}

