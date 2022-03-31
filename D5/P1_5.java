package Main;

import java.util.Scanner;

public class P1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		P1_5 main = new P1_5();

		main.namePrint();

		int n = sc.nextInt();

		main.addition(n);
	}

	public void namePrint() {
		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter\n");
		System.out.println("Select number");
	}

	public void addition(int familyMember) {
		if (familyMember == 1) {
			System.out.println("Dad");
		} else if (familyMember == 2) {
			System.out.println("Mom");
		} else if (familyMember == 3) {
			System.out.println("Na");
		} else if (familyMember == 4) {
			System.out.println("Nuna");
		} else {
			System.out.println("error");
		}
	}

}
