package com.example.bookmyshowbackend.RequestDto;

import lombok.Data;

import java.util.Date;

@Data
public class MovieRequestDto {

    private String name;
    private int runTime;
    private Date releaseDate;
}
