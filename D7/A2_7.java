package Main;

import java.util.Scanner;

public class A2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		int currentNumber, inputNumberOneDigit, numLength;
		System.out.println("input number 0 ot 9");
		int digit = sc.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			currentNumber = numbers[i];
			numLength = (int) (Math.log10(numbers[i]) + 1);

			for (int j = 0; j < numLength; j++) {
				inputNumberOneDigit = currentNumber % 10;
				currentNumber /= 10;

				if (inputNumberOneDigit == digit) {
					System.out.print(numbers[i] + " ");
				}

			}

		}

	}

}
