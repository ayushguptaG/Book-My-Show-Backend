package com.example.bookmyshowbackend.Controller;

import com.example.bookmyshowbackend.RequestDto.TheatreRequestDto;
import com.example.bookmyshowbackend.Service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/create")
    public String createTheatre(@RequestBody() TheatreRequestDto theatreRequestDto){

        return theatreService.createTheatre(theatreRequestDto);
    }
}
