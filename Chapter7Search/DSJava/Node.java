package com.company;

import java.util.ArrayList;

public class Node {
    private Object value;
    private ArrayList<Edge> leftLink;

    public Node(Object value) {
        this.value = value;
        this.leftLink = new ArrayList<>();
    }

    public boolean addEdge(long value, Node next) {
        Edge edge = new Edge(value,next);
        if (leftLink.contains(edge)) {
            return false;
        } else {
            leftLink.add(edge);
            return true;
        }
    }

    public int leftLinkSize(){
        return leftLink.size();
    }

    public Edge getEdge(int index){
        if(index>leftLink.size()-1){
            return null;
        }
        return leftLink.get(index);
    }

    public ArrayList<Node> getAllNeighbours() {
        ArrayList<Node> neighbours = new ArrayList<>();

        for (Edge e:this.leftLink) {
            neighbours.add(e.getLeftLink());
        }

        return neighbours;
    }

    public Object getValue() {
        return value;
    }
}
