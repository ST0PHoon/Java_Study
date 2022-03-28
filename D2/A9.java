package hello;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), cnt = 0;

		if (N < 2) {
			System.out.println("error");
		} else {
			for (int i = 2; i < N + 1; i++) {
				if (i == 2) {
					System.out.println(2);
				} else {
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							cnt++;
						}
					}

					if (cnt == 0) {
						System.out.println(i);
					} else {
						cnt = 0;
					}
				}

			}
		}
	}

}
