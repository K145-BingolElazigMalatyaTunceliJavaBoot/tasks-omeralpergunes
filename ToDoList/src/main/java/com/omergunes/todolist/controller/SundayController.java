package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveFridayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveSundayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateFridayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateSundayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.FridayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.SundayResponseDto;
import com.omergunes.todolist.model.Sunday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.SundayRepo;
import com.omergunes.todolist.services.FridayService;
import com.omergunes.todolist.services.SundayService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.aspectj.bridge.IMessageContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sunday")
@RequiredArgsConstructor
public class SundayController {
    private final SundayService sundayService;

    @PostMapping("/save")
    public ResponseEntity<String> saveSunday(@RequestBody SaveSundayRequestDto saveSundayRequestDto) {
        String sundayId = sundayService.saveSunday(saveSundayRequestDto);
        return new ResponseEntity<>(sundayId, HttpStatus.CREATED);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<SundayResponseDto>> getSundayByDescription(@RequestParam String description) {
        List<SundayResponseDto> sundayListByDescription = sundayService.getSundayListByDescription(description);
        return new ResponseEntity<>(sundayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateMonday(@RequestBody UpdateSundayRequestDto updateSundayRequestDto) {
        String message = sundayService.updateSunday(updateSundayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return sundayService.deleteSunday(id);
    }
}