package Invoker;

import Commands.Command;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commands;
    private Command lastCommand;

    public Invoker(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public void pressButton(int i) {
        Command invokedCommand = this.commands.get(i);
        invokedCommand.execute();
        this.lastCommand = invokedCommand;
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void addCommands(ArrayList<Command> commands) {
        this.commands.addAll(commands);
    }

    public void removeCommand(int i) {
        this.commands.remove(i);
    }

    public void removeCommand(Command command) {
        this.commands.remove(command);
    }

    public void clearCommands() {
        this.commands.clear();
    }

    public void undo() {
        this.lastCommand.undo();
    }
}
