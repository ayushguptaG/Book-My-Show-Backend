package com.example.bookmyshowbackend.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int amount;
    private Date bookedAt;
    private String seatsBooked;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Show show;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private ShowSeat showSeat;
}
