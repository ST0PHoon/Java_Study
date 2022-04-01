package Main;

import java.util.Scanner;

public class mbA2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number ->");
		int num1 = sc.nextInt();
		double sum = 0;
		for (int i = num1; i > 0; i--) {
			System.out.println(i);
			sum += i;
		}
		
		double avg = sum / num1;
		double sumDis = 0;
		
		for (int i = 1; i < num1 + 1; i++) {
			sumDis += Math.pow((i -avg ),2);
		}
		
		double var = sumDis / num1;
		
		double std = Math.sqrt(var);
		
		System.out.println(std);
	}
}