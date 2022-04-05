package Main;

import java.util.Scanner;

public class P2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input word");
		String word = sc.nextLine();
		int wordLength = word.length();

		if (wordLength % 2 == 0) {
			System.out.println((char)word.charAt((wordLength / 2) - 1) + (char)word.charAt((wordLength / 2)));
		} else {
			System.out.println((char)word.charAt((wordLength / 2)));
		}

	}

}
