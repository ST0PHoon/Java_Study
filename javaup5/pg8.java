package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg8 {

	String k37_itmename1 = "퓨어에어 비말차단용마스크(최고급형)";
	String k37_itmecode1 = "1031615";
	int k37_price1 = 3000;
	int k37_amount1 = 1;

	String k37_itmename2 = "슬라이드식명찰(가로형)(100호)";
	String k37_itmecode2 = "11008152";
	int k37_price2 = 10000;
	int k37_amount2 = 10;

	String k37_itmename3 = "매직흡착 인테리어후크(알루미늄타입)";
	String k37_itmecode3 = "10208800";
	int k37_price3 = 1000;
	int k37_amount3 = 1;

	int k37_priceTimesAmount1 = k37_price1 * k37_amount1;
	int k37_priceTimesAmount2 = k37_price2 * k37_amount2;
	int k37_priceTimesAmount3 = k37_price3 * k37_amount3;

	int k37_totalPrice = k37_priceTimesAmount1 + k37_priceTimesAmount2 + k37_priceTimesAmount3;

	int k37_nonTaxPrice = (int) (k37_totalPrice / 1.1);
	int k37_tax = k37_totalPrice - k37_nonTaxPrice;

	public static void main(String[] args) {
		// pg8
		pg8 k37 = new pg8();

		DecimalFormat k37_df = new DecimalFormat("###,###,###");

		String k37_Date = k37_dateTime();
		String k37_refundDate = k37_dateTime(14);
		String k37_Item1Namecut = subStrByte(k37.k37_itmename1, 26);
		String k37_Item2Namecut = subStrByte(k37.k37_itmename2, 26);
		String k37_Item3Namecut = subStrByte(k37.k37_itmename3, 26);

		System.out.println("               *국민가게, 다이소*");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화: 031-702-6016");
		System.out.println("본사: 서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표: 박정부, 신호섭 213-81-52063");
		System.out.println("매장: 경기도 성남시 분당구 분당로53번길 11 (서현");
		System.out.println("동)");

		k37_doubleLine();

		System.out.println("          소비자중심경영(CCM) 인증기업");
		System.out.println("         ISO 9001 품질경영시스템 인증기업");

		k37_doubleLine();

		System.out.printf("          교환/환불 14일(%s)이내,\n", k37_refundDate);
		System.out.println(" (전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("        포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("         체크카드 취소 시 최대 7일 소요");

		k37_doubleLine();

		System.out.printf("[POS 1058231]                 %s\n", k37_Date);

		k37_doubleLine();

		System.out.printf("%s %8s %2d %9s\n", k37_Item1Namecut, k37_df.format(k37.k37_price1), k37.k37_amount1,
				k37_df.format(k37.k37_priceTimesAmount1));
		System.out.printf("[%s]\n", k37.k37_itmecode1);

		System.out.printf("%s %8s %2d %9s\n", k37_Item2Namecut, k37_df.format(k37.k37_price2), k37.k37_amount2,
				k37_df.format(k37.k37_priceTimesAmount2));
		System.out.printf("[%s]\n", k37.k37_itmecode2);

		System.out.printf("%s %8s %2d %9s\n", k37_Item3Namecut, k37_df.format(k37.k37_price2), k37.k37_amount3,
				k37_df.format(k37.k37_priceTimesAmount3));
		System.out.printf("[%s]\n", k37.k37_itmecode3);

		System.out.printf("      과세합계                           %8s\n", k37_df.format(k37.k37_nonTaxPrice));
		System.out.printf("        부가세                           %8s\n", k37_df.format(k37.k37_tax));

		k37_Line();

		System.out.printf("판매합계                                 %8s\n", k37_df.format(k37.k37_totalPrice));

		k37_doubleLine();

		System.out.printf("신용카드                                 %8s\n", k37_df.format(k37.k37_totalPrice));

		k37_Line();

		System.out.println("우리카드                        538720**********");
		System.out.printf("승인번호 77982843(0)          승인금액  %8s\n", k37_df.format(k37.k37_totalPrice));

		k37_doubleLine();

		System.out.printf("          %s 분당서현점\n", k37_Date);
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("맴버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("                    바 코 드");
		System.out.println("                2112820610158231");

		k37_Line();

		System.out.println("  ◈ 다이소 맴버십 앱 또는 홈페이지에 접속하셔서");
		System.out.println("    회원가입 후 다양한 혜택을 누려보세요! ◈");

	}

	public static void k37_doubleLine() {
		System.out.println("==================================================");
	}

	public static void k37_Line() {
		System.out.println("--------------------------------------------------");
	}

	public static String k37_dateTime() {
		Date nowDate = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		String k37_date = simpleDateFormat.format(nowDate);

		return k37_date;
	}

	public static String k37_dateTime(int k37_datedif) {
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM월dd일");

		cal.add(Calendar.DATE, k37_datedif);

		String k37_refundDate = simpleDateFormat2.format(cal.getTime());

		return k37_refundDate;
	}

	public static String k37_intTOString(int k37_i) {
		String k37_intToStr = Integer.toString(k37_i);

		return k37_intToStr;
	}

	public static String subStrByte(String str, int cutlen) {
		if (!str.isEmpty()) {
			str = str.trim();
			if (str.getBytes().length <= cutlen) {
				return str;
			} else {
				StringBuffer sbStr = new StringBuffer(cutlen);
				int nCnt = 0;
				for (char ch : str.toCharArray()) {
					nCnt += String.valueOf(ch).getBytes().length;
					if (nCnt > cutlen)
						break;
					sbStr.append(ch);
				}
				return sbStr.toString() + " ";
			}
		} else {
			return "";
		}
	}
}
