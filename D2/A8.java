package hello;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N, M, result = 1;
		N = sc.nextInt();
		M = sc.nextInt();

		if (M == N) {
			result = M;
		} else if (M > N) {
			for (int i = N; i > 1; i--) {
				if (M % i == 0 && N % i == 0) {
					result = i;
					break;
				}
			}
		} else {
			for (int i = M; i > 1; i--) {
				if (M % i == 0 && N % i == 0) {
					result = i;
					break;
				}
			}
		}

		System.out.println(result);
	}

}
