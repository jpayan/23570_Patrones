package Concretes;

import Supertypes.Pizza;
import Utils.Utils;

public class PizzaMexican extends Pizza {
    public PizzaMexican(Utils.Thickness thickness, Utils.Size size) {
        super(thickness, size, 200, 500);
    }
}
