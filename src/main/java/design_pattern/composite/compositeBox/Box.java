package design_pattern.composite.compositeBox;

import java.util.ArrayList;
import java.util.List;

public class Box implements CalculateCost{
    private List<CalculateCost> products = new ArrayList<>();

    @Override
    public int getCost() {
        int cost = 0;
        for(CalculateCost product:products) {
            cost += product.getCost();
        }
        return cost;
    }

    public void addProduct(CalculateCost product) {
        products.add(product);
    }

    public void removeProduct(CalculateCost product) {
        products.remove(product);
    }
}
