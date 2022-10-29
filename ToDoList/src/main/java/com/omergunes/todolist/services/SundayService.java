package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.converter.SundayConverter;
import com.omergunes.todolist.converter.ThursdayConverter;
import com.omergunes.todolist.dtos.requestDtos.SaveMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveSundayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateSundayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.SundayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Sunday;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.repo.MondayRepo;
import com.omergunes.todolist.repo.SundayRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SundayService {
    private final SundayRepo sundayRepo;
    private final SundayConverter sundayConverter;
    private final ModelMapper modelMapper;


    public String saveSunday(SaveSundayRequestDto saveSundayRequestDto) {
        Sunday sunday = convertToSundayFromSundayRequestDto(saveSundayRequestDto);
        sunday=sundayRepo.save(sunday);

        return String.valueOf(sunday.getId());
    }

    private Sunday convertToSundayFromSundayRequestDto(SaveSundayRequestDto saveSundayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Sunday sunday = modelMapper1.map(saveSundayRequestDto, Sunday.class);
        return sunday;
    }

    public String updateSunday(UpdateSundayRequestDto updateSundayRequestDto) {
        int id = updateSundayRequestDto.getId();
        String aciklama = updateSundayRequestDto.getAciklama();

        try {
            Optional<Sunday> sundayRepositoryById = sundayRepo.findById(id);
            if (sundayRepositoryById.isPresent()) {
                Sunday sunday = sundayRepositoryById.get();
                sunday.setDescription(aciklama);
                sundayRepo.save(sunday);
                return "Güncelleme başarılı";
            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            message.printStackTrace();
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<SundayResponseDto> getSundayListByDescription(String description) {
        List<SundayResponseDto> sundayResponseDtoList = new ArrayList<>();
        List<Sunday> sundayListByDescription = sundayRepo.findAllByDescription(description);
        for (Sunday sunday : sundayListByDescription) {
            SundayResponseDto sundayResponseDto = modelMapper.map(sunday, SundayResponseDto.class);
            sundayResponseDtoList.add(sundayResponseDto);
        }
        return sundayResponseDtoList;
    }
    public Boolean deleteSunday(int id) {
        sundayRepo.deleteById(id);
        return !sundayRepo.existsById(id);
    }
}
