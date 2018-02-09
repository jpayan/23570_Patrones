package Subjects;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double pressure;
    private double humidity;

//    public double getTemperature() {
//        return this.temperature;
//    }
//
//    public double getPressure() {
//        return this.pressure;
//    }
//
//    public double getHumidity() {
//        return this.humidity;
//    }

    private void measurementsChanged() {
        for (Observer observer: observers) {
            notifySubject(observer);
        }
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
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
    public void notifySubject(Observer observer) {
        observer.update(this.temperature, this.pressure, this.humidity);
    }
}
