package hello;

import java.util.Scanner;

public class name_age {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String name;
		int age;
		
		System.out.println("Please input name");
		name = scan.next();
		System.out.println("name is "+name);
		
		System.out.println("Please input age");
		age = scan.nextInt();
		System.out.println("name is "+age);
	}

}
