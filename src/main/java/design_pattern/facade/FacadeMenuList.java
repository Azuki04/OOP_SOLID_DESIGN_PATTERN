package design_pattern.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FacadeMenuList {

    private final Restaurant veganBurger;
    private final  Restaurant dessert;
    private final Restaurant normalBurger;

    public FacadeMenuList() {
        veganBurger = new VeganBurger();
        dessert = new Dessert();
        normalBurger = new NormalBurger();
    }

    public void getVeganBurger() {
        veganBurger.getMenu();
    }
    public void getNormalBurger() {
        normalBurger.getMenu();
    }

    public void getDessert() {
        dessert.getMenu();
    }


    public void getAllMenu() {
        List<Restaurant> card = Arrays.asList(veganBurger, dessert, normalBurger);
        for (Restaurant menu : card) {
            menu.getMenu();
        }
    }
}
