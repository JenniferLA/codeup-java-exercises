package shapes;

// Create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
public abstract class Quadrilateral extends Shape implements Measurable {

// Protected properties for length and width.
    protected int length;
    protected int width;

// Constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

// Methods for getting the length and width:
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

// Abstract methods for setting the length and width:
    public abstract void setLength(int length);
    public abstract void setWidth(int width);

}
