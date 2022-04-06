package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2_9 {

	public static void main(String[] args) {
		Queue<String> number = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String numbers = sc.nextLine();

		String num = sc.nextLine();

		String[] numbersArr = numbers.split(" ");

		for (int i = 0; i < numbersArr.length; i++) {
			number.add(numbersArr[i]);
		}

		for (int i = 0; i < numbersArr.length; i++) {
			if (number.poll().equals(num)) {
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
