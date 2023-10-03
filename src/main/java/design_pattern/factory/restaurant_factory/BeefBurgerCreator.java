package design_pattern.factory.restaurant_factory;

import design_pattern.factory.burger_object.BeefBurger;
import design_pattern.factory.burger_object.Burger;

public class BeefBurgerCreator extends BurgerRestaurant {


    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
}
