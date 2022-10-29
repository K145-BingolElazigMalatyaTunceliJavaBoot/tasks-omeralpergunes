package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveFridayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateFridayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.FridayResponseDto;
import com.omergunes.todolist.services.FridayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friday")
@RequiredArgsConstructor
public class FridayController {

    private final FridayService fridayService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody SaveFridayRequestDto saveFridayRequestDto) {
        String fridayId = fridayService.save(saveFridayRequestDto);
        return new ResponseEntity<>(fridayId, HttpStatus.CREATED);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<FridayResponseDto>> getFridayByDescription(@RequestParam String description) {
        List<FridayResponseDto> fridayListByDescription = fridayService.getFridayListByDescription(description);
        return new ResponseEntity<>(fridayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateTimeFriday(@RequestBody UpdateFridayRequestDto updateFridayRequestDto) {
        String message = fridayService.updateTimeFriday(updateFridayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return fridayService.deleteFriday(id);
    }
}
