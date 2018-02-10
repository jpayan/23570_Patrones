package Observers;

import Behaviors.Displayable;
import Observables.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class DisplayC implements Observer, Displayable {
    private double temperature;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println("\nDisplayC");
        System.out.println(this.temperature);
    }
}