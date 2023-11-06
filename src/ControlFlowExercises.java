public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. Loop Basics:
        //a. While
//        int i = 5;
//        while (i < 16) {
//            System.out.println("i is " + i);
//            i++;
//        }

        //b. Do-While loop that will count by 2's starting with 0 and ending at 100:
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);
        //b. Alter loop to count backwards by 5's from 100 to -10:
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
        //b. Do-While starts at 2 and displays the number squared on each line while the number is less than 1,000,000:
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

        //c. Refactor the previous two exercises to use a for loop instead:
//        for (int i = 0; i <= 100 ; i+=2) {
//            System.out.println(i);
//        }
        // c. Refactor the previous exercise to use a for loop instead:
        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        //2. Fizzbuzz
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three:
    }
}
