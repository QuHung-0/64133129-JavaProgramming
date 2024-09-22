import java.util.ArrayList;
import java.util.Scanner;

public class BooksManagementSystem
{
    private static int bookIdCounter = 1;

    public static void main(String[] args)
    {

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {

            System.out.println("BOOKS MANAGEMENT SYSTEM");
            System.out.println("1. Insert new book");
            System.out.println("2. View list of books");
            System.out.println("3. Average Price");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
            case 1:
                System.out.print("Enter book name: ");
                String name = scanner.nextLine();

                System.out.print("Enter publish date: ");
                String publishDate = scanner.nextLine();

                System.out.print("Enter author: ");
                String author = scanner.nextLine();

                System.out.print("Enter language: ");
                String language = scanner.nextLine();

                int[] priceList = new int[5];
                for (int i = 0; i < 5; i++)
                {
                    System.out.print("Enter price " + (i + 1) + ": ");
                    priceList[i] = scanner.nextInt();
                }
                scanner.nextLine();

                Book newBook = new Book(bookIdCounter++, name, publishDate, author, language, priceList);

                bookList.add(newBook);
                System.out.println("Book added successfully!");
                break;

            case 2:
                System.out.println("List of books:");
                for (Book book : bookList)
                {
                    book.display();
                    System.out.println("-----------------------");
                }
                break;

            case 3:

                System.out.println("Books with their calculated average prices:");
                for (Book book : bookList)
                {
                    book.display();
                    System.out.println("-----------------------");
                }
                break;

            case 4:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
