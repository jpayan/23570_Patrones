package Commands;

import Receivers.Door;

public class DoorOpen implements Command {
    private Door door;

    public DoorOpen(Door door) {
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
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
