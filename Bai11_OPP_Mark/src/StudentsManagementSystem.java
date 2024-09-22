import java.util.ArrayList;
import java.util.Scanner;

public class StudentsManagementSystem
{
    private static int studentIdCounter = 1;

    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("STUDENTS MANAGEMENT SYSTEM");
            System.out.println("1. Insert new Student");
            System.out.println("2. View list of Students");
            System.out.println("3. Search Students by Class");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
            case 1:
                // Insert a new student
                System.out.print("Enter Full Name: ");
                String fullName = scanner.nextLine();

                System.out.print("Enter Date of Birth (dd/mm/yyyy): ");
                String dateOfBirth = scanner.nextLine();

                System.out.print("Enter Native Place: ");
                String nativePlace = scanner.nextLine();

                System.out.print("Enter Class: ");
                String studentClass = scanner.nextLine();

                System.out.print("Enter Phone Number: ");
                String phoneNo = scanner.nextLine();

                System.out.print("Enter Mobile Number: ");
                int mobile = scanner.nextInt();
                scanner.nextLine();

                Student newStudent = new Student(studentIdCounter++, fullName, dateOfBirth, nativePlace, studentClass,
                        phoneNo, mobile);

                studentList.add(newStudent);
                System.out.println("Student added successfully!");
                break;

            case 2:

                System.out.println("List of Students:");
                for (Student student : studentList)
                {
                    student.Display();
                }
                break;

            case 3:

                System.out.print("Enter Class to search: ");
                String searchClass = scanner.nextLine();
                System.out.println("Students in class " + searchClass + ":");
                for (Student student : studentList)
                {
                    if (student.getStudentClass().equals(searchClass))
                    {
                        student.Display();
                    }
                }
                break;

            case 4:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
