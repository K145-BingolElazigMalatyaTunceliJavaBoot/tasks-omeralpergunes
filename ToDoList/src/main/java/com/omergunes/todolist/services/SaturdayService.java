package com.omergunes.todolist.services;


import com.omergunes.todolist.converter.SaturdayConverter;
import com.omergunes.todolist.dtos.requestDtos.SaveSaturdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateSaturdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.SaturdayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.repo.SaturdayRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaturdayService {
    private final SaturdayRepo saturdayRepo;
    private final SaturdayConverter saturdayConverter;
    private final ModelMapper modelMapper;


    public String saveSaturday(SaveSaturdayRequestDto saveSaturdayRequestDto) {
        Saturday saturday = convertToSaturdayFromSaturdayRequestDto(saveSaturdayRequestDto);
        saturday=saturdayRepo.save(saturday);

        return String.valueOf(saturday.getId());
    }

    private Saturday convertToSaturdayFromSaturdayRequestDto(SaveSaturdayRequestDto saveSaturdayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Saturday saturday = modelMapper1.map(saveSaturdayRequestDto, Saturday.class);
        return saturday;
    }

    public String updateSaturday(UpdateSaturdayRequestDto updateSaturdayRequestDto) {
        int id = updateSaturdayRequestDto.getId();
        String aciklama = updateSaturdayRequestDto.getAciklama();

        try {
            Optional<Saturday> saturdayRepositoryById = saturdayRepo.findById(id);
            if (saturdayRepositoryById.isPresent()) {
                Saturday saturday = saturdayRepositoryById.get();
                saturday.setDescription(aciklama);
                saturdayRepo.save(saturday);
                return "Güncelleme başarılı";

            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            message.printStackTrace();
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<SaturdayResponseDto> getSaturdayListByDescription(String description) {
        List<SaturdayResponseDto> saturdayResponseDtoList = new ArrayList<>();
        List<Saturday> saturdayListByDescription = saturdayRepo.findAllByDescription(description);
        for (Saturday saturday : saturdayListByDescription) {
            SaturdayResponseDto saturdayResponseDto = modelMapper.map(saturday, SaturdayResponseDto.class);
            saturdayResponseDtoList.add(saturdayResponseDto);
        }
        return saturdayResponseDtoList;
    }
    public Boolean deleteSaturday(int id) {
        saturdayRepo.deleteById(id);
        return !saturdayRepo.existsById(id);
    }
}
