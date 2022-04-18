package javajump5;

public class pg5 {

	public static void main(String[] args) {
		// pg5
		// 1부터 1씩증가하여 3까지 도는 for문 작성
		for (int k37_i = 1; k37_i < 4; k37_i++) {
			System.out.printf("*******************\t*******************\t*******************\n");
			//각줄에 1 4 7, 2 5 8, 3 6 9단씩 나오게 +3, +6 해준다.
			System.out.printf(" 구구단 %d 단      \t 구구단 %d 단      \t 구구단 %d 단      \n", k37_i, k37_i + 3, k37_i + 6);
			System.out.printf("*******************\t*******************\t*******************\n");
			//각 단별로 단수(1, 4, 7 / 2, 5, 8 / 3, 6, 9), 1 ~ 9, 1 ~ 9까지 곱한 값을 출력
			for (int k37_j = 1; k37_j < 10; k37_j++) {
				System.out.printf(" %d * %d = %d      \t %d * %d = %d      \t %d * %d = %d      \n", k37_i, k37_j, k37_j * k37_i, k37_i + 3,
						k37_j, (k37_i + 3) * k37_j, k37_i + 6, k37_j, (k37_i + 6) * k37_j);
			}

		}

	}

}