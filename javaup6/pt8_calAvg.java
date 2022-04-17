package javajump6;

public class pt8_calAvg {
	// 11pg 메소드 오버로딩
	
	//3개의 정수형 매개변수를 받아 평균을 구하는 메소드 선언, 더블형 리턴
	public static double k37_sumAvg(int k37_a, int k37_b, int k37_c) {	
		return (k37_a + k37_b + k37_c) / 3.0;
	}

	//4개의 정수형 매개변수를 받아 평균을 구하는 메소드 선언, 더블형 리턴
	public static double k37_sumAvg(int k37_a, int k37_b, int k37_c, int k37_d) {	
		return (k37_a + k37_b + k37_c + k37_d) / 4.0;
	}

	//5개의 정수형 매개변수를 받아 평균을 구하는 메소드 선언, 더블형 리턴
	public static double k37_sumAvg(int k37_a, int k37_b, int k37_c, int k37_d, int k37_e) {
		return (k37_a+ k37_b + k37_c + k37_d + k37_e)/5.0;
	}
	
	//3개의 정수형 매개변수를 받아 합을 구하는 메소드 선언, 정수형 리턴
	public static int k37_sum(int k37_a, int k37_b, int k37_c) {	
		return (k37_a + k37_b + k37_c) ;
	}

	// 4개의 정수형 매개변수를 받아 합을 구하는 메소드 선언, 정수형 리턴
	public static int k37_sum(int k37_a, int k37_b, int k37_c, int k37_d) {
		return (k37_a + k37_b + k37_c + k37_d) ;
	}

	// 5개의 정수형 매개변수를 받아 합을 구하는 메소드 선언, 정수형 리턴
	public static int k37_sum(int k37_a, int k37_b, int k37_c, int k37_d, int k37_e) {
		return (k37_a+ k37_b + k37_c + k37_d + k37_e);
	}
}

