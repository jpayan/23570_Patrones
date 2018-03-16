package Concretes;

import Supertypes.Pizza;
import Utils.Utils;

public class PizzaHawaiian extends Pizza {
    public PizzaHawaiian(Utils.Thickness thickness, Utils.Size size) {
        super(thickness, size, 200, 300);
    }
}
