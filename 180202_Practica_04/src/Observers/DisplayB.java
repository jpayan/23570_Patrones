package Observers;

import Behaviors.Displayable;

public class DisplayB implements Observer, Displayable {
    private double temperature;
    private double pressure;

    @Override
    public void update(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("DisplayB");
        System.out.println(this.temperature);
        System.out.println(this.pressure);
    }
}