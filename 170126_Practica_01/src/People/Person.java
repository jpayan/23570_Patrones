package People;

import Behaviors.Walkable;

public abstract class Person {
    private String name;
    private int age;
    private Walkable walkingBehavior;

    public Person(String name, int age, Walkable walkingBehavior) {
        this.name = name;
        this.age = age;
        this.walkingBehavior = walkingBehavior;
    }

    public void comer() {
        System.out.println("I AM EATING.");
    }

    public void defecar() {
        System.out.println("I AM POOPING.");
    }

    public void caminar() {
        this.walkingBehavior.caminar();
    }
}