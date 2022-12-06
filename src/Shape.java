public abstract class Shape {
    int width;
    int height;

    Shape() {
    }

    Shape(int width) {
        this.width = width;
    }

    Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    abstract void draw();

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}