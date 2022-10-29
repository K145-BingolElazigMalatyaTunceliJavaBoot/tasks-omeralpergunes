package com.omergunes.todolist.services;

import com.omergunes.todolist.converter.MondayConverter;
import com.omergunes.todolist.dtos.requestDtos.SaveMondayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateMondayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.MondayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Friday;
import com.omergunes.todolist.model.Monday;
import com.omergunes.todolist.repo.MondayRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MondayService {


    private final MondayRepo mondayRepo;
    private final MondayConverter mondayConverter;
    private final ModelMapper modelMapper;


    public String saveMonday(SaveMondayRequestDto saveMondayRequestDto) {
        Monday monday = convertToMondayFromMondayRequestDto(saveMondayRequestDto);
        monday=mondayRepo.save(monday);

        return String.valueOf(monday.getId());
    }

    private Monday convertToMondayFromMondayRequestDto(SaveMondayRequestDto saveMondayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Monday monday = modelMapper1.map(saveMondayRequestDto, Monday.class);
        return monday;
    }

    public String updateTimeMonday(UpdateMondayRequestDto updateMondayRequestDto) {
        int id = updateMondayRequestDto.getId();
        String aciklama = updateMondayRequestDto.getAciklama();

        try {
            Optional<Monday> mondayRepositoryById = mondayRepo.findById(id);
            if (mondayRepositoryById.isPresent()) {
                Monday monday = mondayRepositoryById.get();
                monday.setDescription(aciklama);
                mondayRepo.save(monday);
                return "Güncelleme başarılı";

            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<MondayResponseDto> getMondayListByDescription(String description) {
        List<MondayResponseDto> mondayResponseDtoList = new ArrayList<>();
        List<Monday> mondayListByDescription = mondayRepo.findAllByDescription(description);
        for (Monday monday : mondayListByDescription) {
            MondayResponseDto mondayResponseDto = modelMapper.map(monday, MondayResponseDto.class);
            mondayResponseDtoList.add(mondayResponseDto);
        }
        return mondayResponseDtoList;
    }

    public Boolean deleteMonday(int id) {
        mondayRepo.deleteById(id);
        return !mondayRepo.existsById(id);
    }
}
