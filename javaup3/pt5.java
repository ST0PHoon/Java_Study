package bills;

public class pt5 {

	public static void main(String[] args) {

		int k37_MyVal = 14 / 5; // k37_MyVal ������ ������ 14/5(2) ����
		// �̰��� 2.8 �̴�. �Ҽ��� ���� ������ 2, �ݿø��ϸ� 3�̴�.
		System.out.printf("#5-1 : %d\n", k37_MyVal);
		// �Ӹ��� ���� ������ �Ǽ��� (float, double ���·� ����ȯ) ����� ���� 0.5�� ���Ѵ��� 1 // ������ ����ȯ�� �ϸ�
		// �ݿø�ó���� �ȴ�. 1 // �Ǽ� (Real number) �� ���� �𸣸� ����������, ���� �� �ߵ� ����å �� ���� ����
		
		double k37_MyValF; // k37_MyValF �Ǽ��� ����
		k37_MyValF = 14 / 5; // k37_MyValF �Ǽ��� ������ 14/5
		System.out.printf("#5-2 : %f\n", k37_MyValF); // k37_MyValF ���
		
		// �Ҽ��� ����
		k37_MyValF = 14.0 / 5; // �Ѱ��ϵ� �Ǽ������� ǥ�ø� �ؾ� ����� �Ǽ��� ���´�.
		System.out.printf("#5-3 : %f\n", k37_MyValF); // k37_MyValF ���
		
		k37_MyValF = (14.0) / 5 + 0.5; // �Ǽ��� ��꿡�� 0.5�� ���غ���
		System.out.printf("#5-4 : %f\n", k37_MyValF); // k37_MyValF ���
		
		k37_MyVal = (int) ((14.0) / 5 + 0.5); // �Ǽ��� ����� �ϰ� ������ ����ȯ�� ����.
		System.out.printf("#5-5 : %d\n", k37_MyVal); // k37_MyVal ���

	}

}
