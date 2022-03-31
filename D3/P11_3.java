package hello;

import java.util.Scanner;

public class P11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		float out = 0;

		System.out.println("#Current Converter");
		System.out.println("1.South Korean Won -> United States Dollar");
		System.out.println("2.United States Dollar -> South Korean Won");
		System.out.println("3.South Korean Won -> JPY En");

		System.out.println("Selet case");
		int moneycase = sc.nextInt();
		System.out.println("How much");
		float money = sc.nextInt();

		if (moneycase == 1) {
			out = (float) (money * 0.00082);
			System.out.println((out * 100) / 100 + "달러");
		} else if (moneycase == 2) {
			out = (int) (money * 1221.2);
			System.out.println(Math.round(out / 10) * 10 + "원");
		} else if (moneycase == 3) {
			out = (float) ((float) (money / 1000.0) * 101.25);
			System.out.println(Math.round(out) + "엔");
		} else {
			System.out.println("Inupt error");
		}

	}

}
