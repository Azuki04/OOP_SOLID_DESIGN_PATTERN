package design_pattern.factory.burger_object;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("We have created a beef-burger");
    }
}
