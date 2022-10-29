package com.omergunes.todolist.controller;

import com.omergunes.todolist.dtos.requestDtos.SaveThursdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveTuesdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateThursdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateTuesdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.ThursdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.TuesdayResponseDto;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.repo.TuesdayRepo;
import com.omergunes.todolist.services.ThursdayService;
import com.omergunes.todolist.services.TuesdayService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tuesday")
@RequiredArgsConstructor
public class TuesdayController {

    private final TuesdayService tuesdayService;

    @PostMapping("/save")
    public ResponseEntity<String> saveTuesday(@RequestBody SaveTuesdayRequestDto saveTuesdayRequestDto) {
        String tuesdayId = tuesdayService.saveTuesday(saveTuesdayRequestDto);
        return new ResponseEntity<>(tuesdayId, HttpStatus.CREATED);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<TuesdayResponseDto>> getTuesdayByDescription(@RequestParam String description) {
        List<TuesdayResponseDto> tuesdayListByDescription = tuesdayService.getTuesdayListByDescription(description);
        return new ResponseEntity<>(tuesdayListByDescription, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateTuesday(@RequestBody UpdateTuesdayRequestDto updateTuesdayRequestDto) {
        String message = tuesdayService.updateTuesday(updateTuesdayRequestDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") int id) {
        return tuesdayService.deleteTuesday(id);
    }
}
