package assignment;

import java.util.*;
public class ThreeIntegers_7 {
	public static void main(String[] args) {
	int x,y,z,sum,product,average,smallest,largest;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number for comparing");
	x = in.nextInt();
	y = in.nextInt();
	z = in.nextInt();
	sum = x+y+x;
	average = (x+y+z)/3;
	product = x*y*z;
	System.out.print("the sum is : " +(x+y)+ "\n the averagee is : " + ((x+y+z)/3) + "\n the product is : " + (x*y*z));
	if(x>y &&y>x) {
		System.out.println("\n X is largest");
	}
	else if(y>x && y>z) {
		System.out.println("\n y is largest");
	}
	else {
		System.out.println("\n z is largest");
	}
	if(x<y && y<z) {
		System.out.println("\n x is less");
	}
	else if(y<x && y<z) {
		System.out.println("\n y is less");
	}
	else {
		System.out.println("\n z is less");
	}
}
}