package Receivers;

import Utils.Utils.CeilingFanSpeeds;

public class CeilingFan {
    private CeilingFanSpeeds speed = CeilingFanSpeeds.OFF;

    public void off() {
        this.speed = CeilingFanSpeeds.OFF;
        System.out.println("Ceiling fan off.");
    }

    public void slow() {
        this.speed = CeilingFanSpeeds.SLOW;
        System.out.println("Ceiling fan speed set to slow.");
    }

    public void medium() {
        this.speed = CeilingFanSpeeds.MEDIUM;
        System.out.println("Ceiling fan speed set to medium.");
    }

    public void high() {
        this.speed = CeilingFanSpeeds.HIGH;
        System.out.println("Ceiling fan speed set to high.");
    }

    public CeilingFanSpeeds getSpeed() {
        return this.speed;
    }
}
