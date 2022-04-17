package javajump7;

public class pg10 {

	public static void main(String[] args) {
		// 10pg 한글계산
		System.out.printf("k37_HanBlankForeword[%s]\n", k37_HanBlankForeword("한글abcd", 15));
		System.out.printf("k37_HanBlankForeword[%s]\n", k37_HanBlankForeword("한글한글abcd", 15));
		System.out.printf("k37_HanBlankBackword[%s]\n", k37_HanBlankBackword("한글abcd", 15));
		System.out.printf("k37_HanBlankBackword[%s]\n", k37_HanBlankBackword("한글한글abcd", 15));
		System.out.printf("한글은 [%d]개\n", k37_HanCount("한글한글aa"));
		
	}
	
	public static String k37_HanBlankForeword(String k37_Han, int k37_totalLength) {
		String k37_outString = "";	//빈 문자열 생성, 결과 리턴용
		// 길이를 측정하면 문자열(개당 한글:2,영어:1)
		byte[] k37_byte = k37_Han.getBytes();
		//0부터 1씩증가하며 총 길이 - (한글 수 *2 + 영어 수) 전까지 도는 for문 선언
		for (int k37_i = 0; k37_i < k37_totalLength - k37_byte.length; k37_i++) {
			// k37_totalLength 길이를 맞추기 위해 공백 생성
			k37_outString = k37_outString + " ";
		}
		//공백 뒤에 문자열을 붙인다.
		return k37_outString + k37_Han;
	}
	
	public static String k37_HanBlankBackword(String k37_Han, int k37_totalLength) {
		String k37_outString = "";	//빈 문자열 생성, 결과 리턴용
		byte[] k37_byte = k37_Han.getBytes();	// 한글의 개수를 측정할 때 사용
		//0부터 1씩증가하며 총 길이 - (한글 수 *2 + 영어 수) 전까지 도는 for문 선언
		for (int k37_i = 0; k37_i < k37_totalLength - k37_byte.length; k37_i++) {
			// k37_totalLength 길이를 맞추기 위해 공백 생성
			k37_outString = k37_outString + " ";
		}
		//공백 앞에 문자열을 붙인다.
		return k37_Han + k37_outString;
	}
	
	// 한글의 개수를 출력하는 메소드
	public static int k37_HanCount(String k37_Han) {
		// 이렇게 만들고 k37_byte의 길이를 측정하면
		// 한글은 2, 영어는 1만큼 차지한다.
		byte[] k37_byte = k37_Han.getBytes();
		// (한글 개수 * 2 + 영어 개수) - (한글 개수 + 영어 개수)
		// 아래 식을 계산하명 한글의 개수가 출력된다.
		return k37_byte.length - k37_Han.length();
	}

}
