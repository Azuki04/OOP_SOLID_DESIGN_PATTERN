package design_pattern.factory.facade;

import design_pattern.factory.burger_object.Burger;
import design_pattern.factory.restaurant_factory.BeefBurgerCreator;
import design_pattern.factory.restaurant_factory.BurgerRestaurant;
import design_pattern.factory.restaurant_factory.VegiBurgerCreator;

public class FacadeMainList {
    // Facade pattern is used to hide the complexity of the system and provide an interface to the client using which the client can access the system.

    private final BurgerRestaurant beefResto = new BeefBurgerCreator();
    private final BurgerRestaurant vegiResto = new VegiBurgerCreator();
    private final Burger beefBurger;
    private final Burger vegiBurger;


    public FacadeMainList(Burger beefBurger, Burger vegiBurger) {
        this.beefBurger = beefBurger;
        this.vegiBurger = vegiBurger;
    }


    public void getBeefBurger(){
        beefBurger.prepare();
        System.out.println("Beef Burger is ready");
    }

    public void getVegiBurger(){
        vegiBurger.prepare();
        System.out.println("Vegi Burger is ready");
    }

    public void getAllBurger(){
        beefBurger.prepare();
        vegiBurger.prepare();
        System.out.println("All Burger is ready");
    }
}
