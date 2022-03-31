package Main;

import java.util.Scanner;

public class A4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result;
		int i = sc.nextInt();
		
		for (int k = 1; k <= i; k++) {
			result = FibonacciSq(k);
			System.out.print(result + " ");
		}
		
	}

	public static int FibonacciSq(int f) {
		int fbArr = 0;
		if (f == 1) {
			fbArr = 0;
			return fbArr;
		} else if (f == 2) {
			fbArr = 1;
			return fbArr;
		} else {
			fbArr = FibonacciSq(f-1) + FibonacciSq(f-2);
			return fbArr;
		}
	}
}
