package org.example.Exercice1_3;

import org.example.Exercice1_3.composants.Composant;
import org.example.Exercice1_3.composants.Composant1;
import org.example.Exercice1_3.composants.Composant2;
import org.example.Exercice1_3.decorateurs.Decorateur1;
import org.example.Exercice1_3.decorateurs.Decorateur2;
import org.example.Exercice1_3.decorateurs.Decorateur3;

public class Test {
    public static void main(String[] args) {
        Composant composant = new Composant1();
        System.out.println(composant.traitement());
        composant= new Decorateur1(composant);
        System.out.println(composant.traitement());
        composant= new Decorateur2(composant);
        System.out.println(composant.traitement());
        composant= new Decorateur3(composant);
        System.out.println(composant.traitement());

        System.out.println("*********************");
        Composant composant1 = new Decorateur3(new Decorateur2(new Decorateur1(new Composant2())));
        System.out.println(composant1.traitement());
    }
}
