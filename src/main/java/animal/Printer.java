package animal;

public class Printer  {

    private final Animal animal;

    public Printer(Animal animal) {
        this.animal = animal;
    }

    public void print() {
        System.out.println(animal.sound());
    }





}
