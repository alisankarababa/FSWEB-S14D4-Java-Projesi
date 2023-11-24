package com.workintech.models;

import com.workintech.enums.eProductType;

public class Chocolate extends ProductForSale{

    private double milkPercentage;

    public Chocolate(double price, String description, double milkPercentage) {
        super(price, eProductType.CHOCOLATE, description);
        this.milkPercentage = milkPercentage;
    }

    public double getPh() {
        return milkPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Chocolate {" +
                " milkPercentage=" + milkPercentage +
                " type=" + super.getType() +
                " price=" + super.getPrice() +
                " description=" + super.getDescription() + " " +
                '}';
    }
}
