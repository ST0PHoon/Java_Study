package hello;

import java.util.Scanner;

public class P12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float out = 0;
		
		System.out.println("#Temperature Converter");
		System.out.println("1.C -> F");
		System.out.println("2.F -> C");
		
		System.out.println("Selet case");
		int temCon = sc.nextInt();
		System.out.println("How much");
		float  curTem = sc.nextInt();
		
		if (temCon == 1) {
			out = (curTem * 9 / 5) + 32;
			System.out.println(out + "F");
		} else if (temCon == 2) {
			out = (curTem - 32) * 5 / 9;
			System.out.println(out + "C");
		} else {
			System.out.println("Choose 1 or 2");
		}
		
	}

}
