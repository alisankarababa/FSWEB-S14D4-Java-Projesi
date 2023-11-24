package com.workintech.models;

import com.workintech.enums.eProductType;

public class Coke extends ProductForSale{
    private double ph;

    public Coke(double price, String description, double ph) {
        super(price, eProductType.COKE, description);
        this.ph = ph;
    }

    public double getPh() {
        return ph;
    }

    @Override
    public void showDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Coke {" +
                " ph=" + ph +
                " type=" + super.getType() +
                " price=" + super.getPrice() +
                " description=" + super.getDescription() + " " +
                '}';
    }
}
