package hello;

import java.util.Scanner;

public class P5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] upper = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int cnt = 0;
		System.out.println("e.g");
		System.out.println("#1 : 9 digits or less");
		System.out.println("#2 : contain \"1\"");
		System.out.println("#3 : contain one uppercase");
		System.out.println("#4 : don\'t contain \"a\"");
		System.out.println("#5 : contain \"!\"");
		System.out.println("-> ");
		String sntc = sc.next();

		String[] sntcArr = sntc.split("");

		if (sntc.length() <= 9 && sntc.contains("1") && !sntc.contains("a") && sntc.contains("!")) {
			for (int j = 0; j < sntc.length(); j++) {
				for (int i = 0; i < upper.length; i++) {
					if (sntcArr[j].contains(upper[i])) {
						cnt++;
					}
				}
			}

			if (cnt == 1) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}

		} else {
			System.out.println("FAIL");
		}

	}

}
