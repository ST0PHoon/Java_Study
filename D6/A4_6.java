package Main;

import java.util.Arrays;
import java.util.Scanner;

public class A4_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many number");
		int arrNumber = sc.nextInt();

		float[] numberArr = new float[arrNumber];

		for (int i = 0; i < arrNumber; i++) {
			numberArr[i] = sc.nextFloat();
		}

		System.out.println(Arrays.toString(numberArr));
		System.out.println("Pick a number from the list");
		float sNumber = sc.nextFloat();

		float near = 0;
		float min = Float.MAX_VALUE;

		for (int i = 0; i < arrNumber; i++) {
			float differ = Math.abs(numberArr[i] - sNumber);
			if (min > differ) {
				if (differ == 0) {
					continue;
				} else {
					min = differ;

					near = numberArr[i];
				}
			}
		}

		System.out.println(near);

	}

}
