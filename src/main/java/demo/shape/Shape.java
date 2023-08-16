package demo.shape;

public abstract class Shape implements ShapeWithArea {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.printf("Shape has been moved to (%d,%d)\n", newX, newY);
    }

    //An abstract method is a method that is declared but not defined in a class. It acts as a placeholder for methods that must be implemented in subclasses.

    // Don`t now why not use in as Interface --> ShapeWithArea
    public abstract void draw();
}