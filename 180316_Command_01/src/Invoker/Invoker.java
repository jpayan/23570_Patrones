package Invoker;

import Commands.Command;

import java.util.ArrayList;
import java.util.Stack;

public class Invoker {
    private ArrayList<Command> commands;
    private Stack<Command> history;

    public Invoker(ArrayList<Command> commands) {
        this.commands = commands;
        this.history = new Stack<>();
    }

    public void pressButton(int i) {
        Command invokedCommand = this.commands.get(i);
        invokedCommand.execute();
        this.history.add(invokedCommand);
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
        if(!history.empty()) {
            this.history.pop().undo();
        }
    }
}
