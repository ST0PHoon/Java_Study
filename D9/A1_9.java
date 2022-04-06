package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class A1_9 {

	public static void main(String[] args) {
		fbnc();

	}

	public static void fbnc() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("input number");
		int n = sc.nextInt();

		if (n < 1) {
			System.out.println("input error");
		} else {
			list.add(0);

			if (n >= 2) {
				list.add(1);
				for (int i = 0; i < n - 2; i++) {
					list.add(list.get(i) + list.get(i + 1));
				}
			}
			System.out.println(list);
		}

	}

}
