package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		// assigning string
		String test = "changeme";
		// assigning to a char array
		char[] c = test.toCharArray();

		// traverse each character using for loop
		for (int i = 0; i < c.length; i++) {

			// getting current character
			char ch = c[i];

			// Finding if character is odd
			if (i % 2 != 0) {

				// if odd convert to Upper case
				ch = Character.toUpperCase(ch);

			}
			System.out.print(ch);

		}

	}

}
