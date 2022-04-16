package javajump6;

public class pt7 {

	public static void main(String[] args) {
		// 10pg 메소드 오버로딩
		pt7_cal k37_cal = new pt7_cal();	//같은 package에 있는 pt7_cal 클래스 선언
		//sum(int k37_a, int k37_b) 사용
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k37_cal.k37_sum(1, 2));
		//sum(int k37_a, int k37_b, int k37_c) 사용
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k37_cal.k37_sum(1, 2, 3));
		//sum(int k37_a, int k37_b, int k37_c, int k37_d) 사용
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k37_cal.k37_sum(1, 2, 3, 4));
		//sum(double k37_a, double k37_b) 사용
		System.out.printf("double형 덧셈이 호출됨. [%f]\n", k37_cal.k37_sum(1.3, 2.4));
		
	}

}
