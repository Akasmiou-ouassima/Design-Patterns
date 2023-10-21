package org.example.Exercice1_4;

public class Gardien implements Observer {
    @Override
    public void update(int score) {
        double res=Math.random()*score;
        System.out.println("************ Gardien ************");
        System.out.println("Nouvelle mise à jour : score = "+score);
        System.out.println("Résultat de calcul : "+res);
        System.out.println("**********************************");
        System.out.println();
    }
}
