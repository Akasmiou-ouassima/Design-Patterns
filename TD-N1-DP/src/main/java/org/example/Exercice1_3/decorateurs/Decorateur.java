package org.example.Exercice1_3.decorateurs;

import org.example.Exercice1_3.composants.Composant;

public abstract class Decorateur implements Composant {
   protected Composant composant;

    public Decorateur(Composant composant) {
        this.composant = composant;
    }
    public abstract String traitement();
}
