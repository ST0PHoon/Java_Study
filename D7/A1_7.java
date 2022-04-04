package Main;

import java.util.Scanner;

public class A1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input sentense");
		String stn = sc.nextLine();

		System.out.println("input one char");
		String alp = sc.nextLine();

		String[] stnArr = stn.split("");

		for (int i = 0; i < stnArr.length; i++) {
			if (stnArr[i].equals(alp)) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
