package org.example.test;

import org.example.util.Utilitaire;
import org.example.util.UtilitaireImpl1;
import org.example.util.UtilitaireImpl2;

public class Main {
    public static void main(String[] args) {
        Utilitaire utilitaire = new UtilitaireImpl1();
        System.out.println(utilitaire.compute("azerty"));
        utilitaire = new UtilitaireImpl2();
        System.out.println(utilitaire.compute("azerty"));

    }
}
