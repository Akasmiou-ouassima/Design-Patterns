package org.example.decorateurs;

import org.example.boissons.Boisson;

public class Lait extends Decorateur {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Lait";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }
}
