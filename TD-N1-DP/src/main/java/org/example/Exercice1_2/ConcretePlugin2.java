package org.example.Exercice1_2;

public class ConcretePlugin2 extends Plugin{
    @Override
    protected double partie1(double d) {
          return Math.pow(d,4);
    }

    @Override
    protected double partie2() {
        return Math.atan(1);
    }
}
