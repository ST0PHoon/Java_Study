package javajump5;

public class pg5 {

	public static void main(String[] args) {
		// pg5
		// 1���� 1�������Ͽ� 3���� ���� for�� �ۼ�
		for (int k37_i = 1; k37_i < 4; k37_i++) {
			System.out.printf("*******************\t*******************\t*******************\n");
			//���ٿ� 1 4 7, 2 5 8, 3 6 9�ܾ� ������ +3, +6 ���ش�.
			System.out.printf(" ������ %d ��      \t ������ %d ��      \t ������ %d ��      \n", k37_i, k37_i + 3, k37_i + 6);
			System.out.printf("*******************\t*******************\t*******************\n");
			//�� �ܺ��� �ܼ�(1, 4, 7 / 2, 5, 8 / 3, 6, 9), 1 ~ 9, 1 ~ 9���� ���� ���� ���
			for (int k37_j = 1; k37_j < 10; k37_j++) {
				System.out.printf(" %d * %d = %d      \t %d * %d = %d      \t %d * %d = %d      \n", k37_i, k37_j, k37_j * k37_i, k37_i + 3,
						k37_j, (k37_i + 3) * k37_j, k37_i + 6, k37_j, (k37_i + 6) * k37_j);
			}

		}

	}

}