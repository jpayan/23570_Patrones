package Commands;

import Receivers.CeilingFan;
import Utils.Utils.CeilingFanSpeeds;

public class CeilingFanCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public CeilingFan getCeilingFan() {
        return this.ceilingFan;
    }

    public void setCeilingFan(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        CeilingFanSpeeds currentSpeed = this.ceilingFan.getSpeed();
        switch(currentSpeed) {
            case OFF:
                this.ceilingFan.slow();
                break;
            case SLOW:
                this.ceilingFan.medium();
                break;
            case MEDIUM:
                this.ceilingFan.high();
                break;
            case HIGH:
                this.ceilingFan.off();
                break;
        }
    }

    @Override
    public void undo() {
        CeilingFanSpeeds currentSpeed = this.ceilingFan.getSpeed();
        switch(currentSpeed) {
            case OFF:
                this.ceilingFan.high();
                break;
            case SLOW:
                this.ceilingFan.off();
                break;
            case MEDIUM:
                this.ceilingFan.slow();
                break;
            case HIGH:
                this.ceilingFan.medium();
                break;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}