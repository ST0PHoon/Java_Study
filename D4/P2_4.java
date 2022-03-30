package hello;

import java.util.Scanner;

public class P2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("Balance : " + total);
			System.out.println("Choose 1 or 2");
			int plusminus = sc.nextInt();
			System.out.println("How much");
			int money = sc.nextInt();
			
			if (plusminus == 1) {
				total += money;
			} else if (plusminus == 2) {
				total -= money;
			} else {
				break;
			}
			
			if (total < 0) {
				System.out.println("need more money");
				total += money;
				continue;
			}
		}
		
	}

}
