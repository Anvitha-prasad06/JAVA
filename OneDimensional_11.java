package assignment;
import java.util.*;
public class OneDimensional_11 {
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,0,0,0,0,0};
		int[] bonus;
		bonus = new int[15];
		for (int i=0; i<15; i++) {
			bonus[i]+=1;
		}
		int bestScores[]= {10,70,30,60,50};
		for(int i=0;i<5;i++) {
			System.out.printf("%d\t",bestScores[i]);
		}
	}

}
