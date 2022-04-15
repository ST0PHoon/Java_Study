package bills;

//java 내장함수를 쓰기위한 import 선언
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class bill1 {

	public static void main(String[] args) {
		// 단순환전계산 18pg
		int k37_myWon = 1000000; // k37_myWon 정수형 변수 선언 및 100만원 환전
		double k37_moneyEx = 1238.21; // k37_moneyEx 실수형 변수 선언 환율 1238.21
		double k37_commission = 0.003; // k37_commission 실수형 변수 선언 환전수수료 0.3퍼센트

		int k37_usd = (int) (k37_myWon / k37_moneyEx); // 정수형 변수 선언, 100만원 환율로 나눠 금액 계산 (절삭)
		int k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx); // 정수형 변수 선언, 환전 후 잔돈 계산

		System.out.printf("*************************************************\n");
		System.out.printf("*                수수료 없이 계산               *\n");
		// 포맷에 맞춰서 받은 환전금액, 달러, 거스름돈 출력
		System.out.printf("총 한화환전금액: %d원 => %d달러, 잔돈: %d\n", k37_myWon, k37_usd, k37_remain);

		System.out.printf("*************************************************\n");

		// 수수료 포함 환전 계산(1) 19pg
		double k37_comPerOne = k37_moneyEx * k37_commission; // 달러당 수수료, 실수형이기 때문에 소수점 아래까지 나온다.

		double k37_totalCom = k37_usd * k37_comPerOne; // 총 수수료 계산, 실수형이기 때문에 소수점 아래까지 나온다.

		System.out.printf("*********************************************************************\n");
		System.out.printf("*                            수수료 계산                            *\n");
		// 포맷에 맞춰서 총 수수료, 달러, 달러당 수수료 출력, %d는 정수형, %f는 실수형
		System.out.printf("총 수수료: %f원 => 미화: %d달러, 달러당 수수료: %f원\n", k37_totalCom, k37_usd, k37_comPerOne);

		System.out.printf("*********************************************************************\n");

		// 수수료 포함 환전 계산(2) 20pg
		int k37_i_totalCom; // 정수형 변수 선언
		
		// 정수형과 실수형이 같지않으면 올림처리하는 if문 작성
		if (k37_totalCom != (double) ((int) k37_totalCom)) {
			k37_i_totalCom = (int) k37_totalCom + 1;
		} else {
			k37_i_totalCom = (int) k37_totalCom;
		}

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                  수수료 적용환전                              *\n");
		// 포맷에 맞춰서 총 수수료, 달러, 달러당 수수료 출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k37_i_totalCom, k37_usd, k37_comPerOne);

		k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx - k37_i_totalCom);	//잔돈 출력 k37_remain에 입력
		// 포맷에 맞춰서 총 한화환전금액, 달러, 수수료징구, 잔돈 출력
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징구: %d원,  잔돈: %d원\n", k37_myWon, k37_usd, k37_i_totalCom,
				k37_remain);

		System.out.printf("*********************************************************************************\n");

		// 수수료 포함 환전 계산 (3) 21pg
		// 정수형 변수 선언, 100만원 환율로 나눠 금액 계산, 달러당 수수료 포함한 계산이다.(절삭)
		k37_usd = (int) (k37_myWon / (k37_moneyEx + k37_comPerOne)); 
		k37_totalCom = k37_usd * k37_comPerOne;  // 총 수수료 계산
		
		// 정수형과 실수형이 같지않으면 올림처리하는 if문 작성
		if (k37_totalCom != (double) ((int) k37_totalCom)) {
			k37_i_totalCom = (int) k37_totalCom + 1;
		} else {
			k37_i_totalCom = (int) k37_totalCom;
		}

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                            (정확)수수료 적용환전                              *\n");
		// 포맷에 맞춰서 총 수수료, 달러, 달러당 수수료 출력
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n", k37_i_totalCom, k37_usd, k37_comPerOne);

		k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx - k37_i_totalCom);	//잔돈 출력 k37_remain에 입력
		// 포맷에 맞춰서 총 한화환전금액, 달러, 수수료징구, 잔돈 출력
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징구: %d원,  잔돈: %d원\n", k37_myWon, k37_usd, k37_i_totalCom,
				k37_remain);

		System.out.printf("*********************************************************************************\n");

		
		
		
		// 콤마찍기 22pg
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###");	//DeciamlFormat을 통해 틀어온 수를 설정해둔 양식에 맞게 출력하는 틀 작성

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                              콤마찍기, 날짜 적용                              *\n");
		// 포맷에 맞춰서 총 수수료, 달러, 달러당 수수료 출력, DeciamlFormat에 맞춰서 값 출력
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", k37_df.format(k37_i_totalCom), k37_df.format(k37_usd),
				k37_comPerOne);

		k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx - k37_i_totalCom);	//잔돈 출력 k37_remain에 입력
		// 포맷에 맞춰서 총 한화환전금액, 달러, 수수료징구, 잔돈 출력
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료징구: %s원, 잔돈: %s원\n", k37_df.format(k37_myWon), k37_df.format(k37_usd),
				k37_df.format(k37_i_totalCom), k37_df.format(k37_remain));
		
		Calendar k37_calt = Calendar.getInstance();	// 내장되어있는 Calendar를 사용해서 현재시간, 날짜 불러오기
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //SimpleDateFormat을 통해 4자리 연도/2자리 월/ 2자리 일  시간:분:초 형태로 날짜 데이터 출력틀 만들기
		System.out.printf("최종실행시간: %s\n", k37_sdt.format(k37_calt.getTime()));	//받아온 시간데이터를 SimpleDateFormat으로 만든 포멧에 맞게 출력하기
		
		System.out.printf("*********************************************************************************\n");
	}

}
