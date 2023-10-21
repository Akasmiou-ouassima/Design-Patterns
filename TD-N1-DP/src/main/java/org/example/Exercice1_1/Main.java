package org.example.Exercice1_1;

public class Main {
    public static void main(String[] args) {
        Groupe groupe = new Groupe("Groupe 1");
        groupe.add(new Rectangle("Rectangle 1"));
        groupe.add(new Rectangle("Rectangle 2"));
        groupe.add(new Rectangle("Rectangle 3"));
        groupe.add(new Rectangle("Rectangle 4"));
        groupe.add(new Cercle("Cercle 1"));
        groupe.add(new Cercle("Cercle 2"));
        Groupe g1= (Groupe) groupe.add(new Groupe("Groupe 2"));
        g1.add(new Rectangle("Rectangle 5"));
        g1.add(new Rectangle("Rectangle 6"));
        g1.add(new Cercle("Cercle 3"));
        g1.add(new Cercle("Cercle 4"));
        Groupe g2= (Groupe) g1.add(new Groupe("Groupe 3"));
        g2.add(new Rectangle("Rectangle 7"));
        g2.add(new Rectangle("Rectangle 8"));
        g2.add(new Cercle("Cercle 5"));
        g2.add(new Cercle("Cercle 6"));
        g2.add(new Cercle("Cercle 7"));
        groupe.afficher();



    }
}
