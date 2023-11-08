package shapes;

// Create a class named Square that extends Rectangle
public class Square extends Rectangle {

    // Square constructor that accepts one argument (side) and calls the parent's constructor to set both the length and the width to value of side
    public int side;

    //Override the getArea and getPerimeter methods with the following definitions for a square(perimeter = 4 x side and area = side ^ 2)

    @Override
    public int getArea() {
        System.out.println("getArea called in Square:");
        return side * side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("getPerimeter called in Square:");
        return 4 * side;
    }

    public Square(int side) {
        super(side, side);
        this.side = side;

    }
}
