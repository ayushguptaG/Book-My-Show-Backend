package com.example.bookmyshowbackend.Model;

import com.example.bookmyshowbackend.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatNumber;
    private int rate;
    private SeatType seatType;
    private boolean bookingStatus;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private Ticket ticket;

    @ManyToOne
    @JoinColumn
    private Show show;
}
