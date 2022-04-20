package javajump7;

import java.text.DecimalFormat;

public class pg11 {

	public static void main(String[] args) {
		// 11pg 고정길이에서 필드 추출, 5강 진행후 실시
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		
		String [] OneRec = {
				"01  해피홈 SAFE365 10,000,000  1 10,000,000",
				"02  (G)LH원형유리화     6,900 11     75,900",
				"03  상투과자E           5,980  1      5,980",
				"04  더블링 나일론       3,300  1      3,000",
				"05  해피홈 SAFE 핸      5,500  2     11,000",
				"06  농심 신라면120g     3,360  1      3,360",
				"07* (대)국내산삼겹      6,610  1      6,010",
				"08  오뚜기 진비빔면     2,750  1      2,750",
				"09* GAP 죽장사과 4-    10,800  1     10,800",
				"10  피코크 탄두리       2,480  1      2,480",
				"11  (달콤)순살닭강      7,920  1      7,920",
				"12 DZ주니어양말3족      4,980  1      4,980",
				"13  DZ주니어양말3족     4,980  1      4,980",
				"14  프리미엄생연어      7,130  1      7,130",
				"15  피코크 들깨미역     3,980  1      3,980",
				"16* 남양 맛있는우유     4,480  1      4,480",
				"17  녹차원흑당시럽1     4,980  1      4,980",
				"18  진라면소컵(매)6     3,210  1      3,210",
				"19  케라시스 앰플       6,950  1      6,950",
				"20  푸르밀 미숫가루     2,980  2      6,960",
				"21  자일로스갈색설      1,990  1      1,990",
				"22  CJ 비비고칩 20G     1,980  1      1,980",
				"23  피코크 들깨미역     3,980  1      3,980",
				"24  흑원당 말차 밀      4,480  1      4,480",
				"25* 상하유기농우유9     4,380  2      8,760",
				"26  트라피스트 유기     8,980  1      8,980",
				"27  동원참치살코기1     5,980  1      5,980",
				"28  오뚜기 오즈키친     5,980  1      5,980",
				"29  치킨스프카레 20    2,6080  1      2,800"				
		};
		// 문자열 배열의 길이만큼 도는 배열 작성, 배열의 모든 문자열을 방문한다.
		for (int i = 0; i < OneRec.length; i++) {
			int countKorean = OneRec[i].getBytes().length - OneRec[i].length();	//배열에서 받아온 String에서 한글의 개수를 측정한다.
			// 문자열에서 가격, 수량, 합계를 추출해서 가격 * 수량 != 합계 라면  오류를 수정한다.
			if ( Integer.parseInt(k37_firstPrice(OneRec[i],countKorean)) *  Integer.parseInt(k37_productNumber(OneRec[i],countKorean)) != 
					Integer.parseInt(k37_lastPrice(OneRec[i],countKorean))) {
			
				System.out.println("**********************************************************");
				System.out.printf("오류[%s]\n",OneRec[i]);	//우선 오류 문자열을 출력한다.
				// string.replace(합계, 가격*개수) 의 구조로
				// 합계는 수량 이후의 부분을 substring으로 자르고 trim을 사용하여 공백을 제거한다. 그러면 10,000,000 / 75,900 ... 이런식으로 잘린다.
				// int 형으로 바꾼 가격과 개수를 곱한뒤 DeciamlFormat으로 3자리마다 콤마 넣은 String 형으로 바꿔서 replace에 넣는다. 
				String k37_modified = OneRec[i].replace(OneRec[i].substring(OneRec[i].length() - OneRec[i].substring(32 - countKorean).trim().length()),
						k37_df.format(Integer.parseInt(k37_firstPrice(OneRec[i],countKorean)) * Integer.parseInt(k37_productNumber(OneRec[i],countKorean))));
				// 수정한 스트링 출력
				System.out.printf("수정[%s]\n",k37_modified);
				
				System.out.println("**********************************************************");
			}
		}
	}
	
	// 첫번째 가격을 추출한다. string 형으로 리턴
	public static String k37_firstPrice(String k37_price, int k37_kNum) {
		// 가격의 구간 19 ~ 30 (한글로 인해 1이 2로 측정된 부분을 제거하기 위해, - 한글수를 한다), 이후 콤마 제거(replace), 공백 제거(trim)
		String k37_onlynumber = k37_price.substring(19 - k37_kNum, 30 - k37_kNum).replace(",","").trim();
		return k37_onlynumber;	//값 리턴
	}
	// 개수의 구간 30 ~ 32 (한글로 인해 1이 2로 측정된 부분을 제거하기 위해, - 한글수를 한다), 이후 공백 제거(trim)
	public static String k37_productNumber(String k37_price, int k37_kNum) {
		String k37_onlynumber = k37_price.substring(30 - k37_kNum, 32 - k37_kNum).trim();
		return k37_onlynumber;
	}
	// 가격의 구간 32 이후 (한글로 인해 1이 2로 측정된 부분을 제거하기 위해, - 한글수를 한다), 이후 콤마 제거(replace), 공백 제거(trim)
	public static String k37_lastPrice(String k37_price, int k37_kNum) {
		String k37_onlynumber = k37_price.substring(32 - k37_kNum).replace(",","").trim();
		return k37_onlynumber;
	}

}


