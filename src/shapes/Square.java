// Abstract Classes and Interfaces Exercise

// Create a class named Square that extends Rectangle

package shapes;
//
//public class Square extends Rectangle {
//
//    // Define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side
//
//
//    public Square(int side) {
//        super(side, side);
//    }
//
//        //Override the getArea and getPerimeter methods with the following definitions for a square(perimeter = 4 x side and area = side ^ 2)
//
//    @Override
//    public int getArea() {
////        System.out.println("getArea called in Square: ");
//        return length * length;
//    }
//
//    @Override
//    public int getPerimeter() {
////        System.out.println("getPerimeter called in Square: ");
//        return 4 * length;
//    }
//
//    }

// Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral {
    // Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties
    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getPerimeter() {
        return length * 4;
    }

    @Override
    public int getArea() {
        return length * length;
    }

    public void setSide(int side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }
}