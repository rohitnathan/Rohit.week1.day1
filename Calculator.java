package week1.day2;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public double sub(double d, double e) {
		return d - e;
	}

	public double mul(double d, double e) {
		return d * e;
	}

	public int divide(int num7, int num8) {
		return num7 / num8;

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(30, 40);
		double sub = calc.sub(50.55, 40.25);
		double mul = calc.mul(2.5, 4.5);
		int divide = calc.divide(50, 10);

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);

	}

}
