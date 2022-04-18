package javajump5;

public class pg6 {

	public static void main(String[] args) {
		// pg6
		//오늘의 요일(5면 금요일에서 시작)
		//1월1일을 금요일로 잡는 달력
		int k37_iWeekday = 5;	
		// 각 달의 말일을 담은 정수형 배열 생성, 윤년으로 판단하여 2월은 29일
		int[] k37_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 0부터 1씩 증가하면서 11까지 도는 for문 작성
		// 변수에 +1을 하면 각 월로 사용할수 있다.
		for (int k37_i = 0; k37_i < 12; k37_i++) {
			System.out.printf("\t %2d월\n", k37_i + 1);	//이번달 출력
			System.out.println("=====================");
			System.out.printf(" 일 월 화 수 목 금 토\n");	//요일 목록 출력
			// 달마다 1일의 위치를 설정해주는 for문
			// k37_iWeekday의 크기 만큼 실행한다.
			for (int k37_j = 0; k37_j < k37_iWeekday; k37_j++) {
				System.out.printf("   ");
			}
			// 일 출력, 1일부터 각달의 말일까지 1씩 증가시키며 출력
			// 하루 지날때마다 k37_iWeekday에 1을 더한다.
			for (int k37_j = 1; k37_j <= k37_iEnd[k37_i]; k37_j++, k37_iWeekday++) {
				// k37_iWeekday 가 7로 나눠졌을 때 나머지가 6이면(토요일이면)
				// 날짜를 입력하고 줄바꿈을 실시, k37_iWeekday 초기화(일요일로 바껴서)
				if (k37_iWeekday % 7 == 6) {
					System.out.printf(" %2d\n", k37_j);
					// 6에서 7뺀 -1로 리셋해줘야 7개씩 잘 정렬된다.
					k37_iWeekday = -1;	
				} else {	// 토요일이 아니면 날짜 출력
					System.out.printf(" %2d", k37_j);
				}
			}
			System.out.println("");	//한달이 끝나면 줄바꿈 실시
		}

	}
}
