package design_pattern.facade;

public class Dessert extends McDonald{
    @Override
    public void getMenu() {
        System.out.println("Dessert");
    }
}
