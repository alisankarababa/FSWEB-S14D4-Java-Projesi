package com.workintech.models;
import com.workintech.enums.eProductType;

public abstract class ProductForSale {

    private double price;
    private eProductType type;
    private String description;

    public ProductForSale(double price, eProductType type, String description) {
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public eProductType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails();
}
