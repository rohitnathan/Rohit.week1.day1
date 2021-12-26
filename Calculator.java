package week1.day2;

public class Calculator {

	public int add (int num1, int num2) {
	return num1+num2;
	
     }
	public double sub (int num3, int num4) {
		return num3-num4;
	}
	public double mul (int num5, int num6) {
		return num5*num6;
	}
	public int divide (int num7, int num8) {
		return num7/num8;
	
	}
		
		public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(30,40);
		double sub = calc.sub(50,40);
		double mul = calc.mul(2,4);
		int divide = calc.divide(50,10);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);

	}

}
