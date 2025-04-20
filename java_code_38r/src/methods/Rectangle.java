package methods;

public class Rectangle {
    double length;
    double width;

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10.5;
        rect.width = 5.5;

        rect.calculateArea();
        rect.calculatePerimeter();
    }
}
