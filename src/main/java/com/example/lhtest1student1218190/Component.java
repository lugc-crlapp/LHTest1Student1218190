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

        public void setPrice(double price) {
        if (price < 0 || price > 10000) {
            throw new IllegalArgumentException("Price must be between 0 and 10,000");
        }
        this.price = price;
    }





}
