package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class Beans extends Ingredient {
    public Beans(Pizza pizza, String quantity) {
        super(pizza, "Beans", quantity);
    }
}
