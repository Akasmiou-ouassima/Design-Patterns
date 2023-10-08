package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Quel Personnage ?");
            String personnageClassName = scanner.nextLine(); //org.example.Reine
            Personnage personnage = (Personnage) Class.forName(personnageClassName).getConstructor().newInstance();
            System.out.println("Comportement d'arme ?");
            String armeClassName = scanner.nextLine();
            ComportementArme comportementArme = (ComportementArme) Class.forName(armeClassName).getConstructor().newInstance();
            personnage.setComportementArme(comportementArme);
            personnage.combattre();
        }
    }
}
