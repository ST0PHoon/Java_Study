package Main;

import java.util.Scanner;

public class A3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n > 9 || n < 2) {
			System.out.println("input error");
		} else {
			gogodan(n, 2);
		}
		
	}

	public static void gogodan(int number, int k) {
		if (k < 10) {
			System.out.println(number + " X " + k + " = " + k * number);
			k++;
			gogodan(number, k);
		}
	}
}
