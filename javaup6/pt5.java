package javajump6;

public class pt5 {
	// 8pg 클래스, 객체, 인스턴스(2)
	private static int k37_inVal;	//private(같은 클래스에서만 사용) 등급의 static 정수형 변수 선언
	public static void up() {	//public 등급의 static 함수 선언, 리턴값 없음
		k37_inVal++;	// 해당 변수의 값을 1 증가
		System.out.printf("나는 그냥 메소드[%d]\n",k37_inVal);	// 포멧에 맞춰서 메세지 출력
	}
	
	public static void main(String[] args) {
		k37_inVal = 0;	//해당 변수에 0 입력
		pt4 elev;	//pt4클래스를 elev로 선언
		
		elev = new pt4();	//elev에 pt4클래스 입력
		
		up();	//위에 선언한 up 메소드 실행
		for(int i = 0; i < 10; i++) {	//0부터 1씩증가하며 9까지 도는 for문 작성
			elev.k37_up();	// pt4에 있는 k37_up() 메소드 실행
			// pt4의 k37_help 문자열 변수를 포멧에 맞춰 출력
			System.out.printf("MSG[%s]\n",elev.k37_help);	
		}
		
		for(int i = 0; i < 10; i++) {	//0부터 1씩증가하며 9까지 도는 for문 작성
			elev.k37_down();	// pt4에 있는 k37_down() 메소드 실행
			// pt4의 k37_help 문자열 변수를 포멧에 맞춰 출력
			System.out.printf("MSG[%s]\n",elev.k37_help);
		}

	}

}
