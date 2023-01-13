package com.example.bookmyshowbackend.Repository;

import com.example.bookmyshowbackend.Model.TheatreSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreSeatRepository extends JpaRepository<TheatreSeat, Integer> {
}
