package bills;

public class pt2 {

	public static void main(String[] args) {
		int k37_sum; // k37_sum �������� ������ ���� ����
		
		k37_sum = 0; // k37_sum�� 0 �Է�
		
		//1���� 100���� for�� ������
		for (int k37_i = 1; k37_i < 101; k37_i++) {
			k37_sum = k37_sum + k37_i; //k37_sum�� k37_i�� �����ؼ� ���ϱ� 
		}
		
		System.out.printf("#2 : %d\n", k37_sum); // k37_sum�� ���
		
		System.out.printf("#2-2 : %d\n", k37_sum/100); //k37_sum�� ��� ���ϱ�
		
		
		int[] k37_v = {1,2,3,4,5}; // k37_v ������ �迭�� 1 2 3 4 5 �� �Է�
		int k37_vSum; //k37_vSum ������ ���� ����
		
		k37_vSum = 0; // k37_vSum�� 0 �Է�
		
		//0���� 4���� ���� (�迭�� ���̸�ŭ) for�� �ۼ�
		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_vSum = k37_vSum + k37_v[k37_i]; //�迭�� �ִ� �� ���ϱ�
		}
		
		System.out.printf("#2-3 : %d\n", k37_vSum); // k37_vSum ���
	}
}
