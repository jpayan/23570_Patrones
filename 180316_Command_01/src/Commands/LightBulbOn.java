package Commands;

import Receivers.LightBulb;

public class LightBulbOn implements Command {
    private LightBulb lightBulb;

    public LightBulbOn(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public LightBulb getLightBulb() {
        return lightBulb;
    }

    public void setLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        System.out.println("Light bulb off.");
    }

    @Override
    public void undo() {

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
