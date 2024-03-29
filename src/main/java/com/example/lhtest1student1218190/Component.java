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
            throw new IllegalArgumentException("Price must be between $0 and $10,000");
        }
        this.price = price;
    }
     public void setManufacturer(String manufacturer) {
        String[] validManufacturers = {"3Com","Acer","Arctic","AMD", "Asus","Bose","Cooler Master", "Hitachi", "Intel", "Logitech", "Nvidia", "Qualcomm","MSI","Seagate", "Western Digital", "XTREEM"};
        for (String validManufacturer : validManufacturers) {
            if (validManufacturer.equals(manufacturer)) {
                this.manufacturer = manufacturer;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid manufacturer please enter a valid manufacturer");
    }

    @Override
    public String toString() {
        return name + "-" + manufacturer + ", price: $" + String.format("%.2f", price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
