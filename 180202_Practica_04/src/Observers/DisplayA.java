package Observers;

import Behaviors.Displayable;

public class DisplayA implements Observer, Displayable {
    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    public void update(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("DisplayA");
        System.out.println(this.temperature);
        System.out.println(this.pressure);
        System.out.println(this.humidity);
    }
}
