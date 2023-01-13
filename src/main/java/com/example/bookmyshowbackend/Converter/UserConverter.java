package com.example.bookmyshowbackend.Converter;

import com.example.bookmyshowbackend.Model.User;
import com.example.bookmyshowbackend.RequestDto.UserRequestDto;
import lombok.Data;


public class UserConverter {

    public static User convertDtoToEntity(UserRequestDto userRequestDto){

        User user= User.builder().name(userRequestDto.getName()).email(userRequestDto.getEmail())
                .mobile(userRequestDto.getMobile()).build();

        return user;
    }
}
