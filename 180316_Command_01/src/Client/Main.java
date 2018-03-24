package Client;

import Commands.*;
import Invoker.Invoker;
import Receivers.Door;
import Receivers.LightBulb;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Door frontDoor = new Door();
        LightBulb kitchenLightBulb = new LightBulb();


        ArrayList<Command> commands = new ArrayList<Command>(){{
            add(new DoorOpen(frontDoor));
            add(new DoorClose(frontDoor));
            add(new LightBulbOn(kitchenLightBulb));
            add(new LightBulbOff(kitchenLightBulb));
        }};

        Invoker invoker = new Invoker(commands);
        invoker.pressButton(0);
        invoker.pressButton(1);
        invoker.pressButton(2);
        invoker.pressButton(3);
        invoker.undo();
        invoker.undo();
        invoker.undo();
        invoker.undo();
        invoker.undo(); // Do nothing since invoker's history if empty.
    }
}
