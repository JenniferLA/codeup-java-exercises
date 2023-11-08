package shapes;

public class Rectangle {
    //Protected properties for both length and width(global):
    protected int length;
    protected int width;

    //Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties (getters and setters)
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //Create 2 methods(getArea and getPerimeter) that return the respective values
    public int getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    // Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
