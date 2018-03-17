package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class Jalapenos extends Ingredient {
    public Jalapenos(Pizza pizza, String quantity) {
        super(pizza, "Jalapenos", quantity);
    }
}
