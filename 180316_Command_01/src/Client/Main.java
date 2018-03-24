package Client;

import Commands.*;
import Invoker.Invoker;
import Receivers.CeilingFan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();

        ArrayList<Command> commands = new ArrayList<Command>(){{
           add(new CeilingFanCommand(ceilingFan));
        }};

        Invoker invoker = new Invoker(commands);
        invoker.pressButton(0);
        invoker.pressButton(0);
        invoker.pressButton(0);
        invoker.pressButton(0);
        invoker.undo();
        invoker.undo();
        invoker.undo();
    }
}
