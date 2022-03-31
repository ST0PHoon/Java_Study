package Main;

import java.util.Scanner;

public class P6_5 {

	static double num1, num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6_5 main = new P6_5();

		String cal = main.msg();

		char oper = getOperator(cal);

		double result = divcase(oper);

		System.out.println(result);
	}

	public String msg() {
		Scanner sc = new Scanner(System.in);

		System.out.println("input calculation. ex) 3*7");
		String cal = sc.next();

		return cal;
	}

	public static char getOperator(String formula) {
		char oper = '0';
		int cut = 0;

		String[] operArr = { "+", "-", "*", "/" };
		for (int i = 0; i < operArr.length; i++) {
			if (formula.contains(operArr[i])) {
				cut = formula.lastIndexOf(operArr[i]);
				num1 = Double.parseDouble(formula.substring(0, cut));
				num2 = Double.parseDouble(formula.substring(cut + 1));
				oper = operArr[i].charAt(0);
			}
		}

		return oper;
	}

	public static double divcase(char forml) {
		double result = 0;

		if (forml == '+') {
			result = addition(num1, num2);
		} else if (forml == '-') {
			result = subtraction(num1, num2);
		} else if (forml == '*') {
			result = multiplication(num1, num2);
		} else if (forml == '/') {
			if (num2 == 0) {
				System.out.println("error");
			} else {
				result = division(num1, num2);
			}
		} else {
			System.out.println("error");
		}

		return result;
	}

	public static double addition(double num111, double num222) {
		double result;
		result = num111 + num222;
		return result;
	}

	public static double subtraction(double num111, double num222) {
		double result;
		result = num111 - num222;
		return result;
	}

	public static double multiplication(double num111, double num222) {
		double result;
		result = num111 * num222;
		return result;
	}

	public static double division(double num111, double num222) {
		double result;
		result = num111 / num222;
		return result;
	}

}
