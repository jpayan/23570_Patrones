package Observables;

import Observers.Observer;

import java.util.ArrayList;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
