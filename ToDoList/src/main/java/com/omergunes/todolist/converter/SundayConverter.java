package com.omergunes.todolist.converter;

import com.omergunes.todolist.dtos.responseDtos.SaturdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.SundayResponseDto;
import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Sunday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SundayConverter {
    public List<SundayResponseDto> convertSundayListToSundayResponseDtoList(List<Sunday> sundayList){
        List<SundayResponseDto> sundayResponseDtoList = new ArrayList<>();

        for (Sunday sunday : sundayList) {
            SundayResponseDto sundayResponseDto = new SundayResponseDto();
            sundayResponseDto.setDescription(sunday.getDescription());
            sundayResponseDto.setTime(sunday.getTime());
            sundayResponseDtoList.add(sundayResponseDto);

        }
        return sundayResponseDtoList;
    }
}
