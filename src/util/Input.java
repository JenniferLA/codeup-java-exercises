package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }


    public int getInt(int min, int max) {
        int num;
        do {
            System.out.println("Please enter a valid integer between " + min + " and " + max + ":");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number. Please enter a number: ");
                scanner.next(); // Consume invalid input
            }
            num = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        int num;
        do {
            System.out.println("Please enter a number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number. Please enter a number: ");
                scanner.next(); // Consume invalid input
            }
            num = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } while (num < 0);
        return num;
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