package Concretes;

import Supertypes.Factory;
import Supertypes.Pizza;
import Utils.Utils.*;

public class FactoryTJ extends Factory {
    @Override
    public Pizza createPizza(PizzaType pizza, Size size) {
        Thickness pizzaThickness = Thickness.NORMAL;
        switch (pizza) {
            case MEXICAN:
                return new PizzaMexican(pizzaThickness, size);
            case CHEESE:
                return new PizzaCheese(pizzaThickness, size);
            case HAWAIIAN:
                return new PizzaHawaiian(pizzaThickness, size);
            default:
                return new PizzaMexican(pizzaThickness, size);
        }
    }
}