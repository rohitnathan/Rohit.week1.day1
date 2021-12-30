package week1.day2;

public class Convertpostoneg {

	public static void main(String[] args) {
		int num = -40;

		if (num < 0) {

			// converting to positive if number is negative
			num = num * -1;
			System.out.println("Given number is" + " " + num);

		}

		System.out.println("The number" + num + "is positive");

	}

}
