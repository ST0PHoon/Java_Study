package hello;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("What number do you want?");

		int n = sc.nextInt();
		int i = 0, j = 2, cnt = 2;

		switch (n) {
		case 2:
			while (i == 0) {
				while (j < 10) {
					System.out.println(2 + " x " + j + " = " + j * 2);
					j++;
				}
				i++;
			}
			break;
		case 3:
			while (i == 0) {
				while (j < 10) {
					System.out.println(3 + " x " + j + " = " + j * 3);
					j++;
				}
				i++;
			}
			break;
		case 4:
			while (i == 0) {
				while (j < 10) {
					System.out.println(4 + " x " + j + " = " + j * 4);
					j++;
				}
				i++;
			}
			break;
		case 5:
			while (i == 0) {
				while (j < 10) {
					System.out.println(5 + " x " + j + " = " + j * 5);
					j++;
				}
				i++;
			}
			break;
		case 6:
			while (i == 0) {
				while (j < 10) {
					System.out.println(6 + " x " + j + " = " + j * 6);
					j++;
				}
				i++;
			}
			break;
		case 7:
			while (i == 0) {
				while (j < 10) {
					System.out.println(7 + " x " + j + " = " + j * 7);
					j++;
				}
				i++;
			}
			break;
		case 8:
			while (i == 0) {
				while (j < 10) {
					System.out.println(8 + " x " + j + " = " + j * 8);
					j++;
				}
				i++;
			}
			break;
		case 9:
			while (i == 0) {
				while (j < 10) {
					System.out.println(9 + " x " + j + " = " + j * 9);
					j++;
				}
				i++;
			}
			break;
		default:
			System.out.println("Choose 2 to 9");
			break;
		}
	}

}
