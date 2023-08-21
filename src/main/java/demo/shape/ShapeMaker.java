package demo.shape;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape cube;

    public ShapeMaker() {
        circle = new Circle(1, 2, 2);
        rectangle = new Rectangle(2, 3, 34, 5);
        cube = new Cube(3, 3, 3);
    }
        public void drawCircle(){
            circle.draw();
        }

        public void drawRectangle(){
            rectangle.draw();
        }
        public void drawCube(){
            cube.draw();

    }



}
