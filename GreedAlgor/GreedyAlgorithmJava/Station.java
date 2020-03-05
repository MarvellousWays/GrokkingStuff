package com.company;

import java.util.HashSet;
import java.util.Set;

public  class Station {
    private  String name;
    private  Set<State> statesCover;

    public Station(String name) {
        this.name = name;
        this.statesCover = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean addState(State st){
        return statesCover.add(st);
    }

    public Set<State> getStatesCover() {
        return new HashSet<>(statesCover);
    }
}
