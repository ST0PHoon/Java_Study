package javajump5;

import java.lang.Character.UnicodeBlock;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k33_df = new DecimalFormat("#,###,###");
		Calendar k33_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져온다.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat k33_sdtB = new SimpleDateFormat("YYYYMMdd");

		String[] k33_itemNames = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병10개묶음", "상투과자E", "더블링 나일론 깡 롤 휴지", "해피홈 SAFE 핸드워시",
				"농심 신라면 120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면156g*5개", "GAP 죽장사과 4-6입", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500", "남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특란", "동원양반볶음김치기획" };
		int[] k33_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };
		int[] k33_amount = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };
		boolean[] k33_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false };
		double k33_taxRate = 0.1;	// 부가세율
		int k33_totalSum = 0; 		// k33_price(단가) * k33_amount(수량) 값
		int k33_totalTaxFreePrice = 0; // 면세 물품 합계
		int k33_totalNetPrice = 0; 		// 과세물품 합계 = 과세물품 + 부가세
		int k33_NetPrice = 0; 	// 과세물품
		int k33_tax = 0; 		// 부가세
		int k33_totalPrice = 0; // 결제 금액

		System.out.printf("%35s\n", "이마트 죽전점 (031)888-1234");
		System.out.printf("%30s\n", "206-86-50913 강희석");
		System.out.printf("%29s\n", "용인 수지구 포은대로 552");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("%s%s%18s\n", "[구 매]", k33_sdtA.format(k33_calt.getTime()), "POS:0011-9861");	// 현재시간 출력
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("   %5s %14s %3s %4s\n", "상 품 명", "단 가", "수량", "금 액");
		System.out.printf("%s\n", "-----------------------------------------");

		for (int k33_i = 0; k33_i < k33_itemNames.length; k33_i++) { //
			int k33_sum = k33_price[k33_i] * k33_amount[k33_i]; // 
																// 
			k33_totalSum = k33_totalSum + k33_sum; // k33_totalSum에 k33_totalSum와 k33_sum을 더한 값을 대입한다.

			if (k33_taxfree[k33_i] == true) {
				k33_totalTaxFreePrice = k33_totalTaxFreePrice + k33_sum;
				System.out.print("* ");
			} else {
				System.out.print("  ");
				k33_totalNetPrice = k33_totalNetPrice + k33_sum;
			}

			String k33_itemName = k33_itemNames[k33_i];
			String k33_blank = "";
			int k33_itemNameLength = k33_itemName.getBytes().length;

			if (k33_itemNameLength > 20) {
				byte[] b = k33_itemName.getBytes();
				char ch = k33_itemName.charAt(11);
				Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(ch);
				if (UnicodeBlock.HANGUL_SYLLABLES.equals(unicodeBlock)
						|| UnicodeBlock.HANGUL_COMPATIBILITY_JAMO.equals(unicodeBlock)
						|| UnicodeBlock.HANGUL_JAMO.equals(unicodeBlock)) {
					k33_itemName = new String(b, 0, 20);
				} else {
					k33_itemName = new String(b, 0, 19);
				}
			}
			k33_itemNameLength = k33_itemName.getBytes().length;
			for (int i = 0; i < 20 - (int) k33_itemNameLength; i++) {
				k33_blank = k33_blank + " ";
			}

			System.out.printf("%s%s%8s%3d%8s\n", k33_itemName, k33_blank, k33_df.format(k33_price[k33_i]), k33_amount[k33_i], k33_df.format(k33_sum));
			if ((k33_i + 1) % 5 == 0) {
				System.out.printf("%s\n", "-----------------------------------------");
			}
		}

		k33_totalPrice = k33_totalNetPrice + k33_totalTaxFreePrice;
		k33_NetPrice = (int) (k33_totalNetPrice / (1 + k33_taxRate));
		k33_tax = k33_totalNetPrice - k33_NetPrice; // 부가세

		System.out.printf("\n%22s %13d\n", "총 품목 수량", k33_itemNames.length);
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k33_df.format(k33_totalTaxFreePrice));
		System.out.printf("%23s%14s\n", "과 세  물 품", k33_df.format(k33_NetPrice));
		System.out.printf("%24s%14s\n", "부   가   세", k33_df.format(k33_tax));
		System.out.printf("%25s%14s\n", "합        계", k33_df.format(k33_totalPrice));
		System.out.printf("%s %23s\n", "결 제 대 상 금 액", k33_df.format(k33_totalPrice));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%s%19s%s\n", "카드결제(IC)", "일시불/ ", k33_df.format(k33_totalPrice));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%25s\n", "[신세계포인트 적립]");
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%s%20s%7s\n", "금회발생포인트", "9350**9995", "164");
		System.out.printf("%s%25s\n", "누계(가용)포인트", "5,637(  5,473)");
		System.out.printf("%s\n", "*신세계 포인트 유효기간은 2년입니다.");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%21s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s%29s\n", "차량번호 : ", "34저 ****");
		System.out.printf("%s%30s\n", "입차시간 : ", "2022-04-18 12:20:04");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%25s\n", "캐셔:084599 양00", "1150");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%15s%s\n", k33_sdtB.format(k33_calt.getTime()), "/00119861/00164980/31");
	}
}
