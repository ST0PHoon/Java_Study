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
		int R = multiply1(r);
		int M = multiply1(m);

		System.out.print("C(" + n + ", " + m + ")=" + n + "!/(" + n + "-" + m + ")!/" + m + "!=(" + n);
		for (int i = n - 1; i > 0; i--) {
			System.out.print("X" + i);
		}
		System.out.print(")/(" + r);
		for (int i = r - 1; i > 0; i--) {
			System.out.print("X" + i);
		}
		System.out.print(")/(" + m);
		for (int i = m - 1; i > 0; i--) {
			System.out.print("X" + i);
		}
		System.out.print(") = " + N + "/" + R + "/" + M + "=" + (N / (R * M)));

	}

	public static int multiply1(int num1) {
		if (num1 == 1) {
			return 1;
		} else {
			return num1 * multiply1(--num1);
		}
	}

}