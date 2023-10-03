package design_pattern.factory.facade;

import design_pattern.factory.burger_object.Burger;
import design_pattern.factory.restaurant_factory.BeefBurgerCreator;
import design_pattern.factory.restaurant_factory.BurgerRestaurant;
import design_pattern.factory.restaurant_factory.VegiBurgerCreator;

public class FacadeMenuList {

    private final BurgerRestaurant beefResto;
    private final BurgerRestaurant vegiResto;

    public FacadeMenuList() {
        beefResto = new BeefBurgerCreator();
        vegiResto = new VegiBurgerCreator();
    }

    private void orderAndPrepare(BurgerRestaurant restaurant, String burgerType) {
        Burger burger = restaurant.orderBurger();
        burger.prepare();
        System.out.println(burgerType + " Burger is ready");
    }

    public void orderAndPrepareBeefBurger() {
        orderAndPrepare(beefResto, "Beef");
    }

    public void orderAndPrepareVegiBurger() {
        orderAndPrepare(vegiResto, "Vegi");
    }

    public void orderAndPrepareAllBurgers() {
        System.out.println("Ordering and preparing all burgers...");
        orderAndPrepareBeefBurger();
        orderAndPrepareVegiBurger();
    }
}
