package javajump6;

public class pt5 {
	// 8pg Ŭ����, ��ü, �ν��Ͻ�(2)
	private static int k37_inVal;	//private(���� Ŭ���������� ���) ����� static ������ ���� ����
	public static void up() {	//public ����� static �Լ� ����, ���ϰ� ����
		k37_inVal++;	// �ش� ������ ���� 1 ����
		System.out.printf("���� �׳� �޼ҵ�[%d]\n",k37_inVal);	// ���信 ���缭 �޼��� ���
	}
	
	public static void main(String[] args) {
		k37_inVal = 0;	//�ش� ������ 0 �Է�
		pt4 elev;	//pt4Ŭ������ elev�� ����
		
		elev = new pt4();	//elev�� pt4Ŭ���� �Է�
		
		up();	//���� ������ up �޼ҵ� ����
		for(int i = 0; i < 10; i++) {	//0���� 1�������ϸ� 9���� ���� for�� �ۼ�
			elev.k37_up();	// pt4�� �ִ� k37_up() �޼ҵ� ����
			// pt4�� k37_help ���ڿ� ������ ���信 ���� ���
			System.out.printf("MSG[%s]\n",elev.k37_help);	
		}
		
		for(int i = 0; i < 10; i++) {	//0���� 1�������ϸ� 9���� ���� for�� �ۼ�
			elev.k37_down();	// pt4�� �ִ� k37_down() �޼ҵ� ����
			// pt4�� k37_help ���ڿ� ������ ���信 ���� ���
			System.out.printf("MSG[%s]\n",elev.k37_help);
		}

	}

}
