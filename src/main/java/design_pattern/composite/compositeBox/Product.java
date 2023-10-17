package design_pattern.composite.compositeBox;

public class Product implements CalculateCost{
    private int cost;
    private String name;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
