package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    public static void printList(LinkedList<String> list){
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }
}
