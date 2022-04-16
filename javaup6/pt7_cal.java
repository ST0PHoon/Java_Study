package javajump6;

public class pt7_cal {
	//10pg 메소드 오버로딩, 받는 변수의 수나 종류가 다르면 같은 메소드 명을 사용할 수 있다.
	
	//처음 선언한 sum 메소드, 정수형 리턴, 정수형 2개의 변수 입력 받음
	public int k37_sum(int k37_a, int k37_b) {	
		return k37_a + k37_b;
	}
	
	//두번째 sum메소드, 정수형 리턴, 정수형 3개의 변수 입력 받음
	public int k37_sum(int k37_a, int k37_b, int k37_c) {	
		return k37_a + k37_b + k37_c;
	}
	
	//세번째 sum메소드, 정수형 리턴, 4개의 정수형 변수 입력 받음
	public int k37_sum(int k37_a, int k37_b, int k37_c, int k37_d) {	
		return k37_a + k37_b + k37_c + k37_d;
	}
	
	//네번째 sum메소드, 실수형 리턴, 실수형 변수 2개 입력 받음
	public double k37_sum(double k37_a, double k37_b) {
		return k37_a + k37_b;
	}
	
}
