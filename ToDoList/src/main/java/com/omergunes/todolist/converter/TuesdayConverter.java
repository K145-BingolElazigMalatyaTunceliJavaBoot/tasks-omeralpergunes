package com.omergunes.todolist.converter;

import com.omergunes.todolist.dtos.responseDtos.ThursdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.TuesdayResponseDto;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.model.Tuesday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TuesdayConverter {
    public List<TuesdayResponseDto> convertTuesdayListToTuesdayResponseDtoList(List<Tuesday> tuesdayList){
        List<TuesdayResponseDto> tuesdayResponseDtoList = new ArrayList<>();

        for (Tuesday tuesday : tuesdayList) {
            TuesdayResponseDto tuesdayResponseDto = new TuesdayResponseDto();
            tuesdayResponseDto.setDescription(tuesday.getDescription());
            tuesdayResponseDto.setTime(tuesday.getTime());
            tuesdayResponseDtoList.add(tuesdayResponseDto);

        }
        return tuesdayResponseDtoList;
    }
}
