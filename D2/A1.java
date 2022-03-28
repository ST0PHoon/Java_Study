package hello;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("What number do you want?");

		int n = sc.nextInt();
		if (n > 9 || n < 2) {
			System.out.println("error : Choose 2 to 9");
		} else {
			for (int i = 2; i < 10; i++) {
				if (n == i) {
					for (int j = 2; j < 10; j++) {
						System.out.println(n + " x " + j + " = " + j * n);
					}
				}
			}
		}
	}
}
