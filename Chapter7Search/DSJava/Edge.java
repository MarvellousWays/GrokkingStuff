package com.company;

public class Edge {
    private long value;
    private Node leftLink = null;

    public Edge(long value, Node leftLink) {
        this.value = value;
        this.leftLink = leftLink;
    }

    public void setLeftLink(Node leftLink) {
        this.leftLink = leftLink;
    }

    public long getValue() {
        return value;
    }

    public Node getLeftLink() {
        return leftLink;
    }
}
