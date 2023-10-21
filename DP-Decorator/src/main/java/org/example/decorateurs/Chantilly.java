package org.example.decorateurs;

import org.example.boissons.Boisson;
import org.example.decorateurs.Chocolat;

public class Chantilly extends Decorateur{
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 10+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chantilly";
    }
}
