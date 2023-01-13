package com.example.bookmyshowbackend.Repository;

import com.example.bookmyshowbackend.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
