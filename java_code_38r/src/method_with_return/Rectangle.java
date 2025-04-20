package method_with_return;

public class Rectangle {
    double length;
    double width;

    public double areaOfRectangle() {
        return length * width;
    }

    public double perimeterOfRectangle() {
        return 2 * (length + width);
    }

    public void initializeValues(double l, double w) {
        length = l;
        width = w;
    }

    public String display() {
        return "Length of rectangle: " + length + " cm\n" +
               "Width of rectangle: " + width + " cm\n" +
               "Area of rectangle: " + areaOfRectangle() + " sq.cm\n" +
               "Perimeter of rectangle: " + perimeterOfRectangle() + " cm";
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.initializeValues(10, 5);
        System.out.println(rectangle.display());
    }
}
