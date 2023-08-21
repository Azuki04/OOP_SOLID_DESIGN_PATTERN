package design_pattern.facade;

public class NormalBurger extends McDonald{
    @Override
    public void getMenu() {
        System.out.println("Normal Burger");
    }
}
