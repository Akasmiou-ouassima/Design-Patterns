package org.example.Exercice1_1;

public class Rectangle extends Figure{

    Rectangle(String name) {
        super(name);
    }

    @Override
    protected void afficher() {
        System.out.println(tab()+"Rectangle : "+name);
    }
}
