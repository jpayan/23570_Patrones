package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class Pepperoni extends Ingredient {
    public Pepperoni(Pizza pizza, String quantity) {
        super(pizza, "Pepperoni", quantity);
    }
}
