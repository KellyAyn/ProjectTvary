public class Circle extends Shape {
    Circle() {}
    Circle(int width) {
        super(width);
    }
    void draw() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (Math.pow(i - width / 2, 2) + Math.pow(j - width / 2, 2) <= Math.pow(width / 2, 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
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
