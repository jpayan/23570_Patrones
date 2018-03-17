package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class Ham extends Ingredient {
    public Ham(Pizza pizza, String quantity) {
        super(pizza, "Ham", quantity);
    }
}
