package Client;

import Commands.*;
import Invoker.Invoker;
import Receivers.CeilingFan;
import Receivers.Door;
import Receivers.LightBulb;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        LightBulb lightBulb = new LightBulb();
        CeilingFan ceilingFan = new CeilingFan();

        ArrayList<Command> commands = new ArrayList<Command>(){{
            add(new DoorOpen(door));
            add(new LightBulbOn(lightBulb));
            add(new CeilingFanCommand(ceilingFan));
        }};

        MacroCommand macroCommand = new MacroCommand(commands);

        Invoker invoker = new Invoker(new ArrayList<Command>(){{add(macroCommand);}});

        invoker.pressButton(0);

        invoker.undo();

    }
}
