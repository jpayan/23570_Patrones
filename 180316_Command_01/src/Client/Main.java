package Client;

import Commands.DoorClose;
import Commands.DoorOpen;
import Commands.LightBulbOff;
import Commands.LightBulbOn;
import Invoker.Invoker;
import Receivers.Door;
import Receivers.LightBulb;

public class Main {
    public static void main(String[] args) {
        Door frontDoor = new Door();
        LightBulb kitchenLightBulb = new LightBulb();

        Invoker invoker = new Invoker(new DoorOpen(frontDoor));
        invoker.pressButton();

        invoker.setSlot1(new DoorClose(frontDoor));
        invoker.pressButton();

        invoker.pressButton();

        invoker.setSlot1(new LightBulbOff(kitchenLightBulb));
        invoker.pressButton();

        invoker.setSlot1(new LightBulbOn(kitchenLightBulb));
        invoker.pressButton();
    }
}
