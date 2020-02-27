package com.company;

import java.util.ArrayList;

public abstract class ListItem {
    protected ArrayList<ListItem> leftLink;

    protected Object value;

    private boolean mango;

    public ListItem(Object value) {
        this.value = value;
        this.leftLink = null;
        this.mango = false;
    }

    public boolean hasMango() {
        return mango;
    }

    public void giveMango() {
        this.mango = true;
    }

    abstract boolean addNext(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
