package Main;

import java.util.Scanner;

public class P1_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("input float array");
			String numbersOne = sc.nextLine();
			System.out.println("input float array");
			String numbersTwo = sc.nextLine();

			String[] numbersArrayOne = numbersOne.split(" ");
			String[] numbersArrayTwo = numbersTwo.split(" ");

			for (int i = 0; i < numbersArrayOne.length; i++) {
				for (int j = 0; j < numbersArrayTwo.length; j++) {
					if (Float.parseFloat(numbersArrayOne[i]) == Float.parseFloat(numbersArrayTwo[j])) {
						System.out.print(Float.parseFloat(numbersArrayOne[i]) + " ");
					}
				}
			}
			
			System.out.println("");
		}

	}

}
