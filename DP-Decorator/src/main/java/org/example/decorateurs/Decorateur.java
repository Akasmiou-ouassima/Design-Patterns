package org.example.decorateurs;

import org.example.boissons.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();

}
