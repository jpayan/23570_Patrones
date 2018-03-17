package Concretes;

import Supertypes.Factory;
import Supertypes.Pizza;
import Utils.Utils.*;

public class FactoryTJ extends Factory {
    @Override
    public Pizza createPizza(PizzaType pizzaType, Size size) {
        Thickness pizzaThickness = Thickness.NORMAL;
        switch (pizzaType) {
            case MEXICAN:
                Pizza mexicanPizza = new PlainPizza("Mexican", pizzaThickness, size);
                mexicanPizza = new TomatoSauce(mexicanPizza, "200ml");
                mexicanPizza = new Cheese(mexicanPizza, "150g");
                mexicanPizza = new Beans(mexicanPizza, "100g");
                mexicanPizza = new Jalapenos(mexicanPizza, "50g");
                mexicanPizza.prepare();
                return mexicanPizza;
            case CHEESE:
                Pizza cheesePizza = new PlainPizza("Cheese", pizzaThickness, size);
                cheesePizza = new TomatoSauce(cheesePizza, "150ml");
                cheesePizza = new Cheese(cheesePizza, "300g");
                cheesePizza.prepare();
                return cheesePizza;
            case HAWAIIAN:
                Pizza hawaiianPizza = new PlainPizza("Hawaiian", pizzaThickness, size);
                hawaiianPizza = new TomatoSauce(hawaiianPizza, "200ml");
                hawaiianPizza = new Cheese(hawaiianPizza, "150g");
                hawaiianPizza = new Ham(hawaiianPizza, "100g");
                hawaiianPizza.prepare();
                return hawaiianPizza;
            default:
                return new PlainPizza("Plain Pizza", pizzaThickness, size);
        }
    }
}