package javajump7;

public class pg14_test {
// 숫자읽기 고급 / 20220415 / k32_이지민 / 주석에는 k32_생략
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2000000000 2030200000 1001034567
		int k32_iNumVal = 310; // 정수형 변수 iNumVal을 1001034567로 선언

		String k32_sNumVal = String.valueOf(k32_iNumVal); // 문자열 sNumVal을 iNumVal을 문자열로 만들어 선언
															// String.valueOf() : String 형태로 만들어줌

		String k32_sNumVoice = ""; // 문자열 sNumVoice를 ""로 선언

		System.out.printf("==> %s [%d자리]\n", k32_sNumVal, k32_sNumVal.length()); // .length() : 문자열 길이

		int k32_i, k32_j; // 정수형 변수 i와 j선언

		String[] k32_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열 units 선언 및 초기화
		String[] k32_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 문자열 배열 unitX 선언 및 초기화

		k32_i = 0; // 변수 i를 0으로 초기화
		k32_j = k32_sNumVal.length() - 1; // 변수 j를 sNumVal의 길이 - 1로 초기화 > 배열은 0번째부터 시작하기 때문

		while (true) { // 무한 반복문
			if (k32_i >= k32_sNumVal.length()) // 변수 i가 sNumVal.length()보다 같거나 클 때
				break; // 반복문을 중단하고 다음으로 넘어간다
			// 변수 i가 sNumVal.length()보다 작을 때
			// sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용) String 배열 units의 위치에 있는 문자를 출력

			if (k32_sNumVal.substring(k32_i, k32_i + 1).equals("0")) { // sNumVal을 i에서 i+1만큼 자른 수가 0일 때 (if문) (.equals > 문자열 같은 것 비교 확인시 사용)
				if (k32_sNumVal.length() <= 8) {
					k32_sNumVoice = k32_sNumVoice // sNumVoice에 sNumVoice +
							+ k32_units[Integer.parseInt(k32_sNumVal.substring(k32_i, k32_i + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
							+ k32_unitX[k32_j]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
				} else {
					if (k32_sNumVal.substring(k32_sNumVal.length() - 8, k32_sNumVal.length() - 4).equals("0000")
							&& k32_unitX[k32_j].equals("만")) {
						// sNumVal의 길이-8 부터 sNumVal의 길이-4까지를 sNumVal에서 자르고 그것이 0000이고 배열 unitX[j] 가 "만"이면 아무 것도 하지 않는다.
					} else if (k32_unitX[k32_j].equals("만") || k32_unitX[k32_j].equals("억")) { // 위의 조건이 false이고 unitX[j]가 "만" 또는 "억"이면 (||는 또는 의미)
						k32_sNumVoice = k32_sNumVoice + "" + k32_unitX[k32_j]; // sNumVoice에 sNumVoice + "" + unitX[j]를 대입
					}
				}
			} else { // sNumVal을 i에서 i+1만큼 자른 수가 0이 아니면
				k32_sNumVoice = k32_sNumVoice // sNumVoice에 sNumVoice +
						+ k32_units[Integer.parseInt(k32_sNumVal.substring(k32_i, k32_i + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
						+ k32_unitX[k32_j]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
			}
			k32_i++; // 변수 i를 1만큼 증가
			k32_j--; // 변수 j를 1만큼 감소

		}
		System.out.printf("\n %s[%s]\n", k32_sNumVal, k32_sNumVoice); // sNumVal, sNumVoice의 결과를 출력
	}

}