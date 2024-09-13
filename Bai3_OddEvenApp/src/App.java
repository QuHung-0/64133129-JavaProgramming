import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int input;
		
		System.out.print("Enter an integer:");
		
		Scanner banphim = new Scanner(System.in);

		input = banphim.nextInt();		
		if(input % 2 == 0) 
		{
			
			System.out.print(input + " is even\nbye");
			
		}
		else
		{
			
			System.out.print(input + " is odd\nbye");
			
		}
	}

}
