package Observers;

import Behaviors.Displayable;
import Observables.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class DisplayB implements Observer, Displayable {
    private double temperature;
    private double pressure;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println("\nDisplayB");
        System.out.println(this.temperature);
        System.out.println(this.pressure);
    }
}