package Observables;

import Behaviors.Updatable;
import Observers.Observer;
import Wrappers.DHLDataWrapper;

import java.util.*;

public class DHLData implements Observable, Updatable {
    private ArrayList<Observer> observers;

    private long latitude;
    private long longitude;
    private long updateInterval = 1000;

    public DHLData() {
        observers = new ArrayList<>();
    }

    private void checkpointChanged() {
        this.notifyObservers();
    }

    public void setCheckpoint(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.checkpointChanged();
    }

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        DHLDataWrapper data = new DHLDataWrapper(this.latitude, this.longitude);
        for (Observer observer: this.observers) {
            observer.update(data);
        }
    }

    @Override
    public void updatePackageInfo() {
        Timer timer = new Timer();
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                setCheckpoint(new Random().nextLong(), new Random().nextLong());
            }
        }, 0, this.updateInterval);
    }
}
