package bills;

public class pt3 {

	public static void main(String[] args) {
		int k37_ii = 1000 / 3; // ������ ���� k37_ii�� 1000 / 3 �Է� (333)
		System.out.printf("#3 - 1 : %d\n", k37_ii); //k37_ii ���

		k37_ii = 1000 % 3; // ������ ���� k37_ii�� 1000 % 3 �Է� (1)
		System.out.printf("#3 - 2 : %d\n", k37_ii); //k37_ii ���

		// for �� 0 ���� 19���� ����.
		for (int k37_i = 0; k37_i < 20; k37_i++) {
			System.out.printf("#3-3 : %d ", k37_i); //k37_i ���

			if (((k37_i + 1) % 5) == 0) { // 5��°���� �ٹٲ�
				System.out.printf("\n");
			}
		}
	}

}
