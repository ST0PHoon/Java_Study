package javajump5;

public class pg4 {

	public static void main(String[] args) {
		// pg4
		// 1부터 3씩증가하여 7까지 도는 for문 작성, 한줄 내려갈 때마다 3 증가하므로 +3
		for (int k37_i = 1; k37_i < 10; k37_i = k37_i + 3) {
			System.out.printf("*******************\t*******************\t*******************\n");
			//각줄에 1 2 3, 4 5 6, 7 8 9단씩 나오게 세팅
			System.out.printf(" 구구단 %d 단      \t 구구단 %d 단      \t 구구단 %d 단      \n", k37_i, k37_i + 1, k37_i + 2);
			System.out.printf("*******************\t*******************\t*******************\n");
			//각 단별로 단수, 1 ~ 9, 1 ~ 9까지 곱한 값을 출력
			for (int k37_j = 1; k37_j < 10; k37_j++) {
				System.out.printf(" %d * %d = %d      \t %d * %d = %d      \t %d * %d = %d      \n", k37_i, k37_j, k37_j * k37_i, k37_i + 1,
						k37_j, (k37_i + 1) * k37_j, k37_i + 2, k37_j, (k37_i + 2) * k37_j);
			}

		}

	}

}
