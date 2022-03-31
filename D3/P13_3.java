package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P13_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String stn = sc.nextLine();
		String word = sc.nextLine();

		char[] stnToChar = stn.toCharArray();
		char[] wordToChar = word.toCharArray();
		char[] abcArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'j', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] abcNumStnArr = new int[26];
		int[] abcNumeWordArr = new int[26];

		for (int i = 0; i < abcArr.length; i++) {
			for (int j = 0; j < stn.length(); j++) {
				if (abcArr[i] == stnToChar[j]) {
					abcNumStnArr[i]++;
				}
			}
		}

		for (int i = 0; i < abcArr.length; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (abcArr[i] == wordToChar[j]) {
					abcNumeWordArr[i]++;
				}
			}
		}

		int[] cprArr = new int[abcNumeWordArr.length];
		for (int k = 0; k < abcArr.length; k++) {
			if (abcNumeWordArr[k] != 0) {
				cprArr[k] = abcNumStnArr[k] / abcNumeWordArr[k];
			}
		}

		int min = 100;
		for (int i = 0; i < cprArr.length; i++) {
			if (cprArr[i] != 0 && cprArr[i] < min) {
				min = cprArr[i];
			}
		}
		System.out.println(min);
	}

}
