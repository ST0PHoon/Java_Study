package Main;

import java.util.Scanner;
import java.util.Stack;

public class P3_9 {

	public static void main(String[] args) {
		Stack<String> number = new Stack<String>();
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		String numbers = sc.nextLine();

		String num = sc.nextLine();

		String[] numbersArr = numbers.split(" ");

		for (int i = 0; i < numbersArr.length; i++) {
			number.push(numbersArr[i]);
		}

		for (int i = 0; i < numbersArr.length; i++) {
			if (number.pop().equals(num)) {
				System.out.println(i + 1);
				cnt++;
				break;
			}
		}

		if (cnt == 0) {
			System.out.println("no number");
		}

	}

}