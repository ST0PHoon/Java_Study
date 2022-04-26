package javaReview2;

import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 0s or 1s size 4 (ex 1000)");
		String first = sc.nextLine();
		
		System.out.println("input 0s or 1s size 4 (ex 1000)");
		String second= sc.nextLine();
		
		System.out.println("input 0s or 1s size 4 (ex 1000)");
		String third= sc.nextLine();

		String[] arr = {first, second, third};
		
		int[] resultarr = new int[4];
		
		String result = "";
		
		int cnt = 0;
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].substring(j,j+1).equals("0")) {
					resultarr[j] = resultarr[j] + 1;
					cnt++;
				}
			}
			
			if (cnt == 4) {
				result = "Pass";
			}

			cnt = 0;
		}
		
		if (!result.equals("Pass")) {
			for(int i = 0; i < 4; i++) {
				if (resultarr[i] == 3) {
					result = "Pass";
					break;
				} else if (resultarr[i] != 4) {
					result = "Fail";
				};
			}
		}
		
		System.out.println(result);
	}

}
