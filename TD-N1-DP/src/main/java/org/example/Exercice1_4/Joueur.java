package org.example.Exercice1_4;

import java.util.ArrayList;
import java.util.List;

public class Joueur implements Observable {
    private int score = 0;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {
       for (Observer observer:observers){
           observer.update(this.score);
       }
    }

    public void setScore(int score) {
        this.score = score;
        this.notifyObservers();
    }

    public int getScore() {
        return score;
    }
}
