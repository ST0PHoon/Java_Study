package Main;

import java.util.Scanner;

public class P6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		System.out.print("input sentence\n -> ");
		String text = sc.nextLine();

		System.out.print("input specified character\n -> ");
		String findWord = sc.nextLine();

		String[] textArrChar = text.split("");
		String[] textArrWord = text.split(" ");

		if (findWord.length() == 1) {
			for (int i = 0; i < textArrChar.length; i++) {
				if (textArrChar[i].equals(findWord)) {
					cnt++;
				}
			}
		} else {
			for (int i = 0; i < textArrWord.length; i++) {
				if (textArrWord[i].equals(findWord)) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}
