package Main;

import java.util.Scanner;

public class A1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int r = n - m;
		
		int N = multiply1(n);
		int R = multiply1(r);
		
		System.out.println(N/R);
	}
	
	public static int multiply1(int num1) {
		if (num1 == 1) {
			return  1;
		} else {
			return num1 * multiply1(--num1);
		}
	}
	

}
