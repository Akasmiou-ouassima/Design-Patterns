package org.example.Exercice1_2;

public class Client {
    public static void main(String[] args) {
        Plugin plugin = new ConcretePlugin1();
        System.out.println(plugin.calcul(20));
        plugin= new ConcretePlugin2();
        System.out.println(plugin.calcul(20));

    }
}
