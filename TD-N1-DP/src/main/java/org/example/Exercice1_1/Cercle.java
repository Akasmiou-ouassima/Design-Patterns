package org.example.Exercice1_1;

public class Cercle extends Figure{

    Cercle(String name) {
        super(name);
    }
    @Override
    protected void afficher() {
        System.out.println(tab()+"Cercle : "+name);
    }
}
