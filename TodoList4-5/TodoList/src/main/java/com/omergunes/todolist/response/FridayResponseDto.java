package com.omergunes.todolist.response;

import lombok.Data;

@Data
public class FridayResponseDto {

    private String description;
    private boolean control;
    private String time;

    public void add(FridayResponseDto fridayResponseDto) {
    }
}
