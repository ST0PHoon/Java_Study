package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mbA1_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<String> result = new ArrayList<String>();

		list.add("Mike 89");
		list.add("Jay 88");
		list.add("Kim 92");
		list.add("Lee 85");
		list.add("Park 90");

		for (int i = 0; i < list.size(); i++) {
			numberList.add(Integer.parseInt(list.get(i).substring(list.get(i).length() - 2)));
		}

		Collections.sort(numberList);
		
		System.out.println(numberList);

		for (int i = 4; i > -1; i--) {
			for (int j = 0; j < 5; j++) {
				if (list.get(j).contains( Integer.toString(numberList.get(i)))) {
					result.add(list.get(j).substring(0, list.get(j).length() - 3));
				}
			}
		}
		System.out.println(result);

	}

}
