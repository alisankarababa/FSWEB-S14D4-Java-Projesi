package com.game.models;

import com.game.interfaces.Poisonable;

public class Snake extends Monster implements Poisonable {

    public Snake(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double poison() {
        return 0.3 * getDamage();
    }

    @Override
    public double attack() {
        return poison() + getDamage();
    }
}
