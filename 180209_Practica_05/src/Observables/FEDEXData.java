package Observables;

import Behaviors.Updatable;
import Observers.Observer;
import Wrappers.FEDEXDataWrapper;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class FEDEXData implements Observable, Updatable {
    private ArrayList<Observer> observers;

    private String office;
    private long updateInterval = 5000;

    public FEDEXData() {
        observers = new ArrayList<>();
    }

    private void checkpointChanged() {
        FEDEXDataWrapper data = new FEDEXDataWrapper(this.office);
        for (Observer observer: observers) {
            observer.update(data);
        }
    }

    public void setCheckpoint(String office) {
        this.office = office;
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
        FEDEXDataWrapper data = new FEDEXDataWrapper(this.office);
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
                setCheckpoint(randomUUIDString);
            }
        }, 0, this.updateInterval);
    }
}
