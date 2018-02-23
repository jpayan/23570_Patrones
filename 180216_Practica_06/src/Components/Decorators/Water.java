package Components.Decorators;

import Components.Beverage;

public class Water extends Ingredient {
    public Water(Beverage beverage) {
        this.beverage = beverage;
        this.description = "Water";
        setCost();
    }

    @Override
    protected void setCost() {
        switch (this.beverage.getSize()) {
            case "Small":
                this.cost = 3.00;
            case "Medium":
                this.cost = 5.00;
            case "Large":
                this.cost = 8.00;
            default:
                this.cost = 5.00;
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
