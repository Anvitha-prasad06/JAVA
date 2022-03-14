package assignment;
import java.util.Scanner;

public class ProductOfInt {
	private static Scanner input;
	public static void main(String[] arges) {
	
		input = new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("Enter 1st integer");
		number1=input.nextInt();
		System.out.println("Enter 2st integer");
		number2=input.nextInt();
		System.out.println("Enter 3st integer");
		number3=input.nextInt();
		System.out.printf("the result of multiplication is %d:",number1*number2*number3);
	}
}
