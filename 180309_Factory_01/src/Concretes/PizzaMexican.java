package Concretes;

import Supertypes.Pizza;
import Utils.Utils.*;

public class PizzaMexican extends Pizza {
    public PizzaMexican(Thickness thickness, Size size) {
        super("Mexican", thickness, size, 200, 500);
    }
}
