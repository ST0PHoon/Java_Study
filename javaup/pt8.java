package bills;

public class pt8 {

	public static void main(String[] args) {
		// 문자열 배열 k37_item 선언
		String[] k37_item = { "눈을감자", "엄마손파이", "화이트하임", "포테토칩", "오징어집" };
		int[] k37_price = { 1800, 25000, 2600, 1500, 1000 }; // 정수형 배열 k37_price 선언
		int[] k37_amount = { 2, 1, 1, 3, 2 }; // 정수형 배열 k37_amount 선언
		double k37_taxRate = 0.1; // 실수형 변수 k37_taxRate 선언
		int k37_totalSum = 0; // 정수형 변수 k37_totalSum 선언 및 초기값 입력

		System.out.printf("*****************************************\n");
		System.out.printf("             영     수    증          \n");
		System.out.printf("항 목\t\t 단 가\t수량\t   합 계\n");

		// k37_item의 길이만큼 도는 for문 선언
		for (int k37_i = 0; k37_i < k37_item.length; k37_i++) {
			int k37_sum = k37_price[k37_i] * k37_amount[k37_i]; // 정수형 변수 k37_sum에 가격과 수량을 곱한 값 추가
			k37_totalSum = k37_totalSum + k37_sum; // k37_totalSum에 k37_sum 누적해서 최종 가격 입력
			// 배열에 있는 상품, 가격, 수량과 계산한 합계를 출력형식에 맞추서 출력해준다.
			System.out.printf("%s\t%6d\t%3d\t%8d\n", k37_item[k37_i], k37_price[k37_i], k37_amount[k37_i], k37_sum);
		}
		System.out.printf("******************************************\n");
		System.out.printf("지불금액 :  %28d\n", k37_totalSum);	//지불액 총 합계를 출력한다.

		// 정수형 변수 k37_totalNetPrice 에 세전가격 입력
		int k37_totalNetPrice = (int) (k37_totalSum / (1 + k37_taxRate));
		System.out.printf("과세금액 :  %28d\n", k37_totalNetPrice);

		// 정수형 변수 k37_tax에 총 가격 - 세전가격 을 입력
		int k37_tax = k37_totalSum - k37_totalNetPrice;
		System.out.printf("세    금 :  %28d\n", k37_tax);
	}

}
