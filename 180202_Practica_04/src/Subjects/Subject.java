package Subjects;

import Observers.Observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifySubject(Observer observer);
}
