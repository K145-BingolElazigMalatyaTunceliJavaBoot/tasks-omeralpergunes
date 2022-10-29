package com.omergunes.todolist.converter;

import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.requestDto.SaveFridayRequestDto;
import org.springframework.stereotype.Component;

@Component
public class FridayConverter {

    public Friday convertFridayRequestDtoFriday (SaveFridayRequestDto item) {
        Friday friday = new Friday();
        friday.setDescription(item.getDescription());
        friday.setControl(item.isControl());
        friday.setTime(item.getTime());
        return friday;
    }
    public SaveFridayRequestDto convertFridayToFridayRequestDto(Friday item) {
        SaveFridayRequestDto saveFridayRequestDto=new SaveFridayRequestDto();
        saveFridayRequestDto.setDescription(item.getDescription());
        saveFridayRequestDto.setControl(item.isControl());
        saveFridayRequestDto.setTime(item.getTime());
        return saveFridayRequestDto;
    }

}
