package Supertypes;

import Utils.Utils.*;

public abstract class Pizza {
    protected String name;
    protected Thickness thickness;
    protected Size size;
    protected int cheeseQty;
    protected int sauceQty;

    public Pizza(String name, Thickness thickness, Size size, int cheeseQty, int sauceQty) {
        this.name = name;
        this.thickness = thickness;
        this.size = size;
        this.cheeseQty = cheeseQty;
        this.sauceQty = sauceQty;
        this.prepare();
        this.bake();
        this.slice();
        this.box();
    }

    public void prepare() {
        System.out.println(String.format("Adding ingredients to %s pizza...", name));
    }
    public void bake() {
        System.out.println(String.format("Baking %s pizza...", name));
    }
    public void slice() {
        System.out.println(String.format("Slicing %s pizza...", name));
    }
    public void box() {
        System.out.println(String.format("Boxing %s pizza...", name));
    }
}
