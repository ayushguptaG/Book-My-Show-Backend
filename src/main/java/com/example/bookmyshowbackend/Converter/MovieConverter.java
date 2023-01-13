package com.example.bookmyshowbackend.Converter;

import com.example.bookmyshowbackend.Model.Movie;
import com.example.bookmyshowbackend.RequestDto.MovieRequestDto;

public class MovieConverter {

    public static Movie convertDtoToEntity(MovieRequestDto movieRequestDto){
        Movie movie = Movie.builder().name(movieRequestDto.getName()).releaseDate(movieRequestDto.getReleaseDate())
                     .runTime(movieRequestDto.getRunTime()).build();

        return movie;
    }
}
