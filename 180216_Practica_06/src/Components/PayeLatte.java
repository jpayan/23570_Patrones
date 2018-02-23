package Components;

public class PayeLatte extends Beverage {
    public PayeLatte(String size) {
        this.description = "PayeLatte";
        this.size = !size.isEmpty() ? size : this.size;
        setCost();
    }

    @Override
    protected void setCost() {
        switch (this.size) {
            case "Small":
                this.cost = 40.50;
            case "Medium":
                this.cost = 65.50;
            case "Large":
                this.cost = 80.50;
            default:
                this.cost = 65.50;
        }
    }

    @Override
    public String getDescription() {
        return String.format("%s %s", this.size, this.description);
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public String getSize() {
        return this.size;
    }
}