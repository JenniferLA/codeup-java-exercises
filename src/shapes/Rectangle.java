//Abstract Classes and Interfaces Exercise
package shapes;

// Inside of your shapes directory, create a class named Rectangle

//    public Rectangle {
//    Protected properties for both length and width(global):
//        protected int length;
//        protected int width;

    //Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties (getters and setters)

//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    //Create 2 methods(getArea and getPerimeter) that return the respective values
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return 2 * (length + width);
//    }
//
//    @Override
//    public String toString() {
//        return "Rectangle{" +
//                "length=" + length +
//                ", width=" + width +
//                '}';
//    }
//}

// Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable
public class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;

    }

    @Override
    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public int getArea() {
        return length * width;
    }
}


