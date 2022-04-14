package bills;

public class pt5 {

	public static void main(String[] args) {

		int k37_MyVal = 14 / 5; // k37_MyVal 정수형 변수에 14/5(2) 선언
		// 이값은 2.8 이다. 소수점 이하 버리면 2, 반올림하면 3이다.
		System.out.printf("#5-1 : %d\n", k37_MyVal);
		// 머리를 쓰면 저동을 실수형 (float, double 형태로 형변환) 계산을 한후 0.5를 더한다음 1 // 정수형 형변환을 하면
		// 반올림처리가 된다. 1 // 실수 (Real number) 가 뭔지 모르면 집에가든지, 몰래 초 중등 수학책 얼른 보고 오자
		
		double k37_MyValF; // k37_MyValF 실수형 변수
		k37_MyValF = 14 / 5; // k37_MyValF 실수형 변수에 14/5
		System.out.printf("#5-2 : %f\n", k37_MyValF); // k37_MyValF 출력
		
		// 소수형 연산
		k37_MyValF = 14.0 / 5; // 한개하도 실수형태의 표시를 해야 결과과 실수가 나온다.
		System.out.printf("#5-3 : %f\n", k37_MyValF); // k37_MyValF 출력
		
		k37_MyValF = (14.0) / 5 + 0.5; // 실수형 계산에서 0.5를 더해보자
		System.out.printf("#5-4 : %f\n", k37_MyValF); // k37_MyValF 출력
		
		k37_MyVal = (int) ((14.0) / 5 + 0.5); // 실수형 계산을 하고 정수형 형변환을 하자.
		System.out.printf("#5-5 : %d\n", k37_MyVal); // k37_MyVal 출력

	}

}
