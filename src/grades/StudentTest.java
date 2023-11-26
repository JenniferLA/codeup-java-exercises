package grades;

public class StudentTest {
    public static void main(String[] args) {
    // Create student object
        Student student1 = new Student("Jennifer");
        Student student2 = new Student("Hobbes");

    // Add grades to student objects
        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(95);

        student2.addGrade(95);
        student2.addGrade(100);
        student2.addGrade(90);


    // Verify getGradeAverage method works (verify at least one with calc)
        System.out.println("Average grade for " + student1.getName() + " = " + student1.getGradeAverage());
        System.out.println("Average grade for " + student2.getName() + " = " + student2.getGradeAverage());
    }
}
