import demo.shape.Circle;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        Circle circle = new Circle(0, 0, 3);


        double result = circle.calculateArea();

        System.out.printf("Area of circle with diameter %d is %f\n", circle.getDiameter(), result);

    }



}
