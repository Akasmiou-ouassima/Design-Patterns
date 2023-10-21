package org.example.Exercice1_1;


import java.util.ArrayList;
import java.util.List;

public  class Groupe extends Figure{
    private List<Figure> figures=new ArrayList<>();

    Groupe(String name) {
        super(name);
    }

    @Override
    protected void afficher() {
        System.out.println(tab()+"Groupe : "+name);
        for (Figure figure:figures){
            figure.afficher();
        }
    }
    public Figure add(Figure figure){
        figure.level=this.level+1;
        figures.add(figure);
        return figure;
    }
}
