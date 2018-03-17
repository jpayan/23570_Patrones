package Receivers;

public class LightBulb {
    private int state = 0;

    public void on() {
        if (state == 0) {
            state = 1;
            System.out.println("Light bulb on.");
        } else {
            System.out.println("Light bulb is already on.");
        }
    }
    public void off() {
        if (state == 1) {
            state = 0;
            System.out.println("Light bulb off.");
        } else {
            System.out.println("Light bulb is already off.");
        }
    }
}
