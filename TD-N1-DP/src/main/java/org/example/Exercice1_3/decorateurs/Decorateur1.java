package org.example.Exercice1_3.decorateurs;

import org.example.Exercice1_3.composants.Composant;

public class Decorateur1 extends Decorateur {
    public Decorateur1(Composant composant) {
        super(composant);
    }

    @Override
    public String traitement() {
       return  composant.traitement()+" de Decorateur 1";

    }
}
