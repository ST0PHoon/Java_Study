package javajump5;

public class pg4 {

	public static void main(String[] args) {
		// pg4
		// 1���� 3�������Ͽ� 7���� ���� for�� �ۼ�, ���� ������ ������ 3 �����ϹǷ� +3
		for (int k37_i = 1; k37_i < 10; k37_i = k37_i + 3) {
			System.out.printf("*******************\t*******************\t*******************\n");
			//���ٿ� 1 2 3, 4 5 6, 7 8 9�ܾ� ������ ����
			System.out.printf(" ������ %d ��      \t ������ %d ��      \t ������ %d ��      \n", k37_i, k37_i + 1, k37_i + 2);
			System.out.printf("*******************\t*******************\t*******************\n");
			//�� �ܺ��� �ܼ�, 1 ~ 9, 1 ~ 9���� ���� ���� ���
			for (int k37_j = 1; k37_j < 10; k37_j++) {
				System.out.printf(" %d * %d = %d      \t %d * %d = %d      \t %d * %d = %d      \n", k37_i, k37_j, k37_j * k37_i, k37_i + 1,
						k37_j, (k37_i + 1) * k37_j, k37_i + 2, k37_j, (k37_i + 2) * k37_j);
			}

		}

	}

}
