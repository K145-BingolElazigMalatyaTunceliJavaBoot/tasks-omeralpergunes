package com.omergunes.todolist.controller;


import com.omergunes.todolist.requestDto.SaveFridayRequestDto;
import com.omergunes.todolist.response.FridayResponseDto;
import com.omergunes.todolist.services.FridayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friday")
public class FridayController {

    @Autowired
    FridayService fridayService;

    public FridayController(FridayService fridayService) {
        this.fridayService=fridayService;
    }

    @GetMapping("/getList")
    public ResponseEntity<List<FridayResponseDto>> findAll(@RequestParam String description){
        List<FridayResponseDto> fridayResponseDtos = fridayService.findAll(description);
        return new ResponseEntity<>(fridayResponseDtos, HttpStatus.OK);
        }

    @PostMapping("/add")
    public ResponseEntity<List<SaveFridayRequestDto>> add(@RequestBody SaveFridayRequestDto saveFridayRequestDto){
        fridayService.add(saveFridayRequestDto);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<SaveFridayRequestDto>> delete(@PathVariable long id) {
        fridayService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
