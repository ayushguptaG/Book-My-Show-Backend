package com.example.bookmyshowbackend.Controller;

import com.example.bookmyshowbackend.RequestDto.MovieRequestDto;
import com.example.bookmyshowbackend.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/create")
    public String createMovie(@RequestBody() MovieRequestDto movieRequestDto){
        return movieService.createMovie(movieRequestDto);
    }

}
