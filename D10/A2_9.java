package Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A2_9 {

	public static void main(String[] args) {
		wordcheck();
	}
	
	public static void wordcheck() {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> firstWordArray = new ArrayList<String>();
		ArrayList<String> secondWordArray = new ArrayList<String>();
		int cnt = 0;
		
		System.out.println("input word");
		String firstWord = sc.nextLine();
		System.out.println("input word");
		String secondWord = sc.nextLine();
		
		String[] firstWordCheck = firstWord.split("");
		String[] secondWordCheck = secondWord.split("");
		
		for (String num_list : firstWordCheck) {
			if (!firstWordArray.contains(num_list)) {
				firstWordArray.add(num_list);
			}
		}

		for (String num_list1 : secondWordCheck) {
			if (!secondWordArray.contains(num_list1)) {
				secondWordArray.add(num_list1);
			}
		}

		for (int i = 0; i < firstWordArray.size(); i++) {
			for (int j = 0; j < secondWordArray.size(); j++) {
				if (firstWordArray.get(i).equals(secondWordArray.get(j))) {
					cnt++;
				}
			}
		}

		System.out.println("1 : " + firstWordCheck.length);
		System.out.println("2 : " + secondWordCheck.length);
		System.out.println("3 : " + cnt);
	}
}
