package com.omergunes.todolist.converter;

import com.omergunes.todolist.dtos.responseDtos.FridayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Monday;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MondayConverter {

        public List<MondayResponseDto> convertMondayListToMondayResponseDtoList(List<Monday> mondayList){
            List<MondayResponseDto> mondayResponseDtoList = new ArrayList<>();

            for (Monday monday : mondayList) {
                MondayResponseDto mondayResponseDto = new MondayResponseDto();
                mondayResponseDto.setDescription(monday.getDescription());
                mondayResponseDto.setTime(monday.getTime());
                mondayResponseDtoList.add(mondayResponseDto);

            }
            return mondayResponseDtoList;
        }
    }
