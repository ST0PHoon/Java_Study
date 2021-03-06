package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg8 {


	public static void main(String[] args) {	//메인
		// 첫 번째, 물품 정보, 이름, 코드, 가격, 수량
		String k37_itmename1 = "퓨어에어 비말차단용마스크(최고급형)";
		String k37_itmecode1 = "1031615";
		int k37_price1 = 3000;
		int k37_amount1 = 1;
		// 두 번째, 물품 정보, 이름, 코드, 가격, 수량
		String k37_itmename2 = "슬라이드식명찰(가로형)(100호)";
		String k37_itmecode2 = "11008152";
		int k37_price2 = 300000;
		int k37_amount2 = 10;
		// 세 번째, 물품 정보, 이름, 코드, 가격, 수량
		String k37_itmename3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k37_itmecode3 = "10208800";
		int k37_price3 = 1000;
		int k37_amount3 = 1;
		// 물품 별로 가격 * 수량 을 실시하여 새로운 정수형 변수에 입력한다.
		int k37_priceTimesAmount1 = k37_price1 * k37_amount1;
		int k37_priceTimesAmount2 = k37_price2 * k37_amount2;
		int k37_priceTimesAmount3 = k37_price3 * k37_amount3;
		// 구매한 모든 물품의 합계 금액이다.
		int k37_totalPrice = k37_priceTimesAmount1 + k37_priceTimesAmount2 + k37_priceTimesAmount3;
		// 부가세 없는 금액 계산, 계산 후 (int)형으로 바꾸면 자동으로 소수점이 버려진다
		// 이 의미는 부가세에 자동으로 +1이 적용되는것을 의미한다.
		int k37_nonTaxPrice = (int) (k37_totalPrice / 1.1);
		//합계 - 부가세 없는 금액 = 부가세, 계산
		int k37_tax = k37_totalPrice - k37_nonTaxPrice;
		
		
		// 가격에 3번째마다 , 를 넣기위해서 DeciamlFormat인스턴스를 k37_df에 생성한다.
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###");	//#은 숫자가 들어갈 공간이고, String으로 변환된다.
		// 시간데이터를 포멧에 맞게 가져오는 메소드
		String k37_Date = k37_dateTime();	//1995/04/18 23:22:53 식으로 출력
		String k37_refundDate = k37_dateTime(14);	//환불가능 날짜를 계산해주는 메소드, ()안에 숫자로 기간 조정
		// 문자열, 문자열을 끊고싶은 길이, 를 입력한다. (String, int)
		// 입력한 길이를 초과하면 글자의 이후부분을 제거한다. 1 2 3 물품 실행
		String k37_Item1Namecut = k37_subStrByte(k37_itmename1, 26);
		String k37_Item2Namecut = k37_subStrByte(k37_itmename2, 26);
		String k37_Item3Namecut = k37_subStrByte(k37_itmename3, 26);

		System.out.println("               *국민가게, 다이소*");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부, 신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현");
		System.out.println("동)");

		k37_doubleLine();	//두 줄 출력 후 줄바꿈

		System.out.println("          소비자중심경영(CCM) 인증기업");
		System.out.println("         ISO 9001 품질경영시스템 인증기업");

		k37_doubleLine();	//두 줄 출력 후 줄바꿈
		// 환불가능한 날짜 출력, 05월02일 식으로 출력, 구매날짜 + 14일뒤 날짜출력
		System.out.printf("          교환/환불 14일(%s)이내,\n", k37_refundDate);
		System.out.println(" (전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("        포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("         체크카드 취소 시 최대 7일 소요");

		k37_doubleLine();	//두 줄 출력 후 줄바꿈
		// 거래일시 출력, 1995/04/18 23:22:53 식으로 출력
		System.out.printf("[POS 1058231]                 %s\n", k37_Date);

		k37_doubleLine();	//두 줄 출력 후 줄바꿈
		// 1번째 설정한 길이만큼의 물품명, 3번째마다 콤마 찍은 가격, 수량, 수량 * 가격 / 상품코드 출력 
		System.out.printf("%s %8s %2d %10s\n", k37_Item1Namecut, k37_df.format(k37_price1), k37_amount1,
				k37_df.format(k37_priceTimesAmount1));
		System.out.printf("[%s]\n", k37_itmecode1);
		// 2번째 설정한 길이만큼의 물품명, 3번째마다 콤마 찍은 가격, 수량, 수량 * 가격 / 상품코드 출력 
		System.out.printf("%s %8s %2d %10s\n", k37_Item2Namecut, k37_df.format(k37_price2), k37_amount2,
				k37_df.format(k37_priceTimesAmount2));
		System.out.printf("[%s]\n", k37_itmecode2);
		// 3번째 설정한 길이만큼의 물품명, 3번째마다 콤마 찍은 가격, 수량, 수량 * 가격 / 상품코드 출력 
		System.out.printf("%s %8s %2d %10s\n", k37_Item3Namecut, k37_df.format(k37_price2), k37_amount3,
				k37_df.format(k37_priceTimesAmount3));
		System.out.printf("[%s]\n", k37_itmecode3);
		// 과세합계 출력, 합계 / (1+세율), DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("      과세합계                         %10s\n", k37_df.format(k37_nonTaxPrice));
		// 부가세 출력, 합계 - 금액, DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("        부가세                         %10s\n", k37_df.format(k37_tax));

		k37_Line();	//한 줄 출력 후 줄바꿈
		// 합계, DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("판매합계                               %10s\n", k37_df.format(k37_totalPrice));

		k37_doubleLine();	//두 줄 출력 후 줄바꿈
		// 신용카드 금액, 합계금액과 동일하다 DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("신용카드                               %10s\n", k37_df.format(k37_totalPrice));

		k37_Line();	//한 줄 출력 후 줄바꿈

		System.out.println("우리카드                         538720**********");
		// 승인금액, 합계금액과 동일하다 DecimalFormat을 사용하여 String으로 바뀜, 공간은 8 차지하게 설정
		System.out.printf("승인번호 77982843(0)           승인금액%10s\n", k37_df.format(k37_totalPrice));

		k37_doubleLine();	//두 줄 출력 후 줄바꿈
		// 거래일시 출력, 1995/04/18 23:22:53 식으로 출력
		System.out.printf("          %s 분당서현점\n", k37_Date);
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("맴버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("                    바 코 드");
		System.out.println("                2112820610158231");

		k37_Line();	//한 줄 출력 후 줄바꿈

		System.out.println("  ◈ 다이소 맴버십 앱 또는 홈페이지에 접속하셔서");
		System.out.println("    회원가입 후 다양한 혜택을 누려보세요! ◈");

	}

	public static void k37_doubleLine() {	// 두 줄 생성후 줄바꿈 메소드
		//이렇게하면 모든 줄의 길이를 한번에 조정할수 있어서 편리하다
		System.out.println("=================================================");
	}

	public static void k37_Line() {	// 한 줄 생성후 줄바꿈 메소드
		// 이렇게하면 모든 줄의 길이를 한번에 조정할수 있어서 편리하다
		System.out.println("-------------------------------------------------");
	}

	public static String k37_dateTime() {	// 날짜를 틀에 넣어주는 메소드
		// 오늘 날짜 데이터를 받아온다.
		Date nowDate = new Date();
		// 날짜 데이터를 원하는 형식으로 바꿀수있다. 1995/04/18 23:22:53 식으로 출력
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// 날짜 데이터를 포멧에 맞게 바꾸고 String에 입력, SimpleDateFormat인스턴스를 사용하면 String으로 형변환 된다.
		String k37_date = simpleDateFormat.format(nowDate);
		// 결과 리턴
		return k37_date;
	}

	// 오늘 날짜와 환불기간을 가정화 환불가능기간을 설정해주는 메소드
	public static String k37_dateTime(int k37_datedif) {
		Calendar k37_cal = Calendar.getInstance();	// 달력데이터를 가져옵니다. cal에 저장
		//02월 21일 형태롤 출력하는 포멧 설정
		SimpleDateFormat k37_simpleDateFormat2 = new SimpleDateFormat("MM월dd일");	
		// 불러온 날짜에 입력받은 기간만큼 날짜를 더한다. 오늘에 + 14일
		k37_cal.add(Calendar.DATE, k37_datedif);
		// 14일 뒤의 월일을 포멧에 넣는다.
		String k37_refundDate = k37_simpleDateFormat2.format(k37_cal.getTime());
		// 결괏값 리턴
		return k37_refundDate;
	}

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
        	// StringBuffer를 생성, String 보다 문자열을 편집할때 속도가 빠르다
        	StringBuffer k37_sb = new StringBuffer(k37_cutLength);
        	int k37_cnt = 0;	// 문자열을 앞에서부터 한자씩 늘려갈때 길이를 측정할 용도
        	//받아온 문자열을 char 배열로 바꿔서 선언한 k37_ch에 하나씩 추가하는 for문 
        	for (char k37_ch : k37_source.toCharArray()) {
        		// 제일 처음엔 빈 k37_ch를 측정 이후엔
        		// 문자열의 첫번째 글자를 추가하고 바이트 길이측정 (한글이면 2, 영어면 1)
        		// 문자열의 두번째 글자 추가(이미 첫번째는 추가상태) ... 바이트 길이 측정... 마지막까지 진행 
        		k37_cnt += String.valueOf(k37_ch).getBytes().length;
        		// 위 상태를 진행하다가 길이가 k37_cutLength(내가설정한 길이) 보다 커지면 멈춘다.
        		if (k37_cnt > k37_cutLength)
        			break;
        		// 다음 문자 추가
        		k37_sb.append(k37_ch);
        	}
           // 20번째 한글이 오면 공백이 발생하는 문제해결, 바이트 길이가
        	// 내가 원하는 길이보다 1 작으면 공백 추가
           if(k37_sb.toString().getBytes().length == (k37_cutLength - 1)) {
        	   k37_sb.append(" ");	//append 명령어를 이용하면 StringBuffer 선언한 문자열 맨뒤에 문자 추가된다.
           }
            return k37_sb.toString();	//String으로 형변환 하여 출력
         }

   }
}
