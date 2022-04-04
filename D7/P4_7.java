package Main;

import java.util.Arrays;

public class P4_7 {

	public static void main(String[] args) {
		int[] numberArr = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		int[] numberArrrRe = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		int temp = 0;
		
		for (int i = 0; i < numberArr.length - 1; i++) {
			for (int j = 1 + i; j < numberArr.length; j++) {
				if (numberArr[i] > numberArr[j]) {
					temp = numberArr[i];
					numberArr[i] = numberArr[j];
					numberArr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(numberArr));
		
		for (int i = 0; i < numberArrrRe.length - 1; i++) {
			for (int j = 1 + i; j < numberArrrRe.length; j++) {
				if (numberArrrRe[i] < numberArrrRe[j]) {
					temp = numberArrrRe[i];
					numberArrrRe[i] = numberArrrRe[j];
					numberArrrRe[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(numberArrrRe));

	}

}
