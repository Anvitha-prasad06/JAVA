package assignment;
import java.util.Scanner;
public class DegreetoCelsius {
	private static Scanner input;
	public static void main(String[] agrs) {
		input = new Scanner(System.in);
		double celsius;
		double tempInFahrenheit=0.0;
		celsius=(tempInFahrenheit-32.0)*5.0/9.0;
		System.out.println("enter fahrenheit degree");
		tempInFahrenheit=input.nextDouble();
		System.out.printf("celsius value of %10.2f is %2.2f",tempInFahrenheit,celsius);
	}

}
