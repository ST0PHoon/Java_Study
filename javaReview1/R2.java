package javaReview1;

import java.util.Arrays;
import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("input double number (m/s)");
		double a = sc.nextDouble();
		System.out.println("input double number (km/h)");
		double b = sc.nextDouble();
		System.out.println("input double number (m/ms)");
		double c = sc.nextDouble();
		double result = 0;
		String units;
		
		if (a * 3.6 >= b) {
			if (a * 3.6 >= c * 3600 ) {
				result = a * 3.6;
				units = "m/s";
			} else {
				result = c * 3600;
				units = "m/ms";
			}
		} else {
			if (b >= c * 3600 ) {
				result = b;
				units = "km/h";
			} else {
				result = c * 3600;
				units = "m/ms";
			}
		}

		System.out.println(result + units);

		
	}

}
