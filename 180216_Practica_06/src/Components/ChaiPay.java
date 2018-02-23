package Components;

public class ChaiPay extends Beverage {
    public ChaiPay(String size) {
        this.description = "ChaiPay";
        this.size = !size.isEmpty() ? size : this.size;
        setCost();
    }

    @Override
    protected void setCost() {
        switch (this.size) {
            case "Small":
                this.cost = 35.00;
            case "Medium":
                this.cost = 50.00;
            case "Large":
                this.cost = 65.00;
            default:
                this.cost = 50.00;
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