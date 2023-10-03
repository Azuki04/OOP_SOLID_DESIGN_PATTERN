package design_pattern.factory;

import design_pattern.factory.burger_object.Burger;
import design_pattern.factory.facade.FacadeMenuList;
import design_pattern.factory.restaurant_factory.BeefBurgerCreator;
import design_pattern.factory.restaurant_factory.BurgerRestaurant;
import design_pattern.factory.restaurant_factory.VegiBurgerCreator;

public class FactoryMain {
    public static void main(String[] args) {
        BurgerRestaurant beefResto = new BeefBurgerCreator();
        Burger beefBurger = beefResto.orderBurger();
        beefBurger.prepare();
        System.out.println("Beef Burger is ready");



        System.out.println("====================================");

        BurgerRestaurant vegiResto = new VegiBurgerCreator();
        Burger vegiBurger = vegiResto.orderBurger();
        vegiBurger.prepare();
        System.out.println("Vegi Burger is ready");



        System.out.println("====================================");

        FacadeMenuList facadeMenuList = new FacadeMenuList();
        facadeMenuList.orderAndPrepareBeefBurger();
        System.out.println("====================================");
        facadeMenuList.orderAndPrepareVegiBurger();
        System.out.println("====================================");
        facadeMenuList.orderAndPrepareAllBurgers();

    }
}
