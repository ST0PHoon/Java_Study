package Main;

import java.util.Scanner;

public class P7_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input string");
		String stn = sc.nextLine();
		String[] stnArr = stn.split("");

		for (int i = 0; i < stnArr.length; i++) {
			char n = (char) (219- stnArr[i].charAt(0)); 
			System.out.print(n);
		}

	}

}
