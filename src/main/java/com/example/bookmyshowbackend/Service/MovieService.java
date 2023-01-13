package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.Controller.MovieController;
import com.example.bookmyshowbackend.Converter.MovieConverter;
import com.example.bookmyshowbackend.Model.Movie;
import com.example.bookmyshowbackend.Repository.MovieRepository;
import com.example.bookmyshowbackend.RequestDto.MovieRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String createMovie(MovieRequestDto movieRequestDto){

        Movie movie= MovieConverter.convertDtoToEntity(movieRequestDto);

        movieRepository.save(movie);

        return "Movie created successfully";
    }
}
