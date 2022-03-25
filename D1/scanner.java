package hello;

import java.util.Scanner; //기본적으로 import 문 필요

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner 객체
		
		String name, address;
		int age;
		float weight;
		
		name = scan.next(); // 문자열 : scan.next
		age = scan.nextInt(); //int : scan.nextInt
		weight = scan.nextFloat(); //float : scan.nextFloat
		
		/* 이외에도
		 * byte, short, long, double 등이 있다.
		 * 
		 * String을 받는 것에는 scan.next말고 scan.nextLine이 있는데
		 * 이는 줄바꿈을 추가한 명령어다.
		 * 
		 * boolean은 scan.hasNext()를 사용한다. ctrl+z로 입력을 끝낼 수 있다.
		 * 
		 * void close()로도 scan을 종료할 수 있다.
		 */
	}
	
}
