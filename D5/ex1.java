package Main;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// 입력 5!, 출력 5x4x3x2x1 = 120
		Scanner sc = new Scanner(System.in);
		int cut = 0, number = 0;
		String text = sc.next();
		String[] textArr = text.split("");
		
		for (int i = 0; i < text.length(); i++) {
			if(textArr[i].equals("!")) {
				cut = text.lastIndexOf(textArr[i]);
				number =  Integer.parseInt(text.substring(0, cut));
			}
		}
		
		int output = multy(number);
		
		for (int i = number; i > 1; i--) {
			System.out.print(i + "X");
		}
		
		System.out.println("1 = " + output);
	}
	
	public static int multy(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * multy(--num);
		}
	}

}
