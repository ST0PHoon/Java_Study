package Main;

import java.util.Scanner;

public class A1_6 {
	public static int Main = 0, count = 0;
	public static int menu;
	public static String subject[] = new String[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMenu();

	}

	public static void printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("# Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		System.out.print("-> ");
		menu = sc.nextInt();
		if (menu == 1) {
			printList();
		} else if (menu == 2) {
			printMyCourse();
		} else {
			System.out.println("Wrong Number");
			printMenu();
		}
	}

	public static void printList() {
		Scanner sc = new Scanner(System.in);
		int list = -1;
		while (list != 0) {
			System.out.println("# Course List");
			System.out.println("1. Korean\n2. Math\n3. English\n4. Social Studies\n5. Science\n0. Back to Main");
			System.out.print("-> ");
			list = sc.nextInt();

			if (list == 1) {
				subject[count] = "Korean";
				System.out.println("\"Korean\" is registered.");
			} else if (list == 2) {
				subject[count] = "Math";
				System.out.println("\"Math\" is registered.");
			} else if (list == 3) {
				subject[count] = "English";
				System.out.println("\"English\" is registered.");
			} else if (list == 4) {
				subject[count] = "Social Studies";
				System.out.println("\"Social Studies\" is registered.");
			} else if (list == 5) {
				subject[count] = "Science";
				System.out.println("\"Science\" is registered.");
			} else if (list == 0) {
				printMenu();
			} else {
				System.out.println("Wrong Number");
			}
			count++;
		}
		printMenu();
	}

	public static void printMyCourse() {
		Scanner sc = new Scanner(System.in);

		for (int i = 1, j = 0; i <= count; i++, j++) {
			System.out.println(i + ". " + subject[j]);
		}
		System.out.println("-End-");
		int next = sc.nextInt();
		if (next == 0) {
			printMenu();
		} else {
			printMenu();
		}
	}
}