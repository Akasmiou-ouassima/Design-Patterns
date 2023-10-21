package org.example.Exercice1_4;

public class Camera implements Observer {
    @Override
    public void update(int score) {
        if (score % 2 == 0) {
            score= score / 2;
        } else {
            score= score * 2;
        }
        System.out.println("************ Camera ************");
        System.out.println("Nouvelle mise à jour : score = "+score);
        System.out.println("**********************************");
        System.out.println();
    }
}
