package hello;

import java.util.Scanner;

public class A1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1, mean=0, max=0, min=0;
		
		while(true) {
			System.out.println("Enter number");
			int input = sc.nextInt();
			
			//���
			mean += input;
			if (cnt == 1) {
				max = input;
				min = input;
			} else {
				if (input > max) {
					max = input;
				}
				if (min > input) {
					min = input;
				}
			}
			
			//���
			System.out.println("Result: " + cnt + " - " + "Mean " + mean/cnt + ", Max " + max + ", Min " + min);
			System.out.printf("\n");
			cnt++;
		}
	}

}
