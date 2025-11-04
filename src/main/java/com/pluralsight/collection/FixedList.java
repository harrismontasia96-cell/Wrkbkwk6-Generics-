package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    private List<T> items;
    private int maxsize;

    public FixedList( int maxsize) {
        this.items = new ArrayList<>();
        this.maxsize = maxsize;

    }
    public void add(T item){
        if(items.size()<maxsize){
            items.add(item);
        }
    }

    public List<T> getItems() {
        return items;
    }

}
