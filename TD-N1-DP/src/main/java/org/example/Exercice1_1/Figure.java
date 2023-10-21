package org.example.Exercice1_1;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure{
    String name;

    protected int level=0;
    Figure(String name) {
        this.name = name;
    }
    protected abstract void afficher();

    public String tab(){
        String tab="";
        for (int i=0;i<level;i++){
            tab+="\t";
        }
        return tab;
    }
}
