package com.omergunes.todolist.converter;

import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.SaturdayResponseDto;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Saturday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SaturdayConverter {

    public List<SaturdayResponseDto> convertSaturdayListToSaturdayResponseDtoList(List<Saturday> saturdayList){
        List<SaturdayResponseDto> saturdayResponseDtoList = new ArrayList<>();

        for (Saturday saturday : saturdayList) {
            SaturdayResponseDto saturdayResponseDto = new SaturdayResponseDto();
            saturdayResponseDto.setDescription(saturday.getDescription());
            saturdayResponseDto.setTime(saturday.getTime());
            saturdayResponseDtoList.add(saturdayResponseDto);

        }
        return saturdayResponseDtoList;
    }
}
