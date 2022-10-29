package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveFridayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateFridayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateMondayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.FridayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.services.FridayService;
import com.omergunes.todolist.services.MondayService;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.repo.MondayRepo;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monday")
@RequiredArgsConstructor
public class MondayController {

    private final MondayService mondayService;

    @PostMapping("/save")
    public ResponseEntity<String> saveMonday(@RequestBody SaveMondayRequestDto saveMondayRequestDto) {
        String mondayId = mondayService.saveMonday(saveMondayRequestDto);
        return new ResponseEntity<>(mondayId, HttpStatus.CREATED);
    }

    @GetMapping("/mondayList")
    public ResponseEntity<List<MondayResponseDto>> getMondayByDescription(@RequestParam String description) {
        List<MondayResponseDto> mondayListByDescription = mondayService.getMondayListByDescription(description);
        return new ResponseEntity<>(mondayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/updateMonday")
    public ResponseEntity<String> updateTimeMonday(@RequestBody UpdateMondayRequestDto updateMondayRequestDto) {
        String message = mondayService.updateTimeMonday(updateMondayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return mondayService.deleteMonday(id);
    }
}
