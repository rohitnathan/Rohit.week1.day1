package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		String original = "madam";
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equals(reverse)) {
			System.out.println("The String is a Palindrome");
		} else {
			System.out.println("The String is not a Palindrome");
		}
	}

}
