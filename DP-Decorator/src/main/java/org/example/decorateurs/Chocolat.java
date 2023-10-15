package org.example.decorateurs;

import org.example.boissons.Boisson;

public class Chocolat extends Decorateur{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+1;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chocolat";
    }
}
