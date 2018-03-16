package Concretes;

import Supertypes.Pizza;
import Utils.Utils.*;

public class PizzaCheese extends Pizza {
    public PizzaCheese(Thickness thickness, Size size) {
        super("Cheese", thickness, size, 500, 200);
    }
}
