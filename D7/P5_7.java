package Main;

public class P5_7 {

	public static void main(String[] args) {
		
		int[][] score = { { 70, 80, 100 }, { 60, 70, 86 }, { 54, 100, 82 }, { 87, 95, 79 } };
		
		int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		//�л���
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
			System.out.println("�л�" + (i + 1) + " - �� : " + sum + "��, ��� : " + sum / score.length + "��, �ִ� : " + max
					+ "��, �ּ� : " + min + "��");

			sum = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}

		System.out.println("");
		
		//����
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
			System.out.println("����" + (i + 1) + " - �� : " + sum + "��, ��� : " + sum / score.length + "��, �ִ� : " + max
					+ "��, �ּ� : " + min + "��");

			sum = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}

	}

}
