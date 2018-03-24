package Commands;

import java.util.ArrayList;
import java.util.Collections;

public class MacroCommand implements Command {
    private ArrayList<Command> commands;

    public MacroCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: this.commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        ArrayList<Command> tmpCommands = this.commands;
        Collections.reverse(tmpCommands);
        for (Command command : tmpCommands) {
            command.undo();
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
