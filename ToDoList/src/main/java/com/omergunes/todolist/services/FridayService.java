package com.omergunes.todolist.services;

import com.omergunes.todolist.converter.FridayConverter;

import com.omergunes.todolist.dtos.requestDtos.SaveFridayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateFridayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.FridayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.repo.FridayRepo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FridayService {


    private final FridayRepo fridayRepo;
    private final FridayConverter fridayConverter;
    private final ModelMapper modelMapper;


    public String save(SaveFridayRequestDto saveFridayRequestDto) {
        Friday friday = convertToFridayFromFridayRequestDto(saveFridayRequestDto);
        friday=fridayRepo.save(friday);

        return String.valueOf(friday.getId());
    }

    private Friday convertToFridayFromFridayRequestDto(SaveFridayRequestDto saveFridayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Friday friday = modelMapper1.map(saveFridayRequestDto, Friday.class);
        return friday;
    }

    public String updateTimeFriday(UpdateFridayRequestDto updateFridayRequestDto) {
        int id = updateFridayRequestDto.getId();
        String aciklama = updateFridayRequestDto.getAciklama();

        try {
            Optional<Friday> fridayRepositoryById = fridayRepo.findById(id);
            if (fridayRepositoryById.isPresent()) {
                Friday friday = fridayRepositoryById.get();
                friday.setDescription(aciklama);
                fridayRepo.save(friday);
                return "Güncelleme başarılı";
            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<FridayResponseDto> getFridayListByDescription(String description) {
        List<FridayResponseDto> fridayResponseDtoList = new ArrayList<>();
        List<Friday> fridayListByDescription = fridayRepo.findAllByDescription(description);
        for (Friday friday : fridayListByDescription) {
            FridayResponseDto fridayResponseDto = modelMapper.map(friday, FridayResponseDto.class);
            fridayResponseDtoList.add(fridayResponseDto);
        }
        return fridayResponseDtoList;
    }

    public Boolean deleteFriday(int id) {
        fridayRepo.deleteById(id);
        return !fridayRepo.existsById(id);
    }
}
