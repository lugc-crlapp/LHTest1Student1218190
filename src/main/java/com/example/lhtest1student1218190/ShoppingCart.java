package com.example.lhtest1student1218190;

import jdk.internal.access.JavaLangInvokeAccess;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Component> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Component item){
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Component item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String getComponentNames() {
        String names = "";
        for (Component item : items) {
            names += item.getName() + ", ";
        }
        return names;
    }



}
