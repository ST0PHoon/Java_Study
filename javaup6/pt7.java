package javajump6;

public class pt7 {

	public static void main(String[] args) {
		// 10pg �޼ҵ� �����ε�
		pt7_cal k37_cal = new pt7_cal();	//���� package�� �ִ� pt7_cal Ŭ���� ����
		//sum(int k37_a, int k37_b) ���
		System.out.printf("2�� ������ ȣ��� [%d]\n", k37_cal.k37_sum(1, 2));
		//sum(int k37_a, int k37_b, int k37_c) ���
		System.out.printf("3�� ������ ȣ��� [%d]\n", k37_cal.k37_sum(1, 2, 3));
		//sum(int k37_a, int k37_b, int k37_c, int k37_d) ���
		System.out.printf("4�� ������ ȣ��� [%d]\n", k37_cal.k37_sum(1, 2, 3, 4));
		//sum(double k37_a, double k37_b) ���
		System.out.printf("double�� ������ ȣ���. [%f]\n", k37_cal.k37_sum(1.3, 2.4));
		
	}

}
