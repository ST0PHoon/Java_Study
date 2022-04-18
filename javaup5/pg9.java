package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg9 {

	public static void main(String[] args) {
		//9
		String[] k37_itemname = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 100cm", "상투과자E", "더블링 나일론 낑깡 롤러", "해피홈 SAFE 핸드워시",
				"농심 신라면120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면 156g*4", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족D_WH", "프리미엄생연어초밥", "피코크 들깨미역국500g", "남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "상하유기농우유900", "트라피스트 유기 포도", "동원참치살코기100g*3", "오뚜기 오즈키친머쉬",
				"치킨스프카레 200g" };
		int[] k37_price = { 7500, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 4380, 8980, 5980, 5980, 2680 };
		int[] k37_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 };
		boolean[] k27_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, false };		
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		SimpleDateFormat k37_sdtB = new SimpleDateFormat("YYYYMMdd");
		Calendar k37_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		String k37_star= " ";		
		String k37_Date = k37_dateTime();
		double k37_taxRate = 0.1;	// 부가세율
		int k37_totalSum = 0; 		// k33_price(단가) * k33_amount(수량) 값
		int k37_totalTaxFreePrice = 0; // 면세 물품 합계
		int k37_totalNetPrice = 0; 		// 과세물품 합계 = 과세물품 + 부가세
		int k37_NetPrice = 0; 	// 과세물품
		int k37_tax = 0; 		// 부가세
		int k37_totalPrice = 0; // 결제 금액
		String k33_itemName = "";
		
		
		System.out.println("이마트 죽전점 (031)888-1234");
		System.out.println("206-86-50913 강희석");
		System.out.println("용인 수지구 포은대로 552");
		
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
		System.out.printf("[구 매]%s    POS:0011-9861\n",k37_Date);		
		k37_Line(); 
		System.out.printf("   %5s %14s %3s %4s\n", "상 품 명", "단 가", "수량", "금 액");
		k37_Line();
		
		for (int i = 0; i < k37_itemname.length; i++) {
			int k33_sum = k37_price[i] * k37_num[i]; // 
			k37_totalSum = k37_totalSum + k33_sum; // k33_totalSum에 k33_totalSum와 k33_sum을 더한 값을 대입한다.
			k33_itemName = k37_itemname[i];
			
			if(k27_taxfree[i] == true) {
				k37_star = "*";
				k37_totalTaxFreePrice = k37_totalTaxFreePrice + k33_sum;
			} else {
				k37_star = " ";
				k37_totalNetPrice = k37_totalNetPrice + k33_sum;
			}
			
			System.out.printf("%s%s%8s%3d%8s\n",k37_star, k27_subStrByte(k37_itemname[i],20), k37_df.format(k37_price[i]), k37_num[i],
					 k37_df.format(k37_price[i] * k37_num[i]));
			
			if(i % 5 == 4) {
				k37_Line();
			}
		}
		
		k37_totalPrice = k37_totalNetPrice + k37_totalTaxFreePrice;
		k37_NetPrice = (int) (k37_totalNetPrice / (1 + k37_taxRate));
		k37_tax = k37_totalNetPrice - k37_NetPrice; // 부가세
		
		System.out.printf("%22s %13d\n", "총 품목 수량", k37_itemname.length);
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k37_df.format(k37_totalTaxFreePrice));
		System.out.printf("%23s%14s\n", "과 세  물 품", k37_df.format(k37_NetPrice));
		System.out.printf("%24s%14s\n", "부   가   세", k37_df.format(k37_tax));
		System.out.printf("%25s%14s\n", "합        계", k37_df.format(k37_totalPrice));
		System.out.printf("%s %23s\n", "결 제 대 상 금 액", k37_df.format(k37_totalPrice));
			
		k37_Line();
		
		System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s%19s%s\n", "카드결제(IC)", "일시불/ ", k37_df.format(k37_totalPrice));
		
		k37_Line();
		
		System.out.printf("%25s\n", "[신세계포인트 적립]");
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%s%20s%7s\n", "금회발생포인트", "9350**9995", "164");
		System.out.printf("%s%25s\n", "누계(가용)포인트", "5,637(  5,473)");
		System.out.printf("%s\n", "*신세계 포인트 유효기간은 2년입니다.");
		
		k37_Line();
		
		System.out.printf("%21s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s%29s\n", "차량번호 : ", "34저 ****");
		System.out.printf("%s%30s\n", "입차시간 : ", "2022-04-18 12:20:04");
		
		k37_Line();
		
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%15s%s\n", k37_sdtB.format(k37_calt.getTime()), "/00119861/00164980/31");
		
		
	}
	
	public static void k37_Line() {
		System.out.println("-----------------------------------------");
	}
	
	public static String k37_dateTime() {
		Date nowDate = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		String k37_date = simpleDateFormat.format(nowDate);

		return k37_date;
	}
	

	
	public static String k27_subStrByte(String k37_source, int k37_cutLength) {
	      if (!k37_source.isEmpty()) {
	         k37_source = k37_source.trim();// 
	         if (k37_source.getBytes().length < k37_cutLength) {
	            for (int k37_i = k37_cutLength - k37_source.getBytes().length; k37_i > 0; k37_i--) {
	               k37_source += " ";
	            }
	            return k37_source;
	         } else {
	            StringBuffer k37_sb = new StringBuffer(k37_cutLength);
	            int k37_cnt = 0;
	            for (char k37_ch : k37_source.toCharArray()) {
	               k37_cnt += String.valueOf(k37_ch).getBytes().length;
	               if (k37_cnt > k37_cutLength)
	                  break;
	               k37_sb.append(k37_ch);
	            }
	            
	            if(k37_sb.toString().getBytes().length == 19) {
	            	k37_sb.append(" ");
	            }
	            
	            return k37_sb.toString();
	         }
	      } else {
	         return "";
	      }
	   }

}
