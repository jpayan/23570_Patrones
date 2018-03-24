package Commands;

import Receivers.LightBulb;

public class LightBulbOff implements Command {
    private LightBulb lightBulb;

    public LightBulbOff(LightBulb lightBulb) {
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
        lightBulb.off();
    }

    @Override
    public void undo() {
        lightBulb.on();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
