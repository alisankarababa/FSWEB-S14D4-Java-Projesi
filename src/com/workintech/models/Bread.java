package com.workintech.models;

import com.workintech.enums.eProductType;

public class Bread extends ProductForSale{

    private double massInGrams;

    public Bread(double price, String description, double massInGrams) {
        super(price, eProductType.BREAD, description);
        this.massInGrams = massInGrams;
    }

    public double getMassInGrams() {
        return massInGrams;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bread {" +
                " massInGrams=" + massInGrams +
                " type=" + super.getType() +
                " price=" + super.getPrice() +
                " description=" + super.getDescription() + " " +
                '}';
    }
}
