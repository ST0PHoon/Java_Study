package Main;

import java.util.Scanner;

public class P5_5 {

	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P5_5 main = new P5_5();

		main.inputNum();

		main.calPrint(i);
		
	}

	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select number 2 to 9");
		i = sc.nextInt();
	}

	public void calPrint(int n) {
		if (n < 2 || n > 9) {
			System.out.println("input error");
		} else {
			for (int k = 1; k < 10; k++) {
				System.out.println(n + " x " + k + " = " + n * k);
			}
		}
	}

}
