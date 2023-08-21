package design_pattern.facade;

public class MainFacade {

    public static void main(String[] args) {
        FacadeMenuList facadeMenuList = new FacadeMenuList();

        facadeMenuList.getVeganBurger();
        facadeMenuList.getDessert();
        facadeMenuList.getNormalBurger();
        System.out.println("All menu:");
        facadeMenuList.getAllMenu();

    }
}
