package Concretes;

import Supertypes.Ingredient;
import Supertypes.Pizza;

public class TomatoSauce extends Ingredient {
    public TomatoSauce(Pizza pizza, String quantity) {
        super(pizza, "Tomato Sauce", quantity);
    }
}
