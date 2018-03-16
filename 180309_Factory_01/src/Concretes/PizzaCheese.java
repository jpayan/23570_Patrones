package Concretes;

import Supertypes.Pizza;
import Utils.Utils;

public class PizzaCheese extends Pizza {
    public PizzaCheese(Utils.Thickness thickness, Utils.Size size) {
        super(thickness, size, 500, 200);
    }
}
