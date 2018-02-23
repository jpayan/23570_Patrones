package Components;

public class PayucaMocha extends Beverage {
    public PayucaMocha(String size) {
        this.description = "PayucaMocha";
        this.size = !size.isEmpty() ? size : this.size;
        setCost();
    }

    @Override
    protected void setCost() {
        switch (this.size) {
            case "Small":
                this.cost = 55.00;
            case "Medium":
                this.cost = 70.00;
            case "Large":
                this.cost = 85.00;
            default:
                this.cost = 70.00;
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