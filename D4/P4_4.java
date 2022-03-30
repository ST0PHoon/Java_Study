package hello;

import java.util.Scanner;

public class P4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("#Menu");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		System.out.println("select type");
		int sel = sc.nextInt();
		System.out.println("input word");
		String word = sc.next();
		
		char[] wordToChar = word.toCharArray(); 
		if (sel == 1) {
			for (int i = 0; i < word.length(); i++) {
				wordToChar[i] -= 31;
			}
		} else if (sel == 2) {
			for (int i = 0; i < word.length(); i++) {
				wordToChar[i] += 31;
			}
		} else {
			System.out.println("select 1 or 2");
		}
		
		System.out.println("Result : ");
		for (int i = 0; i < word.length(); i++) {
			System.out.print(wordToChar[i]);
		}
		
	}

}
