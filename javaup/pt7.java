package bills;

public class pt7 {

	public static void main(String[] args) {
		int k37_price = 1234; // k37_price 정수형 변수 선언
		double k37_taxRate = 0.1; // k37_taxRate 실수형 변수 선언
		
		int k37_netprice = netprice(k37_price, k37_taxRate); // k37_netprice 정수형 변수 선언, 함수 리턴값 입력
		int k37_tax = k37_price - k37_netprice;  // k37_tax 정수형 변수 선언, price - netprice 계산
		
		System.out.printf("********************************************\n");
		System.out.printf("*       소비자가, 세전가격, 세금 계산      *\n");
		// 형식에 맞춰서 price, netprice, tax 형식에 맞춰서 출력
		System.out.printf(" 소비자가격: %d, 세전가격: %d, 세금: %d\n", k37_price, k37_netprice, k37_tax); 
		System.out.printf("*********************************************\n");

	}

	//netprice 메소드 선언 및 받아오는 정수,실수 선언 및 리턴형태로 제작
	public static int netprice(int k37_price, double k37_rate) {
		return (int)(k37_price/(1+k37_rate));	//세전가격 계산을 정수형으로 리턴
	}

}
