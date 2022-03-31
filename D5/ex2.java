package Main;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// 입력 4P2, 출력 4X3 = 6
		Scanner sc = new Scanner(System.in);
		int cut, number1 = 0, number2 = 0;
		String text = sc.next();
		String[] textArr = text.split("");

		for (int i = 0; i < text.length(); i++) {
			if (textArr[i].equals("P")) {
				cut = text.lastIndexOf(textArr[i]);
				number1 = Integer.parseInt(text.substring(0, cut));
				number2 = Integer.parseInt(text.substring(cut + 1));
			}
		}

		int P1 = multy(number1);
		int P2 = multy(number2);

		int output = P1 / P2;

		for (int i = number1; i > number2 + 1; i--) {
			System.out.print(i + "X");
		}

		System.out.println((number2 + 1) + " = " + output);

	}

	public static int multy(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * multy(--num);
		}
	}

}
