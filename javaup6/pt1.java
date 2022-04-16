package javajump6;

public class pt1 {

	public static void main(String[] args) {
		// 4pg 변수와 메서드(1)
		pt1.k37_iamMethod();	//클래스명.메소드이름()
		
		k37_iamMethod();		//매소드이름, 주로 클래스명을 생략하고 쓴다.
	}
	
	public static void k37_iamMethod() {	// public 모든 접근 허용, static 전역 메소드, void 리턴 없음 의 메소드 생성
		System.out.println("메소드라 불러줘요~~\n");	//메세지 출력
	}

}
