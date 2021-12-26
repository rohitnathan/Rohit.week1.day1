package week1.day2;

public class Sumofdigits {
	
	//armstrong number

	public static void main(String[] args) {
		int input =153; //(1*1*1)+(5*5*5)+(3*3*3) ->153
		int calculated;
		int remainder;
		int original;
		
		original = input;
		calculated = 0;
		
		while(input > 0 ) {
			
			remainder = input % 10;
			calculated = calculated + (remainder*remainder*remainder);//0+(3*3*3)
			input = input/10 ; //153/10 =>15
		}
		
		if(calculated==original) {
			System.out.println("Number is Armstrong");}
			else
				System.out.println("Number is not Armstrong");
		}
		
			
			
			
			
			
		}
		
		
		
		
		


	


