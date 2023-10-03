package design_pattern.factory.desert_object;

public class Glace implements Desert {
    @Override
    public void prepare() {
        System.out.println("We have created a glace");
    }
}
