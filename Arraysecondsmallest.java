package week1.day2;

import java.util.Arrays;

public class Arraysecondsmallest {

	public static void main(String[] args) {
		int[] a = { 23, 45, 67, 32, 89, 22 };

		Arrays.sort(a);

		System.out.println("The second smallest number is" + " " + a[1]);

	}

}
