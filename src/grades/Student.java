package grades;

import java.util.ArrayList;

public class Student { // Student = Domain object (what this project is really about - specific to what this application is doing bc domain the fields are interesting)

    // Set private properties for the student's name and grades:
    private String name;

    // Set grades property to be an ArrayList of integers.
    private ArrayList<Integer> grades; // abstractlist and when initialized it will become and arraylist

    // Student class constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(); // don't have to add 'this.grades' bc more explicit
    }

    // The StudentGradesApp.Student class should have the following methods:
    // 1. Returns the student's name
    public String getName() {
        return name;
    }

    // 2. Adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // 3. Returns the average of the students' grades
    public double getGradeAverage() { //double works better for int bc int can handle all doubles
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

}
