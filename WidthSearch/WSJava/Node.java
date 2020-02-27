package com.company;

import java.util.ArrayList;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    boolean addNext(ListItem item) {

        if (leftLink == null) {
            leftLink = new ArrayList<>();
        }
        if (this.leftLink.contains(item)) {
            return false;
        } else {
            this.leftLink.add(item);
            return true;
        }
    }
}
