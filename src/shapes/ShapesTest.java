// Abstract Classes and Interfaces Exercise

// Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method

package shapes;

import javax.print.attribute.standard.MediaPrintableArea;

public class ShapesTest {
    public static void main(String[] args) {

        // create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1);

        // verify that the getPerimeter and getArea methods return 18 and 20, respectively
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        // create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5
//        Rectangle box2 = new Square(5);
//        System.out.println(box2);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        // declare a variable of the type Measurable named myShape.
        // test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.
        Measurable myShape = new Square(5);
        System.out.println("area = " + myShape.getArea());
        System.out.println("perimeter = " + myShape.getPerimeter());

        myShape = box1;
        System.out.println("rectangle area = " + myShape.getArea());
        System.out.println("rectangle perimeter = " + myShape.getPerimeter());
    }
}


