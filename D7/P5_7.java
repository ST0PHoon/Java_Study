package Main;

public class P5_7 {

	public static void main(String[] args) {
		
		int[][] score = { { 70, 80, 100 }, { 60, 70, 86 }, { 54, 100, 82 }, { 87, 95, 79 } };
		
		int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		//학생별
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];

				if (score[i][j] > max) {
					max = score[i][j];
				}

				if (score[i][j] < min) {
					min = score[i][j];
				}
			}
			System.out.println("학생" + (i + 1) + " - 합 : " + sum + "점, 평균 : " + sum / score.length + "점, 최대 : " + max
					+ "점, 최소 : " + min + "점");

			sum = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}

		System.out.println("");
		
		//과목별
		for (int i = 0; i < score[0].length; i++) {
			for (int j = 0; j < score.length; j++) {
				sum += score[j][i];

				if (score[j][i] > max) {
					max = score[j][i];
				}

				if (score[j][i] < min) {
					min = score[j][i];
				}
			}
			System.out.println("과목" + (i + 1) + " - 합 : " + sum + "점, 평균 : " + sum / score.length + "점, 최대 : " + max
					+ "점, 최소 : " + min + "점");

			sum = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}

	}

}
