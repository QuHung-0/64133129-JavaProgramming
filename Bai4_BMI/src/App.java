import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner banphim = new Scanner(System.in);
		
		float canNang, chieuCao, BMI;
		
		System.out.print("Tinh BMI\n");
		
		System.out.print("Nhap can nang (kg): ");
		canNang = banphim.nextFloat();

		
		System.out.print("Nhap chieu cao (m): ");
		chieuCao = banphim.nextFloat();
		
		BMI = (canNang / (chieuCao * chieuCao));
		
		if(BMI < 18.5)
		{
			System.out.print("BMI: " + BMI + ", Thieu can");
		}
		else if (18.5 < BMI && BMI < 24.9)
		{
			System.out.print("BMI: " + BMI + ", binh thuong");
		}
		else if (24.9 < BMI && BMI < 30)
		{
			System.out.print("BMI: " + BMI + ", thua can");
		}
		else if (BMI > 30)
		{
			System.out.print("BMI: " + BMI + ", beo phi");
		}
		else
		{
			System.out.print(BMI + " out of bound");
		}
		
	}
	
}
