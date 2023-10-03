package design_pattern.factory.restaurant_factory;

import design_pattern.factory.burger_object.Burger;
import design_pattern.factory.burger_object.VegiBurger;

public class VegiBurgerCreator extends BurgerRestaurant {

    @Override
    protected Burger createBurger() {
        return new VegiBurger();
    }
}
