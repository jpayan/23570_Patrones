package Supertypes;

public abstract class Ingredient extends Pizza {
    protected Pizza pizza;
    protected String ingredientName;
    protected String quantity;
    public Ingredient(Pizza pizza, String ingredientName, String quantity) {
        super(pizza.name, pizza.thickness, pizza.size);
        this.name += String.format(" with %s of %s", quantity, ingredientName);
        this.pizza = pizza;
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }
}