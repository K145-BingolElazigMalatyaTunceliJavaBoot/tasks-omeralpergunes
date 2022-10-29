package com.omergunes.todolist.services;

import com.omergunes.todolist.configuration.GeneralConfiguration;
import com.omergunes.todolist.converter.ThursdayConverter;
import com.omergunes.todolist.converter.TuesdayConverter;
import com.omergunes.todolist.converter.WednesdayConverter;
import com.omergunes.todolist.dtos.requestDtos.SaveThursdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.SaveWednesdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateThursdayRequestDto;
import com.omergunes.todolist.dtos.requestDtos.UpdateWednesdayRequestDto;
import com.omergunes.todolist.dtos.responseDtos.ThursdayResponseDto;
import com.omergunes.todolist.dtos.responseDtos.WednesdayResponseDto;
import com.omergunes.todolist.exceptions.ExceptionHandling;
import com.omergunes.todolist.model.Thursday;
import com.omergunes.todolist.model.Tuesday;
import com.omergunes.todolist.model.Wednesday;
import com.omergunes.todolist.repo.ThursdayRepo;
import com.omergunes.todolist.repo.WednesdayRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WednesdayService {
    private final WednesdayRepo wednesdayRepo;
    private final WednesdayConverter wednesdayConverter;
    private final ModelMapper modelMapper;


    public String saveWednesday(SaveWednesdayRequestDto saveWednesdayRequestDto) {
        Wednesday wednesday = convertToWednesdayFromWednesdayRequestDto(saveWednesdayRequestDto);
        wednesday=wednesdayRepo.save(wednesday);

        return String.valueOf(wednesday.getId());
    }

    private Wednesday convertToWednesdayFromWednesdayRequestDto(SaveWednesdayRequestDto saveWednesdayRequestDto) {
        ModelMapper modelMapper1 = new ModelMapper();
        Wednesday wednesday = modelMapper1.map(saveWednesdayRequestDto, Wednesday.class);
        return wednesday;
    }
    public String updateWednesday(UpdateWednesdayRequestDto updateWednesdayRequestDto) {
        int id = updateWednesdayRequestDto.getId();
        String aciklama = updateWednesdayRequestDto.getAciklama();

        try {
            Optional<Wednesday> wednesdayRepositoryById = wednesdayRepo.findById(id);
            if (wednesdayRepositoryById.isPresent()) {
                Wednesday wednesday = wednesdayRepositoryById.get();
                wednesday.setDescription(aciklama);
                wednesdayRepo.save(wednesday);
                return "Güncelleme başarılı";

            }
            return "Böyle bir kullanıcı yoktur, tekrar deneyiniz";
        } catch (ExceptionHandling message) {
            message.printStackTrace();
            return "HATA. Lütfen tekrar deneyiniz";
        }
    }
    public List<WednesdayResponseDto> getWednesdayListByDescription(String description) {
        List<WednesdayResponseDto> wednesdayResponseDtoList = new ArrayList<>();
        List<Wednesday> wednesdayListByDescription = wednesdayRepo.findAllByDescription(description);
        for (Wednesday wednesday : wednesdayListByDescription) {
            WednesdayResponseDto wednesdayResponseDto = modelMapper.map(wednesday, WednesdayResponseDto.class);
            wednesdayResponseDtoList.add(wednesdayResponseDto);
        }
        return wednesdayResponseDtoList;
    }

    public Boolean deleteWednesday(int id) {
        wednesdayRepo.deleteById(id);
        return !wednesdayRepo.existsById(id);
    }

}
