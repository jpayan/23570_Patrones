package Observables;

import java.util.Observable;

public class WeatherData extends Observable {
    private double temperature;
    private double pressure;
    private double humidity;

    public double getTemperature() {
        return this.temperature;
    }

    public double getPressure() {
        return this.pressure;
    }

    public double getHumidity() {
        return this.humidity;
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        setChanged();

        this.measurementsChanged();
    }

}