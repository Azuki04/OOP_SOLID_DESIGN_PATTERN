package animal;

public class Printer  {

    Animal animal;

    public Printer() {
    }

    public Printer(Animal animal) {
        this.animal = animal;
    }

    public void print() {
        System.out.println(animal.sound());
    }





}
