package main.systemdesignpattern.observerpattern.subject;

import main.systemdesignpattern.observerpattern.observer.Observer;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
