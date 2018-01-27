package Behaviors;

public class NoCaminar implements Walkable {
    @Override
    public void caminar() {
        System.out.println("I AIN'T WALKING, I GOT MY TRUCK.");
    }
}