package Concretes;

import Supertypes.Factory;
import Supertypes.Pizza;
import Utils.Utils.*;

public class FactoryChicago extends Factory {
    @Override
    public Pizza createPizza(PizzaType pizzaType, Size size) {
        Thickness pizzaThickness = Thickness.THICK;
        switch (pizzaType) {
            case MEXICAN:
                Pizza mexicanPizza = new PlainPizza("Mexican", pizzaThickness, size);
                mexicanPizza = new TomatoSauce(mexicanPizza, "200ml");
                mexicanPizza = new Cheese(mexicanPizza, "150g");
                mexicanPizza = new Pepperoni(mexicanPizza, "100g");
                mexicanPizza = new Beans(mexicanPizza, "50g");
                mexicanPizza.prepare();
                return mexicanPizza;
            case CHEESE:
                Pizza cheesePizza = new PlainPizza("Cheese", pizzaThickness, size);
                cheesePizza = new TomatoSauce(cheesePizza, "200ml");
                cheesePizza = new Cheese(cheesePizza, "500g");
                cheesePizza.prepare();
                return cheesePizza;
            case HAWAIIAN:
                Pizza hawaiianPizza = new PlainPizza("Hawaiian", pizzaThickness, size);
                hawaiianPizza = new TomatoSauce(hawaiianPizza, "100ml");
                hawaiianPizza = new Cheese(hawaiianPizza, "150g");
                hawaiianPizza = new Ham(hawaiianPizza, "150g");
                hawaiianPizza.prepare();
                return hawaiianPizza;
            default:
                return new PlainPizza("Plain Pizza", pizzaThickness, size);
        }
    }
}
