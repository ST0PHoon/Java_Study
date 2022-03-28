package hello;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N, M, numBank = 1, result;
		N = sc.nextInt();
		M = sc.nextInt();

		if (M == N) {
			result = M;
		} else if (M > N) {
			for (int i = N; i > 1; i--) {
				if (N % i == 0 && M % i == 0) {
					N /= i;
					M /= i;
					numBank *= i;
				}
			}
		} else {
			for (int i = M; i > 1; i--) {
				if (N % i == 0 && M % i == 0) {
					N /= i;
					M /= i;
					numBank *= i;
				}
			}
		}

		result = numBank * N * M;

		System.out.println(result);
	}

}
