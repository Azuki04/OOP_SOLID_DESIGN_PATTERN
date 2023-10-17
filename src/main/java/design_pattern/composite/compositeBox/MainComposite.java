package design_pattern.composite.compositeBox;

public class MainComposite {
    public static void main(String[] args) {
        Product product1 = new Product(10, "Product 1");
        Product product2 = new Product(20, "Product 2");
        Product product3 = new Product(30, "Product 3");

        Box box1 = new Box();
        box1.addProduct(product1); // CHF 10
        box1.addProduct(product2); // CHF 20

        Box box2 = new Box();
        box2.addProduct(product3); // CHF 30
        box2.addProduct(box1);

        System.out.println(box2.getCost());
    }
}
