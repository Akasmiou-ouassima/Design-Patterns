package org.example;

import java.util.Random;

public class Proxy implements Standard {
    private StandardImpl1 target;
    @Override
    public void process() {
        System.out.println("Vérification du contexte de sécurité");
        boolean b = new Random().nextBoolean();
        if (b) {
            System.out.println("Avant appel de la méthode process");
            target = new StandardImpl1();
            target.process();
            System.out.println("Après appel de la méthode process");
        }else {
           throw new RuntimeException("Accès non autorisé");
        }
    }

}
