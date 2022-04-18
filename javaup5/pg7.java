package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pg7 {

	public static void main(String[] args) {
		// pg7 
		DecimalFormat k37_df = new DecimalFormat("##,###");
		
		int k37_iPrice = 33000;
		double k37_taxrate = 0.1;
		int k37_nontaxPrice = (int) (k37_iPrice / (1+k37_taxrate)) + 1 ;
		int k37_tax=  k37_iPrice - k37_nontaxPrice;
		
		
		String k37_date = k37_dateTime();
		
		System.out.println("신용승인");
		System.out.println("단말기 : 2N68665898           전표번호 : 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주  소 : 경기 성남시 분당구 황새울로351번길 10");
		System.out.println("1층");
		System.out.println("대표자 : 유창신");
		System.out.println("사업자 : 752-53-00558            TEL  : 7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("금  액                               %s 원\n",k37_df.format(k37_nontaxPrice));
		System.out.printf("부가세                                %s 원\n",k37_df.format(k37_tax));
		System.out.printf("합  계                               %s 원\n",k37_df.format(k37_iPrice));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("우리카드");
		System.out.println("카드번호 : 5387-20**-****-4613(S)        일시불");
		System.out.printf("거래일시 : %s\n", k37_date);
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입 : 비씨카드사     가맹 : 720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL) 1544-4700");		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                * 감사합니다 *");
		System.out.println("                             표준V2.08_20200212");
	}
	
	public static String k37_dateTime() {
		Date nowDate = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String k37_date = simpleDateFormat.format(nowDate);
		
		return k37_date;
	}

	
	
}
