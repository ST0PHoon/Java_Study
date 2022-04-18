package javajump5;

public class pg6 {

	public static void main(String[] args) {
		// pg6
		int k37_iWeekday = 5;
		int[] k37_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int k37_iMon = 0; k37_iMon < 12; k37_iMon++) {
			System.out.printf("\t %2d월\n", k37_iMon + 1);
			System.out.printf("=====================\n");
			System.out.printf(" 일 월 화 수 목 금 토\n");
			for (int k27_j = k37_iWeekday; k27_j > 0; k27_j--) {
				System.out.printf("   ");
			}
			for (int k37_i = 1; k37_i <= k37_iEnd[k37_iMon]; k37_i++, k37_iWeekday++) {
				if (k37_iWeekday % 7 == 6) {
					System.out.printf("%3d\n", k37_i);
					k37_iWeekday = k37_iWeekday - 7;
				} else {
					System.out.printf("%3d", k37_i);
				}
			}
			System.out.printf("\n\n");
		}

	}
}
