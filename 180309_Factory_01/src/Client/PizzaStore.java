package Client;

import Supertypes.Factory;
import Supertypes.Pizza;
import Utils.Utils.*;

public class PizzaStore {
    private Factory pizzaFactory;

    public PizzaStore(Factory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Factory getPizzaFactory() {
        return pizzaFactory;
    }

    public void setPizzaFactory(Factory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType pizzaType, Size size) {
        return this.pizzaFactory.createPizza(pizzaType, size);
    }
}
