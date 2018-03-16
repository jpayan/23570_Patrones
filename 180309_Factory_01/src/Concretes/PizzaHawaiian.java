package Concretes;

import Supertypes.Pizza;
import Utils.Utils.*;

public class PizzaHawaiian extends Pizza {
    public PizzaHawaiian(Thickness thickness, Size size) {
        super("Hawaiian", thickness, size, 200, 300);
    }
}
