package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Node> graph = new ArrayList<>();

        graph.add(new Node("Bob"));
        graph.add(new Node("Alice"));
        graph.add(new Node("Clare"));

        graph.get(0).addNext(new Node("Peggy"));
        graph.get(0).addNext(new Node("Anna"));

        graph.get(1).addNext(new Node("Peggy"));

        graph.get(2).addNext(new Node("Tom"));
        graph.get(2).addNext(new Node("Johny"));

        graph.get(2).leftLink.get(1).giveMango();

        boolean mangoFound = false;
        ArrayList<ListItem> checked = new ArrayList<>();

        ArrayList<ListItem> toCheck = new ArrayList<>(graph);


        while (!mangoFound && toCheck.size()>0) {
            ListItem currentItem = toCheck.get(0);
            toCheck.remove(0);
            if (currentItem.hasMango()) {
                System.out.println(currentItem.getValue() + " has a mango");
                mangoFound = true;
            } else {
                if(!(checked.contains(currentItem))){
                    if (currentItem.leftLink != null) {
                        toCheck.addAll(currentItem.leftLink);
                    }
                    checked.add(currentItem);
                }
            }
        }

        if (!mangoFound) {
            System.out.println("There is no mango");
        }


    }
}
