package javajump5;

public class pg6 {

	public static void main(String[] args) {
		// pg6
		//������ ����(5�� �ݿ��Ͽ��� ����)
		//1��1���� �ݿ��Ϸ� ��� �޷�
		int k37_iWeekday = 5;	
		// �� ���� ������ ���� ������ �迭 ����, �������� �Ǵ��Ͽ� 2���� 29��
		int[] k37_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 0���� 1�� �����ϸ鼭 11���� ���� for�� �ۼ�
		// ������ +1�� �ϸ� �� ���� ����Ҽ� �ִ�.
		for (int k37_i = 0; k37_i < 12; k37_i++) {
			System.out.printf("\t %2d��\n", k37_i + 1);	//�̹��� ���
			System.out.println("=====================");
			System.out.printf(" �� �� ȭ �� �� �� ��\n");	//���� ��� ���
			// �޸��� 1���� ��ġ�� �������ִ� for��
			// k37_iWeekday�� ũ�� ��ŭ �����Ѵ�.
			for (int k37_j = 0; k37_j < k37_iWeekday; k37_j++) {
				System.out.printf("   ");
			}
			// �� ���, 1�Ϻ��� ������ ���ϱ��� 1�� ������Ű�� ���
			// �Ϸ� ���������� k37_iWeekday�� 1�� ���Ѵ�.
			for (int k37_j = 1; k37_j <= k37_iEnd[k37_i]; k37_j++, k37_iWeekday++) {
				// k37_iWeekday �� 7�� �������� �� �������� 6�̸�(������̸�)
				// ��¥�� �Է��ϰ� �ٹٲ��� �ǽ�, k37_iWeekday �ʱ�ȭ(�Ͽ��Ϸ� �ٲ���)
				if (k37_iWeekday % 7 == 6) {
					System.out.printf(" %2d\n", k37_j);
					// 6���� 7�� -1�� ��������� 7���� �� ���ĵȴ�.
					k37_iWeekday = -1;	
				} else {	// ������� �ƴϸ� ��¥ ���
					System.out.printf(" %2d", k37_j);
				}
			}
			System.out.println("");	//�Ѵ��� ������ �ٹٲ� �ǽ�
		}

	}
}
