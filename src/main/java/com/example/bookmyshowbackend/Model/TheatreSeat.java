package com.example.bookmyshowbackend.Model;


import com.example.bookmyshowbackend.Enum.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TheatreSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatNumber;
    @Enumerated(value= EnumType.STRING)
    private SeatType seatType;
    private int baseRate;

    @ManyToOne
    @JoinColumn
    private Theatre theatre;

    public TheatreSeat(String seatNumber, SeatType seatType, int rate){
        this.seatNumber= seatNumber;
        this.seatType= seatType;
        this.baseRate= rate;
    }


}

