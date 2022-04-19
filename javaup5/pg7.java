package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pg7 {

	public static void main(String[] args) {
		// pg7 
		// 가격에 3번째마다 , 를 넣기위해서 DeciamlFormat인스턴스를 k37_df에 생성한다.
		DecimalFormat k37_df = new DecimalFormat("#,###,###");	//#은 숫자가 들어갈 공간이고, String으로 변환된다.
		
		int k37_iPrice = 33000;	//물건의 가격 입력
		double k37_taxrate = 0.1;	//물건의 세금비율 선택
		// 부가세 없는 금액 계산, 계산 후 (int)형으로 바꾸면 자동으로 소수점이 버려진다
		// 이 의미는 부가세에 자동으로 +1이 적용되는것을 의미한다.
		int k37_nontaxPrice = (int) (k37_iPrice * 10 / (1 + k37_taxrate))/10;	
		int k37_tax=  k37_iPrice - k37_nontaxPrice;	//합계 - 부가세 없는 금액 = 부가세 계산
		
		// 시간데이터를 포멧에 맞게 가져오는 메소드
		String k37_date = k37_dateTime();	//1995/04/18 23:22:53 식으로 출력
		
		System.out.println("신용승인");
		System.out.println("단말기 : 2N68665898           전표번호 : 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주  소 : 경기 성남시 분당구 황새울로351번길 10");
		System.out.println("1층");
		System.out.println("대표자 : 유창신");
		System.out.println("사업자 : 752-53-00558            TEL  : 7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		//금액 출력, 합계 / (1+세율), DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("금  액                              %8s 원\n",k37_df.format(k37_nontaxPrice));
		// 부가세 출력, 합계 - 금액, DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("부가세                              %8s 원\n",k37_df.format(k37_tax));
		// 합계, DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("합  계                              %8s 원\n",k37_df.format(k37_iPrice));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("우리카드");
		System.out.println("카드번호 : 5387-20**-****-4613(S)        일시불");
		// 거래일시 출력, 1995/04/18 23:22:53 식으로 출력
		System.out.printf("거래일시 : %s\n", k37_date);
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입 : 비씨카드사     가맹 : 720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL)1544-4700");		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                * 감사합니다 *");
		System.out.println("                             표준V2.08_20200212");
	}
	
	public static String k37_dateTime() {	// 날짜를 틀에 넣어주는 메소드
		// 오늘 날짜 데이터를 받아온다.
		Date nowDate = new Date();
		// 날짜 데이터를 원하는 형식으로 바꿀수있다. 1995/04/18 23:22:53 식으로 출력
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 날짜 데이터를 포멧에 맞게 바꾸고 String에 입력, SimpleDateFormat인스턴스를 사용하면 String으로 형변환 된다.
		String k37_date = simpleDateFormat.format(nowDate);
		// 결과 리턴
		return k37_date;
	}
	
}
