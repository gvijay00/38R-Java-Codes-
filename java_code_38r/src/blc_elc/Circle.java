package blc_elc;

// BLC --> BUSINESS LOGIC CLASS
class Circle {
    static  double PI = 3.14;  // Make PI a constant
     double radius;  

    public double areaOfCircle() {
        return PI * radius * radius;
    }

    public double circumferenceOfCircle() {
        return 2 * PI * radius;
    }

    public void initializeValues(double r) {
        radius = r;
    }

    public double diameter() {
        return 2 * radius;
    }

    public String display() {
        return "Radius of circle: " + radius + " cm\n" +
               "Diameter of circle: " + diameter() + " cm\n" +
               "Area of circle: " + areaOfCircle() + " sq.cm\n" +
               "Circumference of circle: " + circumferenceOfCircle() + " cm";
    }
}
