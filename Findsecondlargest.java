package week1.day2;

import java.util.Arrays;

public class Findsecondlargest {

	public static void main(String[] args) {
		
		int [] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);//2,2,4,6,7,11
		
		int secondlargest = data.length-2;
		
		System.out.println(data[secondlargest]);
		
				

	}

}
