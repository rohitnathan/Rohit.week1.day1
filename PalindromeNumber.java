package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n = 34343;
		
		//variable to hold reversed number
		int rev = 0;
		int temp =0;

		// Storing number in temporary variable
		temp=n;
		
		//reverse 
		for(; n!=0; n/=10) {
            rev = (rev * 10) + n%10;
		}
			if (temp== rev) {
				System.out.println("Ït is a Palindrome");

			} else{
				System.out.println("It is not a palindrom");

			}
		}
	}

