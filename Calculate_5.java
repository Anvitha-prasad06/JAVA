package assignment;
import java.util.*;
public class Calculate_5 {
	public static void main(String[] agrs) {
		int x,y;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the neumber to perform sum,difference,product and dividion on");
		x= in.nextInt();
		y=in.nextInt();
		System.out.print("the sum is" +(x+y)+ "\n the difference is" + (x-y) + "\n the product is" + (x*y) + "\n the division is" + (x/y) + "\n the modulus is" + (x%y));
		
	}

}
