package Supertypes;

import Utils.Utils.*;

public abstract class Factory {
    public abstract Pizza createPizza(PizzaType pizza, Size size);
}
