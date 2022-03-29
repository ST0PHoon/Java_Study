package hello;

import java.util.Scanner;

public class A2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pNum = 0, nNum=0, oNum=0, eNum=0;
		
		while(true) {
			System.out.println("Input number only int");
			int input = sc.nextInt();
			
			if (input == 0) {
				System.out.println("0Àº È¦¼öµµ Â¦¼öµµ ¾Æ´Õ´Ï´Ù.");
				continue;
			} else if (input > 0) {
				pNum++ ;
				if (input % 2 == 1) {
					oNum++;
				} else {
					eNum++;
				}
			} else {
				nNum++;
				input = Math.abs(input);
				if (input % 2 == 1) {
					oNum++;
					System.out.println(input % 2);
				} else {
					eNum++;
				}
			}
			
			//Ãâ·Â
			System.out.println("P - " + pNum  + ", N - " + nNum + ", O - " + oNum + ", E - " + eNum);
			System.out.printf("\n");
			
		}
	}

}
