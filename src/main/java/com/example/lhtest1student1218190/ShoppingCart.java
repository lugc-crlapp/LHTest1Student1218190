package com.example.lhtest1student1218190;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Component> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Component item){
        items.add(item);
    }

    
}
