import java.util.ArrayList;
import java.util.Scanner;

public class MarksManagementSystem
{
    private static int studentIdCounter = 1;

    public static void main(String[] args)
    {
        ArrayList<StudentMark> studentMarkList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("MARKS MANAGEMENT SYSTEM");
            System.out.println("1. Insert Student Marks");
            System.out.println("2. View List of Students");
            System.out.println("3. Calculate and View Average Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
            case 1:
                try
                {
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Enter class: ");
                    String studentClass = scanner.nextLine();

                    System.out.print("Enter semester: ");
                    int semester = scanner.nextInt();

                    int[] subjectMarks = new int[5];
                    for (int i = 0; i < 5; i++)
                    {
                        System.out.print("Enter mark for subject " + (i + 1) + ": ");
                        subjectMarks[i] = scanner.nextInt();
                    }

                    StudentMark newStudent = new StudentMark(studentIdCounter++, fullName, studentClass, semester,
                            subjectMarks);
                    studentMarkList.add(newStudent);
                    System.out.println("Student marks added successfully!");
                } catch (Exception e)
                {
                    System.out.println("Error: Invalid input.");
                } finally
                {
                    scanner.nextLine();
                }
                break;

            case 2:
                System.out.println("List of Students:");
                for (StudentMark student : studentMarkList)
                {
                    student.Display();
                    System.out.println("----------------------------");
                }
                break;

            case 3:
                System.out.println("Students with their calculated average marks:");
                for (StudentMark student : studentMarkList)
                {
                    student.AveCal();
                    student.Display();
                    System.out.println("----------------------------");
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