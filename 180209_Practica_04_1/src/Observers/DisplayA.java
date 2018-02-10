package Observers;

import Behaviors.Displayable;
import Observables.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class DisplayA implements Observer, Displayable {
    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println("\nDisplayA");
        System.out.println(this.temperature);
        System.out.println(this.pressure);
        System.out.println(this.humidity);
    }
}
