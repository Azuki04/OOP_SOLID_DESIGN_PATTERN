package design_pattern.factory.burger_object;

public class VegiBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("We have created a vegi-burger");
    }
}
