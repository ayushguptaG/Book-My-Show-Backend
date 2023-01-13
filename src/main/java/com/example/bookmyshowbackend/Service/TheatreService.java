package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.Converter.TheatreConverter;
import com.example.bookmyshowbackend.Enum.SeatType;
import com.example.bookmyshowbackend.Model.Theatre;
import com.example.bookmyshowbackend.Model.TheatreSeat;
import com.example.bookmyshowbackend.Repository.TheatreRepository;
import com.example.bookmyshowbackend.RequestDto.TheatreRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    public String createTheatre(TheatreRequestDto theatreRequestDto){

        Theatre theatre= TheatreConverter.convertDtoToEntity(theatreRequestDto);

        List<TheatreSeat> theatreSeats= createTheatreSeat();

        // parent-child mapping
        theatre.setListOfTheatreSeats(theatreSeats);

        //child-parent mapping (bidirectional)
        for(TheatreSeat seats : theatreSeats){
            seats.setTheatre(theatre);
        }

        theatreRepository.save(theatre);

        return "Theatre created successfully";
    }
    private List<TheatreSeat> createTheatreSeat(){

        List<TheatreSeat> theatreSeats= new ArrayList<>();

        String[] seatsNum= new String[]{"1A","2A","3A","4A","5A","1B","2B","3B","4B","5B"};

        SeatType type= SeatType.PLATINUM;
        int price= 150;
        for(int i=0; i<10; i++){
            if(i>4) {
                type= SeatType.GOLD;
                price= 100;
            }
            theatreSeats.add(new TheatreSeat(seatsNum[i], type, price));
        }

//        TheatreSeat seat1= new TheatreSeat("1A", SeatType.PLATINUM,150);
//        TheatreSeat seat2= new TheatreSeat("2A", SeatType.PLATINUM,150);
//        TheatreSeat seat3= new TheatreSeat("3A", SeatType.PLATINUM,150);
//        TheatreSeat seat4= new TheatreSeat("4A", SeatType.PLATINUM,150);
//        TheatreSeat seat5= new TheatreSeat("5A", SeatType.PLATINUM,150);
//        TheatreSeat seat6= new TheatreSeat("1B", SeatType.GOLD,100);
//        TheatreSeat seat7= new TheatreSeat("2B", SeatType.GOLD,100);
//        TheatreSeat seat8= new TheatreSeat("3B", SeatType.GOLD,100);
//        TheatreSeat seat9= new TheatreSeat("4B", SeatType.GOLD,100);
//        TheatreSeat seat10= new TheatreSeat("5B", SeatType.GOLD,100);
//
//        theatreSeats.add(seat1);
//        theatreSeats.add(seat2);
//        theatreSeats.add(seat3);
//        theatreSeats.add(seat4);
//        theatreSeats.add(seat5);
//        theatreSeats.add(seat6);
//        theatreSeats.add(seat7);
//        theatreSeats.add(seat8);
//        theatreSeats.add(seat9);
//        theatreSeats.add(seat10);

        return theatreSeats;

    }
}
