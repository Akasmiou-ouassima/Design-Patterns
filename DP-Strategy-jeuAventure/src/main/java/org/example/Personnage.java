package org.example;

public class Personnage {
    private ComportementArme comportementArme;
    public void combattre() {
        System.out.println("Combattre");
        comportementArme.utiliserArme();
    }

    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }
}
