import java.util.Arrays;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        
        // EXAMPLE INSTANCE OF STUDENT
        // Student jim = new Student();
        // jim.enroll();
        // jim.payBalance();
        // System.out.println(jim);

        // Ask how many new students we want to add...
        System.out.print("Enter Number of Students to Enroll: " );
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students.
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payBalance();
            
        }
        System.out.println(Arrays.toString(students));
    }
}
