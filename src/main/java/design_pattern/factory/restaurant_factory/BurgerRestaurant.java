package design_pattern.factory.restaurant_factory;

import design_pattern.factory.burger_object.Burger;

public abstract class BurgerRestaurant {
    public Burger orderBurger(){
        return createBurger();
    }




    protected abstract Burger createBurger();

}
