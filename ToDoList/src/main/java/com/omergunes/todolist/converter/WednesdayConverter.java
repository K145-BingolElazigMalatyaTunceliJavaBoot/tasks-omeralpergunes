package com.omergunes.todolist.converter;

import com.omergunes.todolist.dtos.responseDtos.TuesdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.WednesdayResponseDto;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.model.Wednesday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WednesdayConverter {

    public List<WednesdayResponseDto> convertWednesdayListToWednesdayResponseDtoList(List<Wednesday> wednesdayList){
        List<WednesdayResponseDto> wednesdayResponseDtoList = new ArrayList<>();

        for (Wednesday wednesday : wednesdayList) {
            WednesdayResponseDto wednesdayResponseDto = new WednesdayResponseDto();
            wednesdayResponseDto.setDescription(wednesday.getDescription());
            wednesdayResponseDto.setTime(wednesday.getTime());
            wednesdayResponseDtoList.add(wednesdayResponseDto);

        }
        return wednesdayResponseDtoList;
    }
}
