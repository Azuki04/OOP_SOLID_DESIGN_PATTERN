package design_pattern.factory.desert_factory;

import design_pattern.factory.desert_object.Desert;
import design_pattern.factory.desert_object.Tiramisu;
import design_pattern.factory.restaurant_factory.BurgerRestaurant;

public class TiramisuCreate extends BurgerRestaurant {



    @Override
        protected Desert createDesert() {
            return new Tiramisu();
        }
}
