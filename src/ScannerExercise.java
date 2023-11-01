import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Jen";
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scan.next();
        System.out.printf("%s, %s", greeting, name);
    }
}
