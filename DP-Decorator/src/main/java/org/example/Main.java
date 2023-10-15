package org.example;

import org.example.boissons.Boisson;
import org.example.boissons.Espresso;
import org.example.decorateurs.Chantilly;
import org.example.decorateurs.Chocolat;
import org.example.decorateurs.Lait;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Espresso();
        System.out.println(boisson.getDescription()+" "+boisson.cout()+" €");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription()+" "+boisson.cout()+" €");
        boisson = new Chantilly(boisson);
        System.out.println(boisson.getDescription()+" "+boisson.cout()+" €");
        boisson = new Lait(boisson);
        System.out.println(boisson.getDescription()+" "+boisson.cout()+" €");
    }

}
