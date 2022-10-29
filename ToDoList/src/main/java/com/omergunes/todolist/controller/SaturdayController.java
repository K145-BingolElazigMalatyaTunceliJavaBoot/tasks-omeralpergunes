package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveSaturdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateSaturdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.SaturdayResponseDto;
import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.SaturdayRepo;
import com.omergunes.todolist.services.MondayService;
import com.omergunes.todolist.services.SaturdayService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saturday")
@RequiredArgsConstructor
public class SaturdayController {

    private final SaturdayService saturdayService;

    @PostMapping("/save")
    public ResponseEntity<String> saveSaturday(@RequestBody SaveSaturdayRequestDto saveSaturdayRequestDto) {
        String saturdayId = saturdayService.saveSaturday(saveSaturdayRequestDto);
        return new ResponseEntity<>(saturdayId, HttpStatus.CREATED);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<SaturdayResponseDto>> getSaturdayByDescription(@RequestParam String description) {
        List<SaturdayResponseDto> saturdayListByDescription = saturdayService.getSaturdayListByDescription(description);
        return new ResponseEntity<>(saturdayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateSaturday(@RequestBody UpdateSaturdayRequestDto updateSaturdayRequestDto) {
        String message = saturdayService.updateSaturday(updateSaturdayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return saturdayService.deleteSaturday(id);
    }
}
