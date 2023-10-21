package org.example.Exercice1_4;



public interface Observable {
void subscribe(Observer o);
void unsubscribe(Observer o);
void notifyObservers();

}
