package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveTuesdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveWednesdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateTuesdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateWednesdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.TuesdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.WednesdayResponseDto;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.model.Wednesday;
import com.omergunes.todolist.repo.TuesdayRepo;
import com.omergunes.todolist.repo.WednesdayRepo;
import com.omergunes.todolist.services.TuesdayService;
import com.omergunes.todolist.services.WednesdayService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/wednesday")
@RequiredArgsConstructor
public class WednesdayController {
    private final WednesdayService wednesdayService;

    @PostMapping("/save")
    public ResponseEntity<String> saveWednesday(@RequestBody SaveWednesdayRequestDto saveWednesdayRequestDto) {
        String wednesdayId = wednesdayService.saveWednesday(saveWednesdayRequestDto);
        return new ResponseEntity<>(wednesdayId, HttpStatus.CREATED);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<WednesdayResponseDto>> getWednesdayByDescription(@RequestParam String description) {
        List<WednesdayResponseDto> wednesdayListByDescription = wednesdayService.getWednesdayListByDescription(description);
        return new ResponseEntity<>(wednesdayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateWednesday(@RequestBody UpdateWednesdayRequestDto updateWednesdayRequestDto) {
        String message = wednesdayService.updateWednesday(updateWednesdayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return wednesdayService.deleteWednesday(id);
    }
}

