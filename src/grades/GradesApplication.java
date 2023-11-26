package grades;

import grades.Student;
import util.Input;

import java.nio.file.LinkPermission;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
//    private static Map<String, Student> students;  // create global so u don't have to pass multiple times and had to create static but it's ok since we are only using it once — static method has limitations and really should be limited to utility methods like math

    public static void main(String[] args) {
        // Create a HashMap named students. It should have keys that are strings that represent GitHub usernames, and values that are Student objects.
        HashMap<String, Student> students = new HashMap<>(); // Map is fine since we are not mapping it to another map

        // Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        //another option is to add optional parameters and then call the method

        Student student1 = new Student("Hank");
        student1.addGrade(90);
        student1.addGrade(70);
        student1.addGrade(80);
        students.put("hank", student1);

        Student student2 = new Student("Bobby");
        student2.addGrade(60);
        student2.addGrade(70);
        student2.addGrade(85);
        students.put("bobby", student2);

        Student student3 = new Student("Peggy");
        student3.addGrade(82);
        student3.addGrade(89);
        student3.addGrade(85);
        students.put("peggy", student3);

        Student student4 = new Student("Luanne");
        student4.addGrade(100);
        student4.addGrade(95);
        student4.addGrade(94);
        students.put("luanne", student4);


        // Create Command Line Interface
        Scanner scanner = new Scanner(System.in);

        //Print the list of GitHub usernames out to the console, " Welcome! Here are the GitHub usernames of our students: "
        System.out.println("""
                Welcome!

                Here are the GitHub usernames of our students:
                                    
                """);
        System.out.println(students.keySet());


        // Ask the user which student they would like to see more information about:
        while (true) {
            System.out.println("What student would you like to see more information on?\n");
            String username = scanner.nextLine();

            // If the given input does not match up with a key in your map, tell the user that no users with that username were found:
            if (!students.containsKey(username)) {
                System.out.println("Sorry, no student found with the GitHub username of " + "\"" + username + "\"" + ".");
                // Ask the user if they would like to see another student:
            } else {
                Student student = students.get(username);
                System.out.println("Name: " + student.getName());
                System.out.println("Current Average: " + student.getGradeAverage());
            }

            System.out.println("Would you like to see another student? (y/n)");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                System.out.println("Goodbye, and have a wonderful day!\n");
                break;
            }
        }
            scanner.close();
        }
    }





//
//        //init the hashmap
//        initStudents();
//
//        printWelcome();
//
//        String ghName = input.getString("> ");
//
//        printStudentByGHName(ghName);
//
//        private static void printStudentbtGHName (String ghname){
//            Student student = students.get(ghName);
//            if (student == null) {
//                System.out.println("Sorry, no student found with the GitHub username of //");
//            } else {
//                //found the student so print out the student
//                //Bonus: Display all the student's grades in addition to the grade average (added 'Grades: %s')
//                System.out.printf("""
//                        Name: %s - GitHub Username: %s
//                        Current Average: %.1f
//                        Grades: %s
//                        """, student.getName(), ghName, student.getGradeAverage());
//            }
//            System.out.println("Would you like to see another student?\n");
//            boolean seeMoreStudents = input.yesNo("> ");
//
//            if (!seeMoreStudents) {
////                System.exit(0);
//                break;
//            }
//            System.out.println("Goodbye!");
//
//
//            //
//
//
//        }
//
//        private static void printWelcome () {
//            System.out.println("""
//                    Welcome!
//
//                    Here are the GitHub usernames of our students:
//                    """);
//
//            printStudent();
//
//            System.out.println("\nWhat student would you like to see more information on?\n");
//        }
//
//        private static void printStudent () {
//            //iterate through Hashmap's keyset (but best practice is to stay away from this)
//            for (String key : students.keySet()) {
//                System.out.print("|" + key + "| ");
//            }
//            System.out.println();
//        }
//
//        private static void initStudents () {
//        }

