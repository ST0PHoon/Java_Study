package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg9 {

	public static void main(String[] args) {
		// 30개의 제품 목록 생성, String 배열
		String[] k37_itemname = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 100cm", "상투과자E", "더블링 나일론 낑깡 롤러", "해피홈 SAFE 핸드워시",
				"농심 신라면120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면 156g*4", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족D_WH", "프리미엄생연어초밥", "피코크 들깨미역국500g", "남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "상하유기농우유900", "트라피스트 유기 포도", "동원참치살코기100g*3", "오뚜기 오즈키친머쉬",
				"치킨스프카레 200g" };
		// 제품별 가격 입력, 정수형 배열로 생성
		int[] k37_price = { 7500, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 4380, 8980, 5980, 5980, 2680 };
		// 각 제품별 수량 입력, 정수형 배열로 생성
		int[] k37_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 };
		// 각 제품이 면세제품인지 입력, 불리언형 배열로 생성, true면 면세, false면 안면세
		boolean[] k27_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, false };	
		
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		SimpleDateFormat k37_sdtB = new SimpleDateFormat("YYYYMMdd");
		Calendar k37_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		String k37_star= " ";		
		String k37_Date = k37_dateTime();
		double k37_taxRate = 0.1;	// 부가세율
		int k37_sum = 0;
		int k37_totalSum = 0; 		// k33_price(단가) * k33_amount(수량) 값
		int k37_totalTaxFreePrice = 0; // 면세 물품 합계
		int k37_totalNetPrice = 0; 		// 과세물품 합계 = 과세물품 + 부가세
		int k37_NetPrice = 0; 	// 과세물품
		int k37_tax = 0; 		// 부가세
		int k37_totalPrice = 0; // 결제 금액
		
		
		System.out.println("이마트 죽전점 (031)888-1234");
		System.out.println("206-86-50913 강희석");
		System.out.println("용인 수지구 포은대로 552");
		
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
		// 구매한 시각을 출력합니다. 2022-04-19 00:54 형식으로 출력
		System.out.printf("[구 매]%s    POS:0011-9861\n",k37_Date);		
		k37_Line(); 
		System.out.printf("   %5s %14s %3s %4s\n", "상 품 명", "단 가", "수량", "금 액");
		k37_Line();
		// 물품의 갯수만큼 도는 for문 작성, 배열에서 각각 모든 성분을 불러올때 사용한다.
		for (int k37_i = 0; k37_i < k37_itemname.length; k37_i++) {
			// 가격과 수량을 곱한 값을 합에 새로운 변수에 입력한다.
			k37_sum = k37_price[k37_i] * k37_num[k37_i];
			k37_totalSum += k37_sum; // k37_totalSum에 k37_totalSum와 k37_sum을 더한 값을 대입한다.
			
			if(k27_taxfree[k37_i] == true) {
				k37_star = "*";
				k37_totalTaxFreePrice = k37_totalTaxFreePrice + k37_sum;
			} else {
				k37_star = " ";
				k37_totalNetPrice = k37_totalNetPrice + k37_sum;
			}
			// 면세여부, 물품을 20길이만큼 자른 String, 3번째마다 콤마가 찍힌 가격, 수량, 콤마가 찍힌 가격 * 수량을 틀에 맞게 출력한다. // 모든 물품 
			System.out.printf("%s%s%8s%3d%8s\n",k37_star, k37_subStrByte(k37_itemname[k37_i],20), k37_df.format(k37_price[k37_i]), k37_num[k37_i],
					 k37_df.format(k37_price[k37_i] * k37_num[k37_i]));
			// 5번째마다 줄 추가
			if(k37_i % 5 == 4) {
				k37_Line();
			}
		}
		
		k37_totalPrice = k37_totalNetPrice + k37_totalTaxFreePrice;
		k37_NetPrice = (int) (k37_totalNetPrice / (1 + k37_taxRate));
		k37_tax = k37_totalNetPrice - k37_NetPrice; // 부가세
		
		System.out.printf("%21s %13d\n", "총 품목 수량", k37_itemname.length);
		System.out.printf("%22s%14s\n", "(*)면 세  물 품", k37_df.format(k37_totalTaxFreePrice));
		System.out.printf("%22s%14s\n", "과 세  물 품", k37_df.format(k37_NetPrice));
		System.out.printf("%23s%14s\n", "부   가   세", k37_df.format(k37_tax));
		System.out.printf("%24s%14s\n", "합        계", k37_df.format(k37_totalPrice));
		System.out.printf("%s %22s\n", "결 제 대 상 금 액", k37_df.format(k37_totalPrice));
			
		k37_Line();
		
		System.out.printf("%s%27s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s%18s%s\n", "카드결제(IC)", "일시불/ ", k37_df.format(k37_totalPrice));
		
		k37_Line();
		
		System.out.printf("%21s\n", "[신세계포인트 적립]");
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%s%20s%6s\n", "금회발생포인트", "9350**9995", "164");
		System.out.printf("%s%24s\n", "누계(가용)포인트", "5,637(  5,473)");
		System.out.printf("%s\n", "*신세계 포인트 유효기간은 2년입니다.");
		
		k37_Line();
		
		System.out.printf("%21s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s%29s\n", "차량번호 : ", "34저 ****");
		System.out.printf("%s%30s\n", "입차시간 : ", "2022-04-18 12:20:04");
		
		k37_Line();
		
		System.out.printf("%s%24s\n", "캐셔:084599 양00", "1150");
		System.out.printf("%36s\n", "|||||||||||||||||||||||||||||||");
		System.out.printf("%36s\n", "|||||||||||||||||||||||||||||||");
		System.out.printf("%14s%s\n", k37_sdtB.format(k37_calt.getTime()), "/00119861/00164980/31");
		
		
	}
	
	public static void k37_Line() {	// 한 줄 생성후 줄바꿈 메소드
		// 이렇게하면 모든 줄의 길이를 한번에 조정할수 있어서 편리하다
		System.out.println("-----------------------------------------");
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
	

	// 문자열을 원하는 길이에서 잘라주는 메소드, 물품의 이름과 원하는 길이를 매개변수로 받아온다.
	public static String k37_subStrByte(String k37_source, int k37_cutLength) {
		// 받아온 물품 이름의 앞뒤에 공백을 삭제한다.
		k37_source = k37_source.trim();
		// 문자열의 길이를 측정합니다.(getBytes를 사용해서 한글은 2, 영어는 1로 측정한다
		// 이런식으로 구한 길이가 내가 원하는 길이보다 작거나 같으면 문자열 뒤에 공백을 추가한다.
        if (k37_source.getBytes().length <= k37_cutLength) {	//공백을 추가하여 원하는 길이로 늘린다.
        	// 원하는 길이 - 물품의 바이트 길이가 추가로 필요한 공백 수이다.
           for (int k37_i = k37_cutLength - k37_source.getBytes().length; k37_i > 0; k37_i--) {
              k37_source += " ";	// 필요한 공백을 추가
           }
           return k37_source;	// 결과를 리턴
        } else {	//물품 이름의 길이가 설정한 길이보다 길면 잘라준다.
        	// StringBuffer를 생성
        	StringBuffer k37_sb = new StringBuffer(k37_cutLength);
        	int k37_cnt = 0;	// 
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

   }

}
