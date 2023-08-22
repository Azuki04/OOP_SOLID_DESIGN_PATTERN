package animal;

public class MainAnimal {

    public static void main(String[] args) {
        System.out.println("Test polymorphism");

        Animal animal = new Dog();

        Printer printer = new Printer(animal);

        printer.print();

        printer = new Printer(new Cat());

        printer.print();

    }
}
