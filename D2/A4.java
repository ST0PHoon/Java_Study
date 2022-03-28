package hello;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String star = "*";
		String space = " ";
		
		for (int i = (N-1), j = 1; i > -1; i--, j +=2) {
			System.out.print(space.repeat(i));
			System.out.println(star.repeat(j));
		}
	}

}