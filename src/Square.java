public class Square extends Rectangle {
    Square() {}
    Square(int width) {
        super(width, width);
    }
    void draw() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    double getArea() {
        return width * width;
    }
    double getPerimeter() {
        return 4 * width;
    }
}
