package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.Converter.UserConverter;
import com.example.bookmyshowbackend.Model.User;
import com.example.bookmyshowbackend.Repository.UserRepository;
import com.example.bookmyshowbackend.RequestDto.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){

        User user= UserConverter.convertDtoToEntity(userRequestDto);

        userRepository.save(user);
        return "User created successfully";
    }
}
