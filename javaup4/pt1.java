package ifforwhile;

public class pt1 {

	public static void main(String[] args) {
		// 7pg for��
		int k37_sum = 0;	// ������ ���� k37_sum ���� �� �ʱⰪ 0 �Է�
		
		// 0���� 9���� ���� for�� ���� (
		for(int k37_i = 0; k37_i < 10; k37_i++) {
			
			k37_sum = k37_sum + k37_i; // k37_i�� 0 ���� 1�� �÷����� 9���� k37_sum�� ���Ѵ�
		}
		//k37_sum�� ����Ѵ�.
		System.out.printf("sum %d\n", k37_sum);
		
		// 1���� 9���� ���� for�� ����
		for (int k37_i = 1; k37_i < 10; k37_i++) {
			System.out.printf("************************************\n");
			System.out.printf("             ������ %d ��\n",k37_i);	// ���� ������� ����ϱ� ���� ���� �����
			System.out.printf("************************************\n");
			// 1���� 9���� ���� for�� ����, ������ ���� 
			for (int k37_j = 1; k37_j < 10; k37_j++) {
				//i���� ����, 1~9���� ���� ����, ���� ������ �������� �ϼ��Ѵ�.
				System.out.printf(" %d * %d = %d \n", k37_i, k37_j, k37_i * k37_j);	
			}
		}
	}

}
