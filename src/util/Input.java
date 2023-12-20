package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }


//    public int getInt(int min, int max) {
//        int num;
//        do {
//            System.out.println("Please enter a valid integer between " + min + " and " + max + ":");
//            while (!scanner.hasNextInt()) {
//                System.out.println("That's not a number. Please enter a number: ");
//                scanner.next(); // Consume invalid input
//            }
//            num = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//        } while (num < min || num > max);
//        return num;
//    }

//    public int getInt() {
//        int num;
//        do {
//            System.out.println("Please enter a number: ");
//            while (!scanner.hasNextInt()) {
//                System.out.println("That's not a number. Please enter a number: ");
//                scanner.next(); // Consume invalid input
//            }
//            num = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//        } while (num < 0);
//        return num;
//    }

    public int getInt() {
        int userInt = 0;
        String s = getString();
        try {
            userInt = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Please re-enter: ");
            userInt = getInt();
        }
        return userInt;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        return getInt(min, max, "");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int anInt = getInt();
        if (anInt < min || anInt > max) {
            System.out.printf( "Hey! That was not a number between %d and %d!!%n", min, max);
            return getInt(min, max, prompt);
        }
        return anInt;
    }


    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double aDouble = getDouble();
        if (aDouble < min || aDouble > max) {
            System.out.printf("Hey! That was not between %f and %f!!%n", min, max);
            return getDouble(min, max);
        }
        return aDouble;
    }

    public double getDouble() {
        double userDouble = 0;

        // make sure the user doesnt screw it up
        String s = getString();
        try {
            userDouble = Double.valueOf(s);
        } catch (NumberFormatException e) {
            // user messed up
            System.out.print("Invalid double. Please re-enter: ");
            userDouble = getDouble();
        }

        return userDouble;
    }
}