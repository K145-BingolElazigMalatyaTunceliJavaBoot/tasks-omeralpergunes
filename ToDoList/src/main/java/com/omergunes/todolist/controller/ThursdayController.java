package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveThursdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateThursdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.ThursdayResponseDto;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.MondayRepo;
import com.omergunes.todolist.repo.ThursdayRepo;
import com.omergunes.todolist.services.MondayService;
import com.omergunes.todolist.services.ThursdayService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/thursday")
@RequiredArgsConstructor
public class ThursdayController {

    private final ThursdayService thursdayService;

    @PostMapping("/save")
    public ResponseEntity<String> saveThursday(@RequestBody SaveThursdayRequestDto saveThursdayRequestDto) {
        String thursdayId = thursdayService.saveThursday(saveThursdayRequestDto);
        return new ResponseEntity<>(thursdayId, HttpStatus.CREATED);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<ThursdayResponseDto>> getThursdayByDescription(@RequestParam String description) {
        List<ThursdayResponseDto> thursdayListByDescription = thursdayService.getThursdayListByDescription(description);
        return new ResponseEntity<>(thursdayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateThursday(@RequestBody UpdateThursdayRequestDto updateThursdayRequestDto) {
        String message = thursdayService.updateThursday(updateThursdayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return thursdayService.deleteThursday(id);
    }
}
