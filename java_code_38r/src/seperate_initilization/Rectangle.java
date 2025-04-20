package seperate_initilization;

public class Rectangle {
    // Variables to store length and breadth of the rectangle
    double length;
    double breadth;

    // Method to initialize length and breadth
    public void initializeValues(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and print the area of the rectangle
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }

    // Method to calculate and print the perimeter of the rectangle
    public void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle rect = new Rectangle();
        
        // Initializing the rectangle's dimensions
        rect.initializeValues(10.5, 5.5);
        
        // Printing rectangle details
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + rect.length);
        System.out.println("Breadth: " + rect.breadth);
        
        // Calculating and displaying area and perimeter
        rect.calculateArea();
        rect.calculatePerimeter();
    }
}
