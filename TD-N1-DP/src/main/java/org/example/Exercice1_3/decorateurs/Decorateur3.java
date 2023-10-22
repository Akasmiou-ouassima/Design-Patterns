package org.example.Exercice1_3.decorateurs;

import org.example.Exercice1_3.composants.Composant;

public class Decorateur3 extends Decorateur {
    public Decorateur3(Composant composant) {
        super(composant);
    }

    @Override
    public String traitement() {
        return  composant.traitement()+" de Decorateur 3";
    }
}
