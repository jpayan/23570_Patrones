package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class Cheese extends Ingredient {
    public Cheese(Pizza pizza, String quantity) {
        super(pizza, "Cheese", quantity);
    }
}
