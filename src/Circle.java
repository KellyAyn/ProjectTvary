public class Circle extends Shape {
    Circle() {}
    Circle(int width) {
        super(width);
    }
    void draw() {
        for (int i = -width; i <= width; i++) {
            for (int j = -width; j <= width; j++) {
                if (i*i + j*j <= width*width) System.out.print("# ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
    double getArea() {
        return Math.PI * width * width;
    }
    double getPerimeter() {
        return 2 * Math.PI * width;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
