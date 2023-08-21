package design_pattern.facade;

public class VeganBurger extends McDonald{
    @Override
    public void getMenu() {
        System.out.println("Vegan Burger");
    }
}
