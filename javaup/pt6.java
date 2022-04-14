package bills;

public class pt6 {

	public static void main(String[] args) {
		int k37_val = 271;	//k37_val �������� ������ ���� ���� ��, 271 �Է�
		int k37_rate = 3;	//k37_rate �������� ������ ���� ���� ��, 3 �Է�

		int k37_tax = taxcal(k37_val, k37_rate);	//������ ���� k37_tax�� �Լ��� taxcal�� ���� �� �Է�, �Լ��� k37_val, k37_rate�� �޴´�.

		System.out.printf("*************************************\n");
		System.out.printf("*          �ܼ� ���� ���           *\n");
		System.out.printf("���� ���� ���: %f\n", k37_val * k37_rate / 100.0);	//���� ���� ���, �Ǽ������� �Է��ϱ� ����, 100.0�� ���

		// ��������, ����, ������ ������ ���信 �°� ���(������)
		System.out.printf("��������: %d ����: %d �����԰���: %d\n", k37_val, k37_tax, k37_val + k37_tax);

		System.out.printf("**************************************");
	}
	//public static �Լ� ����, ���������� ���� 2���� �޾ƿ��� ������ ���� �����Ѵ�.
	public static int taxcal(int k37_val, int k37_rate) {
		int ret;	//������ ���� ret ����
		//val �� rate�� �Ǽ������� ����� ���� ���������� ����� ���� ����(�������� ������)���� ������ �ø� ó���ϴ� if��
		if ((double) k37_val * (double) k37_rate / 100.0 == k37_val * k37_rate / 100) {
			ret = k37_val * k37_rate / 100;
		} else {
			ret = k37_val * k37_rate / 100 + 1;
		}
		// �ᱣ�� ret�� �������ִ� �Լ�
		return ret;
	}
}
