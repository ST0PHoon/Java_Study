package bills;

public class pt4 {

	public static void main(String[] args) {
		int k37_ii = 12345; // k37_ii ������ ������ 12345�Է�
		int k37_j = (k37_ii/10) * 10; // k37_ii ���� 10���� ����
		System.out.printf("#4-1: %d\n", k37_j); //k37_j�� ���
		
		k37_ii = 12345; //k37_ii ������ ������ 12345�Է�
		k37_j = ((k37_ii+5)/10)*10; //k37_j�� k37_ii �ݿø��� �� �Է�
		
		System.out.printf("#4-2: %d\n", k37_j); //k37_j�� ���
		
		k37_ii= 12344; //k37_ii ������ ������ 12344�Է�
		k37_j = ((k37_ii+5)/10)*10; //k37_j�� k37_ii �ݿø��� �� �Է�
		
		System.out.printf("#4-2: %d\n", k37_j); //k37_j�� ���

	}

}
