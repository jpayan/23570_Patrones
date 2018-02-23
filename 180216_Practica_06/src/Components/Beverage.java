package Components;

public abstract class Beverage {
    protected String description;
    protected double cost;
    protected String size = "Medium";

    protected abstract void setCost();
    public abstract String getDescription();
    public abstract double getCost();
    public abstract String getSize();
}
