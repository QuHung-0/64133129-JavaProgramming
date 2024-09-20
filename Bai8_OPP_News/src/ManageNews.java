import java.util.ArrayList;
import java.util.Scanner;

public class ManageNews
{
    public static void main(String[] args)
    {
        ArrayList<News> newsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\nMENU");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice)
            {
            case 1: // Insert news
                News news = new News();

                System.out.print("Enter ID: ");
                news.setID(scanner.nextInt());
                scanner.nextLine(); // Consume the newline

                System.out.print("Enter Title: ");
                news.setTitle(scanner.nextLine());

                System.out.print("Enter Publish Date: ");
                news.setPublishDate(scanner.nextLine());

                System.out.print("Enter Author: ");
                news.setAuthor(scanner.nextLine());

                System.out.print("Enter Content: ");
                news.setContent(scanner.nextLine());

                // Input ratings
                int[] rates = new int[3];
                for (int i = 0; i < 3; i++)
                {
                    System.out.print("Enter rating " + (i + 1) + ": ");
                    rates[i] = scanner.nextInt();
                }
                news.setRateList(rates);
                news.Calculate();
                newsList.add(news);
                break;

            case 2: // View list news
                for (News n : newsList)
                {
                    n.Display();
                    System.out.println("----------------------");
                }
                break;

            case 3: // Average rate
                for (News n : newsList)
                {
                    n.Calculate(); // Calculate average rate
                    n.Display();
                    System.out.println("----------------------");
                }
                break;

            case 4: // Exit
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid option, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
