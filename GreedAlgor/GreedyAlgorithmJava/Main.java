package com.company;

import java.util.*;

public class Main {
    private static Map<String,Station> StationTable = new Hashtable<>();
    private static Set<Station> allStations = new HashSet<>();
    public static void main(String[] args) {
        Set<Station> finalStations = new HashSet<>();

        ArrayList<State> states = new ArrayList<>();
        states.add(new State("mt"));
        states.add(new State("wa"));
        states.add(new State("or"));
        states.add(new State("id"));
        states.add(new State("nv"));
        states.add(new State("ut"));
        states.add(new State("ca"));
        states.add(new State("az"));

        Set<State> statesNeeded = new HashSet<>(states);

        Station temp = new Station("kone");
        temp.addState(states.get(3));
        temp.addState(states.get(4));
        temp.addState(states.get(5));
        StationTable.put(temp.getName(),temp);
        allStations.add(temp);

        temp = new Station("ktwo");
        temp.addState(states.get(3));
        temp.addState(states.get(1));
        temp.addState(states.get(0));
        StationTable.put(temp.getName(),temp);
        allStations.add(temp);

        temp = new Station("kthree");
        temp.addState(states.get(2));
        temp.addState(states.get(4));
        temp.addState(states.get(6));
        StationTable.put(temp.getName(),temp);
        allStations.add(temp);

        temp = new Station("kfour");
        temp.addState(states.get(4));
        temp.addState(states.get(5));
        StationTable.put(temp.getName(),temp);
        allStations.add(temp);

        temp = new Station("kfive");
        temp.addState(states.get(6));
        temp.addState(states.get(7));
        StationTable.put(temp.getName(),temp);
        allStations.add(temp);

        while(statesNeeded.size()>0){
            Station bestStation = null;
            Set<State> statesCovered = new HashSet<>();
            for (Station st: allStations) {
                Set<State> covered = new HashSet<>(statesNeeded);
                covered.retainAll(st.getStatesCover());
                if(covered.size()> statesCovered.size()){
                    bestStation = st;
                    statesCovered = covered;
                }
            }
            statesNeeded.removeAll(statesCovered);
            finalStations.add(bestStation);
        }

        System.out.println("Stations needed:");

        for (Station st: finalStations) {
            System.out.println(st.getName());
        }



    }
}
