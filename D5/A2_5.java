package Main;

import java.util.Scanner;

public class A2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int r = n - m;

		int N = multiply1(n);
		int R = multiply2(r);
		int M = multiply3(m);

		System.out.println(N / (R * M));
	}

	public static int multiply1(int num1) {
		if (num1 == 1) {
			return 1;
		} else {
			return num1 * multiply1(--num1);
		}
	}

	public static int multiply2(int num2) {
		if (num2 == 1) {
			return 1;
		} else {
			return num2 * multiply2(--num2);
		}
	}
	
	public static int multiply3(int num3) {
		if (num3 == 1) {
			return 1;
		} else {
			return num3 * multiply2(--num3);
		}
	}

}