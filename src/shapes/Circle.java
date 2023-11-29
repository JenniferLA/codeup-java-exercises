package shapes;

public class Circle {
    //private radius field
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //methods
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
