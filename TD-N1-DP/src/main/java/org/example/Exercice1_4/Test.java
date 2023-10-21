package org.example.Exercice1_4;

public class Test {
    public static void main(String[] args) {
        Joueur observable = new Joueur();
        Observer observer1=new Couloir();
        Observer observer2=new Camera();
        Observer observer3=new Gardien();

        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.subscribe(observer3);

        observable.setScore(70);
        observable.setScore(15);

        observable.unsubscribe(observer1);
        observable.setScore(33);

    }
}
