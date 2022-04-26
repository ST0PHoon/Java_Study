package javaReview1;

import java.util.Arrays;
import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int [] Arr = new int [52];
		int [] Arr2 = new int [52];
		
		System.out.println("input string");
		String a = sc.nextLine();
		System.out.println("input compare string");
		String b = sc.nextLine();
		
		char[] arr = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		if (arr.length == arr2.length) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] != arr2[i]) {
					cnt++;
				}
			}
		} 
		
		if(cnt == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}


}
