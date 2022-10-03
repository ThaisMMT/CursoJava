package com.thais.estudos.teste.designparttern.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    //Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AircraftSingletonEager(String name) {
        this.name = name;
    }


    public static AircraftSingletonEager getInstance(){
        return INSTANCE;
    }


    {
        availableSeats.add("1A");
        availableSeats.add("2A");

    }



    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
