package Main;

import java.util.Scanner;

public class P4_5 {

	static Float num1, num2;
	static String cal, oper;

	public static void main(String[] args) {
		P4_5 main = new P4_5();
		main.msg();

		main.calAndDiv();

		main.divcases(oper, num1, num2);
	}

	public void msg() {
		Scanner sc = new Scanner(System.in);

		System.out.println("input calculation. ex) 3*7");
		cal = sc.next();
	}

	public void calAndDiv() {
		int cut;
		String[] operArr = { "+", "-", "*", "/" };
		for (int i = 0; i < operArr.length; i++) {
			if (cal.contains(operArr[i])) {
				cut = cal.lastIndexOf(operArr[i]);
				num1 = Float.valueOf(cal.substring(0, cut));
				num2 = Float.valueOf(cal.substring(cut + 1));
				oper = operArr[i];
			}
		}
	}

	public void divcases(String opera, Float num11, Float num22) {
		if (opera.equals("+")) {
			addition(num11, num22);
		} else if (opera.equals("-")) {
			subtraction(num11, num22);
		} else if (opera.equals("*")) {
			multiplication(num11, num22);
		} else if (opera.equals("/")) {
			if (num22 == 0) {
				System.out.println("error");
			} else {
				division(num11, num22);
			}
		} else {
			System.out.println("error");
		}
	}

	public static void addition(Float num111, Float num222) {
		System.out.println(num111 + num222);
	}

	public static void subtraction(Float num111, Float num222) {
		System.out.println(num111 - num222);
	}

	public static void multiplication(Float num111, Float num222) {
		System.out.println(num111 * num222);
	}

	public static void division(Float num111, Float num222) {
		System.out.println(num111 / num222);
	}

}
