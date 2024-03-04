import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int gradeYear;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600; // static because this will stay with the class -> It will not change. Not specific to AN object (one Student), but for ALL objects.
    private static int id = 1000;

    // Constructor: prompt user to enter student name and year (freshman,sophomore,etc).
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student Last Name: ");
        this.lastName = in.nextLine();

        System.out.print("1 for Freshman\n2 for Sophomore\n3 for Junior\n4 for Senior\nEnter Student Class: ");
         while(true) {
            int input = in.nextInt();
            if (input >=1 && input <=4) {
                this.gradeYear = input;
                break;
            } else {
                System.out.println("Invalid Year for Student. Try Again.");
                System.out.print("1 for Freshman\n2 for Sophomore\n3 for Junior\n4 for Senior\nEnter Student Class: ");
            }
           
         }
        setStudentID();
    }

    
    
    // Generate unique ID
    private void setStudentID() {
        // Grade Level + Static ID
        id++; // Incrementing static `id` for each new student.
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in courses
    public void enroll() {
        // loop, user hits `Q` when done enrolling.
        Scanner in = new Scanner(System.in);

        System.out.println("Type course to enroll, followed by `Enter` (Q to quit): ");

        String course = in.nextLine();
        while (!course.equalsIgnoreCase("Q")){
                courses += "\n " + course;
                tuitionBalance += costOfCourse;
                course = in.nextLine();
        }
    }
    // View balance and pay tuition
    public void getBalance() {
        System.out.println("Your balance is: $" + this.tuitionBalance);;
    }

    public void payBalance() {
        getBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment: $" + payment);
        getBalance();

    }
    // Status of student (print) / toString();



    @Override
    public String toString() {
        return "Student \nfirstName: " + firstName + "\nlastName: " + lastName + "\nstudentID: " + studentID
                + "\ngradeYear: " + gradeYear + "\ncourses: " + courses + "\ntuitionBalance: $" + tuitionBalance + "\n";
    }
    
}
