package org.example.Exercice1_4;

public class Couloir implements Observer {
    @Override
    public void update(int score) {
        double res=score*score;
        System.out.println("************ Couloir ************");
        System.out.println("Nouvelle mise à jour : score = "+score);
        System.out.println("Résultat de calcul : "+res);
        System.out.println("**********************************");
        System.out.println();
    }
}
