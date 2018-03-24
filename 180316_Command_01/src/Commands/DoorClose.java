package Commands;

import Receivers.Door;

public class DoorClose implements Command {
    private Door door;

    public DoorClose(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
