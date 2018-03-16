package Client;

import Concretes.FactoryTJ;
import Utils.Utils.*;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzasPayucas = new PizzaStore(new FactoryTJ());
        pizzasPayucas.orderPizza(PizzaType.MEXICAN, Size.MEDIUM);
    }
}
