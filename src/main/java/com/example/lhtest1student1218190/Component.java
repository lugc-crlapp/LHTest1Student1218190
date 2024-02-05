package com.example.lhtest1student1218190;

public class Component {
private String name;
    private String manufacturer;
    private double price;

    public Component(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

       public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name must be at least 3 characters long");
        }
        this.name = name;
    }





}
