package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		List<String> list = Arrays.asList(text.split(" "));
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
	}

}
