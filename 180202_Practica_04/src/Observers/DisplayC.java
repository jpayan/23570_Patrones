package Observers;

import Behaviors.Displayable;

public class DisplayC implements Observer, Displayable {
    private double temperature;

    @Override
    public void update(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("DisplayC");
        System.out.println(this.temperature);
    }
}