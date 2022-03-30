package hello;

import java.util.Scanner;

public class P3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input large number");
		int larnum = sc.nextInt();
		System.out.println("input small number");
		int smlnum = sc.nextInt();
		int cirnum = larnum / smlnum;
		int total = 0;

		if (smlnum > larnum) {
			System.out.println("input error");
		} else {
			for (int i = 1; i < cirnum + 1; i++) {
				total += smlnum * i;
			}

			System.out.print("SUM : " + total);

			for (int i = 1; i < cirnum + 1; i++) {
				if (i == 1) {
					System.out.print("(" + i * smlnum);
				} else if (i == cirnum) {
					System.out.print(", " + i * smlnum + ")");
				} else {
					System.out.print(", " + i * smlnum);
				}
			}
		}

	}

}
