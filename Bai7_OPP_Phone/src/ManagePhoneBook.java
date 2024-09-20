import java.util.Scanner;

public class ManagePhoneBook
{
    public static void main(String[] args)
    {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do
        {
            // Display menu
            System.out.println("\nPHONEBOOK MANAGEMENT SYSTEM" + "\n1. Insert Phone\n" + "2. Remove Phone\n"
                    + "3. Update Phone\n" + "4. Search Phone\n" + "5. Sort\n" + "6. Exit\n");
            System.out.print("Choose an option: ");

            // Get user input
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (luaChon)
            {
            case 1:
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập số: ");
                String phone = scanner.nextLine();
                phoneBook.insertPhone(name, phone);
                break;
            case 2:
                System.out.print("Nhập tên để gỡ: ");
                name = scanner.nextLine();
                phoneBook.removePhone(name);
                break;
            case 3:
                System.out.print("Nhập tên để cập nhật: ");
                name = scanner.nextLine();
                System.out.print("Nhập số mới: ");
                String newPhone = scanner.nextLine();
                phoneBook.updatePhone(name, newPhone);
                break;
            case 4:
                System.out.print("Nhập tên để tìm: ");
                name = scanner.nextLine();
                phoneBook.searchPhone(name);
                break;
            case 5:
                phoneBook.sort();
                phoneBook.displayPhoneList();
                break;
            case 6:
                System.out.println("Thoát...");
                break;
            default:
                System.out.println("Không hợp lệ, hãy nhập lại");
            }
        } while (luaChon != 6);

        scanner.close();
    }
}
