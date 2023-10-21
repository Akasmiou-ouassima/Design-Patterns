package org.example.Exercice1_2;

import java.util.Random;

public class ConcretePlugin1 extends Plugin{
    @Override
    protected double partie1(double d) {
        return Math.pow(d,2);
    }

    @Override
    protected double partie2() {
        return new Random().nextDouble();
    }
}
