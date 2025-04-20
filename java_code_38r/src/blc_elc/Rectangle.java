package blc_elc;

// BLC --> BUSINESS LOGIC CLASS
class Rectangle {
    double length;
    double breadth;

    public void initializeValues(double l, double b) {
        length = l;
        breadth = b;
    }

    public double areaOfRectangle() {
        return length * breadth;
    }

    public double perimeterOfRectangle() {
        return 2 * (length + breadth);
    }

    public String display() {
        return "Length of rectangle: " + length + " cm\n" +
               "Breadth of rectangle: " + breadth + " cm\n" +
               "Area of rectangle: " + areaOfRectangle() + " sq.cm\n" +
               "Perimeter of rectangle: " + perimeterOfRectangle() + " cm";
    }
}
