package com.example.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FootBall implements ISports{
    List<String> players;
    public List<String> getPlayers() {
        return players;
    }
    @Value("#{'${football.players}'.split(',')}")
    public void setPlayers(List<String> players) {
        this.players = players;
    }
    @Override
    public List<String> showPlayers() {

        return getPlayers();

    }

}
