package bills;

public class pt6 {

	public static void main(String[] args) {
		int k37_val = 271;	//k37_val 변수명의 정수형 변수 선언 후, 271 입력
		int k37_rate = 3;	//k37_rate 변수명의 정수형 변수 선언 후, 3 입력

		int k37_tax = taxcal(k37_val, k37_rate);	//정수형 변수 k37_tax에 함수명 taxcal의 리턴 값 입력, 함수는 k37_val, k37_rate를 받는다.

		System.out.printf("*************************************\n");
		System.out.printf("*          단순 세금 계산           *\n");
		System.out.printf("실제 세금 계산: %f\n", k37_val * k37_rate / 100.0);	//실제 세금 계산, 실수형으로 입력하기 위해, 100.0로 계산

		// 세전가격, 세금, 세포함 가격을 포멧에 맞게 출력(정수형)
		System.out.printf("세전가격: %d 세금: %d 세포함가격: %d\n", k37_val, k37_tax, k37_val + k37_tax);

		System.out.printf("**************************************");
	}
	//public static 함수 선언, 정수형태의 변수 2개를 받아오고 정수형 값을 리턴한다.
	public static int taxcal(int k37_val, int k37_rate) {
		int ret;	//정수형 변수 ret 선언
		//val 과 rate를 실수형으로 계산한 값과 정수형으로 계산한 값이 동일(나머지가 없으면)하지 않으면 올림 처리하는 if문
		if ((double) k37_val * (double) k37_rate / 100.0 == k37_val * k37_rate / 100) {
			ret = k37_val * k37_rate / 100;
		} else {
			ret = k37_val * k37_rate / 100 + 1;
		}
		// 결괏값 ret을 리턴해주는 함수
		return ret;
	}
}
