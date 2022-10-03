package com.thais.estudos.teste.designparttern.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE = new AircraftSingletonLazy("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AircraftSingletonLazy(String name) {
        this.name = name;
    }


    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }


    {
        availableSeats.add("1A");
        availableSeats.add("2A");

    }


    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
