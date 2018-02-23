package Components;

public class PayucaExpress extends Beverage {
    public PayucaExpress(String size) {
        this.description = "PayucaExpress";
        this.size = !size.isEmpty() ? size : this.size;
        setCost();
    }

    @Override
    protected void setCost() {
        switch (this.size) {
            case "Small":
                this.cost = 65.00;
            case "Medium":
                this.cost = 80.00;
            case "Large":
                this.cost = 95.00;
            default:
                this.cost = 80.00;
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