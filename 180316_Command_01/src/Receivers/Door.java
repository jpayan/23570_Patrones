package Receivers;

public class Door {
    private int state = 0;

    public void open() {
        if (state == 0) {
            state = 1;
            System.out.println("Door opened.");
        } else {
            System.out.println("Door is already opened.");
        }
    }
    public void close() {
        if (state == 1) {
            state = 0;
            System.out.println("Door closed.");
        } else {
            System.out.println("Door is already closed.");
        }
    }
}
