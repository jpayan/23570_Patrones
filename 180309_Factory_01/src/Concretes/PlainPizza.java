package Concretes;

import Supertypes.Pizza;
import Utils.Utils;

public class PlainPizza extends Pizza {
    public PlainPizza(String name, Utils.Thickness thickness, Utils.Size size) {
        super(name, thickness, size);
    }
}
