package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.SaturdayConverter;
import com.omergunes.todolist.converter.ThursdayConverter;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.dtos.requestDtos.SaveSaturdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveThursdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateSaturdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateThursdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.SaturdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.ThursdayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.repo.SaturdayRepo;
import com.omergunes.todolist.repo.ThursdayRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ThursdayService {
    private final ThursdayRepo thursdayRepo;
    private final ThursdayConverter thursdayConverter;
    private final ModelMapper modelMapper;


    public String saveThursday(SaveThursdayRequestDto saveThursdayRequestDto) {
        Thursday thursday = convertToThursdayFromThursdayRequestDto(saveThursdayRequestDto);
        thursday=thursdayRepo.save(thursday);

        return String.valueOf(thursday.getId());
    }

    private Thursday convertToThursdayFromThursdayRequestDto(SaveThursdayRequestDto saveThursdayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Thursday thursday = modelMapper1.map(saveThursdayRequestDto, Thursday.class);
        return thursday;
    }
    public String updateThursday(UpdateThursdayRequestDto updateThursdayRequestDto) {
        int id = updateThursdayRequestDto.getId();
        String aciklama = updateThursdayRequestDto.getAciklama();

        try {
            Optional<Thursday> thursdayRepositoryById = thursdayRepo.findById(id);
            if (thursdayRepositoryById.isPresent()) {
                Thursday thursday = thursdayRepositoryById.get();
                thursday.setDescription(aciklama);
                thursdayRepo.save(thursday);
                return "Güncelleme başarılı";

            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            message.printStackTrace();
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<ThursdayResponseDto> getThursdayListByDescription(String description) {
        List<ThursdayResponseDto> thursdayResponseDtoList = new ArrayList<>();
        List<Thursday> thursdayListByDescription = thursdayRepo.findAllByDescription(description);
        for (Thursday thursday : thursdayListByDescription) {
            ThursdayResponseDto thursdayResponseDto = modelMapper.map(thursday, ThursdayResponseDto.class);
            thursdayResponseDtoList.add(thursdayResponseDto);
        }
        return thursdayResponseDtoList;
    }
    public Boolean deleteThursday(int id) {
        thursdayRepo.deleteById(id);
        return !thursdayRepo.existsById(id);
    }

}
