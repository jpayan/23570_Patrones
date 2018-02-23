package Components.Decorators;

import Components.Beverage;

public class Milk extends Ingredient {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Milk";
        setCost();
    }

    @Override
    protected void setCost() {
        switch (this.beverage.getSize()) {
            case "Small":
                this.cost = 6.00;
            case "Medium":
                this.cost = 10.00;
            case "Large":
                this.cost = 14.00;
            default:
                this.cost = 10.00;
        }
    }

    @Override
    public String getDescription() {
        return String.format("%s with %s", this.beverage.getDescription(), this.description);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + this.cost;
    }

    @Override
    public String getSize() {
        return this.beverage.getSize();
    }
}
