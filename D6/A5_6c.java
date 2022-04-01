package Main;

import java.util.Scanner;

public class A5_6c {
	public static float inputNum = 0, result = 0;
	public static int firstUnit = 0, secondUnit = 0;

	public static void menu() {
		System.out.println("# Unit");
		System.out.println("1. cm\n2. m\n3. mm\n4. km\n5. mile");
		System.out.println("Input two unit");
	}

	public static void selectUnit() {
		Scanner sc = new Scanner(System.in);
		firstUnit = sc.nextInt();
		secondUnit = sc.nextInt();
	}

	public static void selectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		inputNum = sc.nextInt();
	}

	public static void calUnit() {
		if (firstUnit == 1) {
			cm(secondUnit);
		} else if (firstUnit == 2) {
			m(secondUnit);
		} else if (firstUnit == 3) {
			mm(secondUnit);
		} else if (firstUnit == 4) {
			km(secondUnit);
		} else if (firstUnit == 5) {
			mile(secondUnit);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void cm(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum;
		} else if (secondUnit == 2) {
			result = inputNum / 100;
		} else if (secondUnit == 3) {
			result = inputNum * 10;
		} else if (secondUnit == 4) {
			result = inputNum / 100000;
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 6.2137);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void m(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum * 100;
		} else if (secondUnit == 2) {
			result = inputNum;
		} else if (secondUnit == 3) {
			result = inputNum * 1000;
		} else if (secondUnit == 4) {
			result = inputNum / 1000;
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 0.000621);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void mm(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum / 10;
		} else if (secondUnit == 2) {
			result = inputNum / 1000;
		} else if (secondUnit == 3) {
			result = inputNum;
		} else if (secondUnit == 4) {
			result = (float) (inputNum * 1e-6);
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 6.2137);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void km(int secondUnit) {
		if (secondUnit == 1) {
			result = inputNum * 100000;
		} else if (secondUnit == 2) {
			result = inputNum * 1000;
		} else if (secondUnit == 3) {
			result = inputNum * 1000000;
		} else if (secondUnit == 4) {
			result = inputNum;
		} else if (secondUnit == 5) {
			result = (float) (inputNum * 0.621371);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void mile(int secondUnit) {
		if (secondUnit == 1) {
			result = (float) (inputNum * 1690934.4);
		} else if (secondUnit == 2) {
			result = (float) (inputNum * 1609.344);
		} else if (secondUnit == 3) {
			result = inputNum * 1609344;
		} else if (secondUnit == 4) {
			result = (float) (inputNum * 1.609344);
		} else if (secondUnit == 5) {
			result = inputNum;
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void print() {
		System.out.println(result);
	}

}