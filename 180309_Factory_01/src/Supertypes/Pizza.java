package Supertypes;

import Utils.Utils.*;

public abstract class Pizza {
    protected Thickness thickness;
    protected Size size;
    protected int cheeseQty;
    protected int sauceQty;

    public Pizza(Thickness thickness, Size size, int cheeseQty, int sauceQty) {
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
        System.out.println("Adding ingredients...");
    }
    public void bake() {
        System.out.println("Baking pizza...");
    }
    public void slice() {
        System.out.println("Slicing pizza...");
    }
    public void box() {
        System.out.println("Boxing pizza...");
    }
}
