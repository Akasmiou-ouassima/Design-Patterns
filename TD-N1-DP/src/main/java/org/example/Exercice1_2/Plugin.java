package org.example.Exercice1_2;

public abstract class Plugin {
       public double calcul(double d) {
                double result=0;
                result=partie1(d);
                result+=partie2();
                return result;
        }

        protected abstract double partie1(double d);
        protected abstract double partie2();
}
