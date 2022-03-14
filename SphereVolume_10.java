package assignment;
import java.util.*;
public class SphereVolume_10 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter radius of sphere:");
		double r=s.nextDouble();
		double volume=(4*22*r*r*r)/(3*7);
		System.out.println("volume is : "+volume);
	}

}
