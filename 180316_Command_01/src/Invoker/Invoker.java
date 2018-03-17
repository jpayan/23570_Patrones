package Invoker;

import Commands.Command;

public class Invoker {
    Command slot1;

    public Invoker(Command slot1) {
        this.slot1 = slot1;
    }

    public String getSlot1() {
        return slot1.toString();
    }

    public void setSlot1(Command slot1) {
        this.slot1 = slot1;
    }

    public void pressButton() {
        slot1.execute();
    }
}
