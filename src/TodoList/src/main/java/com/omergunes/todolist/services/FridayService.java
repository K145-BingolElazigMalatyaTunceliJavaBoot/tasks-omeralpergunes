package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.FridayConverter;
import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.exception.UncheckedException;
import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.repo.FridayRepo;
import com.omergunes.todolist.requestDto.SaveFridayRequestDto;
import com.omergunes.todolist.response.FridayResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FridayService {

    private final ModelMapper modelMapper;

    @Autowired
    FridayRepo fridayRepo;
    @Autowired
    FridayConverter fridayConverter;

    public void add(SaveFridayRequestDto saveFridayRequestDto) {

        Friday friday=fridayConverter.convertFridayRequestDtoFriday(saveFridayRequestDto);
        fridayRepo.save(friday);
    }

    public List<FridayResponseDto> findAll(String description){
        List<Friday> fridays=fridayRepo.findByDescription(description);
        List<FridayResponseDto> fridayResponseDtoList=new ArrayList<>();

        for (Friday friday : fridays) {
            FridayResponseDto fridayResponseDto = modelMapper.map(friday, FridayResponseDto.class);
            fridayResponseDto.add(fridayResponseDto);
        }
        return fridayResponseDtoList;
    }

    public void delete(long id) {

        Friday item=fridayRepo.findById(id).orElseThrow(()->
        { throw new UncheckedException("hata olustu");});
        fridayRepo.deleteById(item.getId());

    }}
