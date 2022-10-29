package com.omergunes.todolist.converter;


import com.omergunes.todolist.dtos.responseDtos.ThursdayResponseDto;
import com.omergunes.todolist.model.Thursday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ThursdayConverter {
    public List<ThursdayResponseDto> convertThursdayListToThursdayResponseDtoList(List<Thursday> thursdayList){
        List<ThursdayResponseDto> thursdayResponseDtoList = new ArrayList<>();

        for (Thursday thursday : thursdayList) {
            ThursdayResponseDto thursdayResponseDto = new ThursdayResponseDto();
            thursdayResponseDto.setDescription(thursday.getDescription());
            thursdayResponseDto.setTime(thursday.getTime());
            thursdayResponseDtoList.add(thursdayResponseDto);

        }
        return thursdayResponseDtoList;
    }
}
