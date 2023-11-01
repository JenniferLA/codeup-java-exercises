import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //1. Use variable pi for output:
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %f%n", pi);
        Scanner scanner = new Scanner(System.in);

        //1. Prompt a user to enter a integer and store value as int using nextInt method:
//        System.out.print("Enter a number: ");
//        Integer userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //2. Prompt a user to enter 3 words and store each of them in a separate variable:
//        System.out.print("Enter three words: ");
//        String userInputWordOne = scanner.next();
//        String userInputWordTWo = scanner.next();
//        String userInputWordThree = scanner.next();
//        System.out.printf("You entered: --> %n \"" + userInputWordOne + "%n" + userInputWordTWo + "%n" + userInputWordThree+ "\" <--");
        //3. Prompt a user to enter a sentence and store sentence as String using next method:
//        System.out.print("Enter a sentence: ");
//        String userInputSentence = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInputSentence + "\" <--");

        //1, Prompt the user to enter values of length and width of a classroom
        System.out.print("Enter the length of the classroom: ");
        int length = Integer.parseInt(scanner. nextLine());

        System.out.println("Enter the width of your classroom: ");
        int width = Integer.parseInt(scanner.nextLine());

        int area = length + width;
        int perimeter = 2*length + 2*width;

        System.out.printf("The area of your room is %d and the perimeter is %d%n", area, perimeter);

    }
}
