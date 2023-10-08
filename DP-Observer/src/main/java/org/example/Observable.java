package org.example;

public interface Observable {
     void subscribe(Observer o); // addObserver
     void unsubscribe(Observer o);  // removeObserver
     void notifyObservers();
}
