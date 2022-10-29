package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.converter.SaturdayConverter;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.dtos.requestDtos.SaveSaturdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveTuesdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateSaturdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateTuesdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.SaturdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.TuesdayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.model.Saturday;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.repo.SaturdayRepo;
import com.omergunes.todolist.repo.TuesdayRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TuesdayService {

    private final TuesdayRepo tuesdayRepo;
    private final TuesdayConverter tuesdayConverter;
    private final ModelMapper modelMapper;


    public String saveTuesday(SaveTuesdayRequestDto saveTuesdayRequestDto) {
        Tuesday tuesday = convertToTuesdayFromTuesdayRequestDto(saveTuesdayRequestDto);
        tuesday=tuesdayRepo.save(tuesday);

        return String.valueOf(tuesday.getId());
    }

    private Tuesday convertToTuesdayFromTuesdayRequestDto(SaveTuesdayRequestDto saveTuesdayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Tuesday tuesday = modelMapper1.map(saveTuesdayRequestDto, Tuesday.class);
        return tuesday;
    }

    public String updateTuesday(UpdateTuesdayRequestDto updateTuesdayRequestDto) {
        int id = updateTuesdayRequestDto.getId();
        String aciklama = updateTuesdayRequestDto.getAciklama();

        try {
            Optional<Tuesday> tuesdayRepositoryById = tuesdayRepo.findById(id);
            if (tuesdayRepositoryById.isPresent()) {
                Tuesday tuesday = tuesdayRepositoryById.get();
                tuesday.setDescription(aciklama);
                tuesdayRepo.save(tuesday);
                return "Güncelleme başarılı";

            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            message.printStackTrace();
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<TuesdayResponseDto> getTuesdayListByDescription(String description) {
        List<TuesdayResponseDto> tuesdayResponseDtoList = new ArrayList<>();
        List<Tuesday> tuesdayListByDescription = tuesdayRepo.findAllByDescription(description);
        for (Tuesday tuesday : tuesdayListByDescription) {
            TuesdayResponseDto tuesdayResponseDto = modelMapper.map(tuesday, TuesdayResponseDto.class);
            tuesdayResponseDtoList.add(tuesdayResponseDto);
        }
        return tuesdayResponseDtoList;
    }

    public Boolean deleteTuesday(int id) {
        tuesdayRepo.deleteById(id);
        return !tuesdayRepo.existsById(id);
    }
}
