import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
		//khai bao cac bien can thiet
		int a, b, tong;
		
		//chuan bi nhap du lieu
		Scanner banPhim = new Scanner(System.in);
		
		
		//Nhap du lieu
		//in HD cho user
		System.out.println("--- CT TINH TONG 2 SO NGUYEN ---");
		System.out.print("a = ");
		
		// doi user nhap, lay du lieu va cat vao bien a
		a =	banPhim.nextInt();
		
		System.out.print("b = ");
		// doi user nhap, lay du lieu va cat vao bien b
		b =	banPhim.nextInt();
		
		//Tinh tong
		tong = a + b;
		
		//xuat ket qua
		System.out.print("Tong la = " + tong);
	}// end of main

}//end of class
