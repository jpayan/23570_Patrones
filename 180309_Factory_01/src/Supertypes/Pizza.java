package Supertypes;

import Utils.Utils.*;

public abstract class Pizza {
    protected String name;
    protected Thickness thickness;
    protected Size size;

    public Pizza(String name, Thickness thickness, Size size) {
        this.name = name;
        this.thickness = thickness;
        this.size = size;
    }

    public void prepare() {
        System.out.println(String.format("Preparing %s...", name));
        this.bake();
    }
    public void bake() {
        System.out.println("Baking pizza...");
        this.slice();
    }
    public void slice() {
        System.out.println("Slicing pizza...");
        this.box();
    }
    public void box() {
        System.out.println("Boxing pizza...");
    }
}