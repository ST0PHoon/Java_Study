package bills;

public class pt8 {

	public static void main(String[] args) {
		// ���ڿ� �迭 k37_item ����
		String[] k37_item = { "��������", "����������", "ȭ��Ʈ����", "������Ĩ", "��¡����" };
		int[] k37_price = { 1800, 25000, 2600, 1500, 1000 }; // ������ �迭 k37_price ����
		int[] k37_amount = { 2, 1, 1, 3, 2 }; // ������ �迭 k37_amount ����
		double k37_taxRate = 0.1; // �Ǽ��� ���� k37_taxRate ����
		int k37_totalSum = 0; // ������ ���� k37_totalSum ���� �� �ʱⰪ �Է�

		System.out.printf("*****************************************\n");
		System.out.printf("             ��     ��    ��          \n");
		System.out.printf("�� ��\t\t �� ��\t����\t   �� ��\n");

		// k37_item�� ���̸�ŭ ���� for�� ����
		for (int k37_i = 0; k37_i < k37_item.length; k37_i++) {
			int k37_sum = k37_price[k37_i] * k37_amount[k37_i]; // ������ ���� k37_sum�� ���ݰ� ������ ���� �� �߰�
			k37_totalSum = k37_totalSum + k37_sum; // k37_totalSum�� k37_sum �����ؼ� ���� ���� �Է�
			// �迭�� �ִ� ��ǰ, ����, ������ ����� �հ踦 ������Ŀ� ���߼� ������ش�.
			System.out.printf("%s\t%6d\t%3d\t%8d\n", k37_item[k37_i], k37_price[k37_i], k37_amount[k37_i], k37_sum);
		}
		System.out.printf("******************************************\n");
		System.out.printf("���ұݾ� :  %28d\n", k37_totalSum);	//���Ҿ� �� �հ踦 ����Ѵ�.

		// ������ ���� k37_totalNetPrice �� �������� �Է�
		int k37_totalNetPrice = (int) (k37_totalSum / (1 + k37_taxRate));
		System.out.printf("�����ݾ� :  %28d\n", k37_totalNetPrice);

		// ������ ���� k37_tax�� �� ���� - �������� �� �Է�
		int k37_tax = k37_totalSum - k37_totalNetPrice;
		System.out.printf("��    �� :  %28d\n", k37_tax);
	}

}
