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

    public abstract void draw();
}