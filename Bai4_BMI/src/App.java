import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner banphim = new Scanner(System.in);

        float canNang = 0, chieuCao = 0, BMI;

        System.out.print("Tinh BMI\n");

        while (true)
        {
            try
            {
                System.out.print("Nhap can nang (kg): ");
                canNang = banphim.nextFloat();

                if (canNang > 0)
                {
                    break;
                }
                else if (canNang < 0)
                {
                    System.out.println("Can nang phai lon hon 0, hay nhap lai");
                    canNang = banphim.nextFloat();
                }
            }
            catch (Exception e)
            {
                System.out.println("Gia tri nhap khong hop le");
                banphim.next();
            }

        }

        while (true)
        {
            try
            {
                System.out.print("Nhap chieu cao (m): ");
                chieuCao = banphim.nextFloat();

                if (chieuCao  > 0)
                {
                    break;
                }
                else if (chieuCao < 0)
                {
                    System.out.println("chieu cao phai lon hon 0, hay nhap lai");
                    chieuCao = banphim.nextFloat();
                }
            }
            catch (Exception e)
            {
                System.out.println("Gia tri nhap khong hop le");
                banphim.next();
            }

        }

        BMI = (canNang / (chieuCao * chieuCao));

        if (BMI < 18.5)
        {
            System.out.print("BMI: " + BMI + ", Thieu can");
        } else if (18.5 <= BMI && BMI < 24.9)
        {
            System.out.print("BMI: " + BMI + ", Binh thuong");
        } else if (24.9 <= BMI && BMI < 30)
        {
            System.out.print("BMI: " + BMI + ", Thua can");
        } else if (BMI >= 30)
        {
            System.out.print("BMI: " + BMI + ", Beo phi");
        }
    }
}
