package util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        //String getString()
        System.out.println("Enter a string: ");
        String userInputString = input.getString();
        System.out.println("You entered: " + userInputString);

        //boolean yesNo()
        System.out.println("Enter 'y' or 'yes': ");
        boolean yesNoResult = input.yesNo();
        System.out.println("You input result: " + yesNoResult);

        //int getInt(int min, int max)
        int userInputInt = input.getInt(10, 20);
        System.out.println("You entered: " + userInputInt);

        //int getInt()
        int userInputNum = input.getInt();
        System.out.println("You entered: " + userInputNum);

        //double getDouble(double min, double max)
        double userInputDouble = input.getDouble(1, 19.99d);
        System.out.println("You entered: " + userInputDouble);

        //double getDouble()
        System.out.println("Enter a floating point number: ");
        double userInputDubNum = input.getDouble();
        System.out.println("You entered: " + userInputDubNum);
    }
}
