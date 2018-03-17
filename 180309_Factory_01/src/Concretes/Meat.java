package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class Meat extends Ingredient {
    public Meat(Pizza pizza, String quantity) {
        super(pizza, "Meat", quantity);
    }
}