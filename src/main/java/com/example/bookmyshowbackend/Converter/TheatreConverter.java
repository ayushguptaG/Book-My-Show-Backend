package com.example.bookmyshowbackend.Converter;

import com.example.bookmyshowbackend.Model.Theatre;
import com.example.bookmyshowbackend.RequestDto.TheatreRequestDto;

public class TheatreConverter {

    public static Theatre convertDtoToEntity(TheatreRequestDto theatreRequestDto){

        Theatre theatre= Theatre.builder().name(theatreRequestDto.getName()).city(theatreRequestDto.getCity())
                        .address(theatreRequestDto.getAddress()).build();

        return theatre;
    }
}
