package javajump6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pt3 {
	static String[] k37_itemName = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 100cm", "상투과자E", "더블링 나일론 깡 롤러", "해피홈 SAFE 핸드워시",
			"농심 신라면120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면 156g*4", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
			"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족D_WH", "프리미엄생연어초밥", "피코크 들깨미역국500g", "남양 맛있는우유GT 저지방",
			"녹차원흑당시럽10입", "진라면소컵(매)65*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G", "피코크 들깨미역국500",
			"흑원당 말차 밀크티", "1+ 등급란 10개입 특", "동원양반볶음김치기획", "[트레비]레몬300ml", "듀라셀 디럭스 알카라인 AAA 24입", "파머스픽 밤 고구마 (2kg/박스)",
			"[바이오퍼블릭]유산균 50포", "[냉동][태국]노브랜드 냉동 새우살 (31-40) (450g)" };
	static int[] k37_price = { 1500000, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 248000, 7920, 4980, 4980,
			7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 9480, 7980, 850, 15200, 10980, 98000,
			12800 }; // 가격을 정수형 배열로 선언 및 초기화
	static int[] k37_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 500, 1,
			1, 100, 1 }; // 수량을 정수형 배열로 선언 및 초기화
	static boolean[] k37_taxFree = { false, false, false, false, false, false, true, false, true, true, false, false,
			false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
			false, false, true, false, true }; // 비과세 여부를 논리형 자료형인 boolean의 배열로 선언 및 초기화
	static int k37_taxFreeTotal = 0, k37_totalSum = 0, k37_netPrice, k37_taxPrice; // 정수형 변수 면세물품 합계, 과세물품 합계, 총 합계를 선언
																					// 및 0으로 초기화
	static double k37_taxRate = 0.1; // 실수형 변수 세율을 선언 및 0.1을 초기화 (10%) // 세전가격 및 세금을 선언

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k37_itemCount = k37_itemName.length;
		k37_TitlePrint();
		k37_TimeStamp();
		k37_HeaderPrint();

		for (int k37_i = 0; k37_i < k37_itemCount; k37_i++) {
			k37_itemPrint(k37_i);
		}
		k37_totalPrint();
	}

	public static void k37_TitlePrint() {
		System.out.println("           이마트 죽전점 (031)888-1234");
		System.out.println("   emart   206-86-50913 강희석");
		System.out.println("           용인 수지구 포은대로 552");
		System.out.println();
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();
	}

	public static void k37_TimeStamp() {
		Calendar k37_calt = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져옴
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // SimpleDateFormat 클래스로 출력 형식 지정
		System.out.printf("[구매]%9s      POS:0011-9861\n", k37_sdt.format(k37_calt.getTime()));
	}

	public static void k37_HeaderPrint() {
		System.out.println("-----------------------------------------");
		System.out.printf("%7s%14s%5s%5s\n", "상 품 명", "단 가", "수량", "금 액");
		System.out.println("-----------------------------------------");
	}

	public static String k37_subStrByte(String k37_str, int k37_cutlength) { // 바이트 단위로 자르는 함수를 선언(매개변수2>문자열 변수(변경할
																				// 문자열), 정수형 변수(바이트 크기)
		StringBuffer k37_subStr = new StringBuffer(k37_cutlength); // StringBuffer 선언 (문자열을 추가하거나 변경할 때 주로 사용하는 자료형)
		for (int k37_i = k37_cutlength - k37_str.getBytes().length; k37_i <= k37_cutlength; k37_i++) { // 정수형 변수 i가 cutlength -str.getBytes().length부터cutlength까지
			k37_str = k37_str + " "; // 남은 칸만큼 blank 추가 // 1씩 증가하며 반복(for문)
		}

		int k37_nCount = 0; // 정수형 변수 nCount 선언 및 0으로 초기화
		for (char k37_ch : k37_str.toCharArray()) { // 문자열 str을 char형 배열로 바꿔서 하나씩 추가(for문)
			k37_nCount += String.valueOf(k37_ch).getBytes().length; // nCount에 ch를 문자열로 바꾼 후 바이트의 크기를 구함 > 다음으로 진행
			if (k37_nCount > k37_cutlength) // nCount가 cutlength보다 크면
				break; // 그만한다 (중지)
			k37_subStr.append(k37_ch); // 크지 않으면 subStr에 ch를 추가한다(add)

		}
		if (k37_subStr.toString().getBytes().length == (k37_cutlength - 1)) { // subStr의 바이트 크기가 자를 크기 보다 1 작을 때
			k37_subStr.append(" "); // blank를 추가한다
		}
		return k37_subStr.toString(); // 리턴값 : subStr (문자열로 형 변
	}

	public static void k37_itemPrint(int k37_i) {
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat 클래스 가져오기, 형태 지정하기
			if (k37_taxFree[k37_i] == true) { // 비과세 여부가 true 라면
				System.out.printf("%-2s", "*"); // 항목 앞에 * 출력
			} else { // false라면
				System.out.printf("%-2s", " "); // 빈칸
			}
			System.out.printf("%s%10s%4d%10s\n", k37_subStrByte(k37_itemName[k37_i], 15),
					// 제품명은 함수를 사용해 15바이트로 자르고, 단가, 수량, 금액은 형식에 맞게 출력
					k37_df.format(k37_price[k37_i]), k37_num[k37_i], k37_df.format(k37_price[k37_i] * k37_num[k37_i]));

			if ((k37_i + 1) % 5 == 0) { // 정수형 변수 i+1을 5로 나눈 나머지가 0이라면 (5개 마다)
				System.out.println("-----------------------------------------"); // 구분선 출력
			}
	}

	public static int k37_netPrice(int k37_totalSum, int k37_taxFreeTotal, double k37_taxRate) { // 세전 가격을 구하는 함수 선언(매개변수 3개 > 정수형
		// 총 합계 및 면세물품 총합, 실수형 세율)
		return (int) ((k37_totalSum - k37_taxFreeTotal) / (1 + k37_taxRate)); // 리턴값 : (총합-면세물품 총합) / (1+세율) > 세금은 무조건 올림
	}

	public static String k37_parkingTime() { // 입차 시간을 구하는 함수를 선언 (임의로 1시간 전으로 구한다)
		Calendar k37_cal = Calendar.getInstance(); // Calendar 클래스로 현재 시간을 가져옴
		k37_cal.setTime(new Date()); // 현재 시간 setTime 형식으로 지정
		SimpleDateFormat k37_df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // SimpleDateFormat 클래스로 출력 형식 지정
		k37_cal.add(Calendar.HOUR, -1); // 현재시간에서 1시간을 뺀다
		String k37_parkingTime = k37_df.format(k37_cal.getTime()); // 1시간을 뺀 시간을 문자열로 선언 및 초기화
		return k37_parkingTime; // 리턴값 : parkingTime
	}

	public static int k37_thisPoint(int k37_totalSum) {
		return (int) (k37_totalSum * 0.001);
	}

	public static int k37_totalPoint(int k37_totalSum) {
		return (int) (k37_totalSum * 0.001) + 5473;
	}

	public static void k37_totalPrint() {
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat 클래스 가져오기, 형태 지정하기
		for (int k37_i = 0; k37_i < k37_itemName.length; k37_i++) { // 정수형 변수 i가 0부터 제품의 개수-1 만큼 1씩 증가하며 반복 (for문)
			if (k37_taxFree[k37_i] == true) { // 비과세 여부가 true 라면
				k37_taxFreeTotal += k37_price[k37_i] * k37_num[k37_i]; // 비과세 제품들의 합계
			}
		}

		for (int k37_i = 0; k37_i < k37_itemName.length; k37_i++) { // 정수형 변수 i가 0부터 제품의 개수-1 만큼 1씩 증가하며 반복 (for문)
			k37_totalSum += k37_price[k37_i] * k37_num[k37_i]; // 총 합계
		}

		k37_netPrice = k37_netPrice(k37_totalSum, k37_taxFreeTotal, k37_taxRate); // 소비자 가격을 함수를 사용해 구한다.
		k37_taxPrice = k37_totalSum - k37_netPrice - k37_taxFreeTotal; // 세금은 총 합계에서 소비자가격과 면세 물품의 총합을 뺀 것

		System.out.println();
		System.out.printf("               총 품목 수량  %12s\n", k37_itemName.length); // 수량을 형태에 맞게 출력
		System.out.printf("            (*)면 세  물 품  %12s\n", k37_df.format(k37_taxFreeTotal)); // 면세 물품의 총합을 형태에 맞게 출력
		System.out.printf("               과 세  물 품  %12s\n", k37_df.format(k37_netPrice)); // 과세 물품의 총합을 형태에 맞게 출력
		System.out.printf("               부   가   세  %12s\n", k37_df.format(k37_taxPrice)); // 세금을 형태에 맞게 출력
		System.out.printf("               합        계  %12s\n", k37_df.format(k37_totalSum)); // 총 합계를 형태에 맞게 출력
		System.out.printf("결 제 대 상 금 액            %12s\n", k37_df.format(k37_totalSum)); // 총 합계를 형태에 맞게 출력
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB 하나       541707**0484/35860658");
		System.out.printf("카드결제(IC)          일시불 / %10s\n", k37_df.format(k37_totalSum)); // 총 합계를 형태에 맞게 출력
		System.out.println("-----------------------------------------");
		System.out.println("             [신세계포인트 적립]");
		System.out.println("이*민 고객님의 포인트 현황입니다.");
		System.out.printf("금회발생포인트     %12s%10s\n", "9350**9995", k37_df.format(k37_thisPoint(k37_totalSum)));
		System.out.printf("누계(가용)포인트      %8s%s\n", k37_df.format(k37_totalPoint(k37_totalSum)), "(    5,473)");
		System.out.println("*신세계포인트 유효기간은 2년입니다.");
		System.out.println("-----------------------------------------");
		System.out.println("    구매금액기준 무료주차시간 자동부여");
		System.out.printf("차량번호                %16s\n", "32다****");
		System.out.printf("입차시간              %5s\n", k37_parkingTime()); // 주차 시간을 구하는 함수로 입차 시간을 구해 출력
		System.out.println("-----------------------------------------");
		System.out.printf("캐셔:084599 양00         %16d\n", 1150);
		System.out.println("     ||||||||||||||||||||||||||||||||||");
		System.out.println("     ||||||||||||||||||||||||||||||||||");
		System.out.println("        20220419/00119861/00164980/31");

	}
}
