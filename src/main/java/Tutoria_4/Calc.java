package Tutoria_4;

public class Calc {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		Calc calc = new Calc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
	}

	public int add(int num1, int num2) {
		return num1 + num2;

	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
}

