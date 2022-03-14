package assignment;
import java.util.*;
public class LargestOf10_9 {
	public static void main(String[] args) {
		int large;
		int[] arr1 = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("enter 10 numbers");
		for (int i=0;i<10;i++) {
			arr1[i]= in.nextInt();
		}
		large = arr1[0];
		for(int i=1;i<10;i++) {
			if(large<arr1[i]) {
				large=arr1[i];
			}
		}
		System.out.println("the largest number is "+large);
	}

}
