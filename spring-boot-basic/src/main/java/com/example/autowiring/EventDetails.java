package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EventDetails {

    @Autowired
    @Qualifier("footBall")
    ISports football;

    @Autowired
    @Qualifier("cricket")
    ISports cricket;
    @Autowired
    @Qualifier("hockey")
    ISports hockey;

//    public void setSports(ISports sports) {
//        this.sports = sports;
//    }
    public List<String> printEvent(String choise){
        if (choise.equalsIgnoreCase("C")) {
            System.out.println("Cricket");
            return cricket.showPlayers();
        }
        if (choise.equalsIgnoreCase("F")) {
            System.out.println("Footbal");
            return football.showPlayers();
        } if (choise.equalsIgnoreCase("H")) {
            System.out.println("Hockey");
            return hockey.showPlayers();
        }
        return new ArrayList<>();

    }
}
