package Main;

import java.util.Scanner;

public class A2_6 {

	public static void main(String[] args) {
		// 입력
		String getNumber = insertNumber();

		// 계산
		String reversedNumber = reverseNumberCal(getNumber);

		// 출력
		System.out.println(reversedNumber);
	}

	public static String insertNumber() {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		return number;
	}

	public static String reverseNumberCal(String number) {
		String[] numberList = number.split("");
		String[] reverseNumberList = new String[number.length()];

		for (int i = number.length() - 1, j = 0; i > -1; i--, j++) {
			reverseNumberList[j] = numberList[i];
		}
		
		String reverseNumber = String.join("", reverseNumberList);
		
		return reverseNumber;
	}

}
