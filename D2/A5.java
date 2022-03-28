package hello;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String star = "*";
		String space = " ";
		
		for (int i = 0, j = N*2-1; i < N; i++, j -=2) {
			System.out.print(space.repeat(i));
			System.out.println(star.repeat(j));
		}
	}

}