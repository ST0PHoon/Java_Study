package ifforwhile;

public class pt4 {

	public static void main(String[] args) {
		// 15pg �ܼ���
		int k37_iA, k37_iB;		// ������ ���� k37_iA�� k37_iB�� �����մϴ�
		
		k37_iA = 0;	//k37_iA�� 0�� �Է��մϴ�.
		
		while (true) {	//while�� �ۼ� ()�� true�� ������ ���ѷ���
			
			k37_iB = 0;	//k37_iB�� 0�� �Է��մϴ�. �Ʒ� while���� �����ϱ� ���� �ʱ�ȭ�� ��ɵ� ������ �ֽ��ϴ�.
			while(true) {	//while�� �ۼ� ()�� true�� ������ ���ѷ���
				System.out.printf("*");		//*�� ����մϴ�.
				
				if(k37_iA == k37_iB) break;		//���� ������ Ż��, �װ� �ƴ϶�� k37_iB�� 1�� �߰��մϴ�.
				k37_iB++;
			}
			System.out.println();	//�ٹٲ� ����
			k37_iA++;	//k37_iA�� 1����
			if(k37_iA == 30) break;		//k37_iA�� 30�϶� ����
		}
		//���������� k37_iA�� 0�϶��� * �� ��, 1�ϋ��� k_iB�� 0 1�� �����Ƿ� * �� ���� ��� �ٹٲ� ... k37_iA �� 29�϶����� �����ϰ� 30���� �ٲ�鼭
		//������ �׸��Ӵϴ�. 1���� 30���� ���� 1���� �÷����� �ٹٲ��ϸ� ���� ����ϴ�.
	}

}