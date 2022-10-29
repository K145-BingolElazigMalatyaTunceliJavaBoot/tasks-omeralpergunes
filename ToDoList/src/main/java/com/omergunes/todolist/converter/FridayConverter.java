package com.omergunes.todolist.converter;

import com.omergunes.todolist.dtos.responseDtos.FridayResponseDto;
import com.omergunes.todolist.model.Friday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FridayConverter {

    public List<FridayResponseDto> convertFridayListToFridayResponseDtoList(List<Friday> fridayList){
        List<FridayResponseDto> fridayResponseDtoList = new ArrayList<>();

        for (Friday friday : fridayList) {
            FridayResponseDto fridayResponseDto = new FridayResponseDto();
            fridayResponseDto.setDescription(friday.getDescription());
            fridayResponseDto.setTime(friday.getTime());
            fridayResponseDtoList.add(fridayResponseDto);

        }
        return fridayResponseDtoList;
    }
}
