package javajump7;

public class pg10 {

	public static void main(String[] args) {
		// 10pg �ѱ۰��
		System.out.printf("k37_HanBlankForeword[%s]\n", k37_HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("k37_HanBlankForeword[%s]\n", k37_HanBlankForeword("�ѱ��ѱ�abcd", 15));
		System.out.printf("k37_HanBlankBackword[%s]\n", k37_HanBlankBackword("�ѱ�abcd", 15));
		System.out.printf("k37_HanBlankBackword[%s]\n", k37_HanBlankBackword("�ѱ��ѱ�abcd", 15));
		System.out.printf("�ѱ��� [%d]��\n", k37_HanCount("�ѱ��ѱ�aa"));
		
	}
	
	public static String k37_HanBlankForeword(String k37_Han, int k37_totalLength) {
		String k37_outString = "";	//�� ���ڿ� ����, ��� ���Ͽ�
		// ���̸� �����ϸ� ���ڿ�(���� �ѱ�:2,����:1)
		byte[] k37_byte = k37_Han.getBytes();
		//0���� 1�������ϸ� �� ���� - (�ѱ� �� *2 + ���� ��) ������ ���� for�� ����
		for (int k37_i = 0; k37_i < k37_totalLength - k37_byte.length; k37_i++) {
			// k37_totalLength ���̸� ���߱� ���� ���� ����
			k37_outString = k37_outString + " ";
		}
		//���� �ڿ� ���ڿ��� ���δ�.
		return k37_outString + k37_Han;
	}
	
	public static String k37_HanBlankBackword(String k37_Han, int k37_totalLength) {
		String k37_outString = "";	//�� ���ڿ� ����, ��� ���Ͽ�
		byte[] k37_byte = k37_Han.getBytes();	// �ѱ��� ������ ������ �� ���
		//0���� 1�������ϸ� �� ���� - (�ѱ� �� *2 + ���� ��) ������ ���� for�� ����
		for (int k37_i = 0; k37_i < k37_totalLength - k37_byte.length; k37_i++) {
			// k37_totalLength ���̸� ���߱� ���� ���� ����
			k37_outString = k37_outString + " ";
		}
		//���� �տ� ���ڿ��� ���δ�.
		return k37_Han + k37_outString;
	}
	
	// �ѱ��� ������ ����ϴ� �޼ҵ�
	public static int k37_HanCount(String k37_Han) {
		// �̷��� ����� k37_byte�� ���̸� �����ϸ�
		// �ѱ��� 2, ����� 1��ŭ �����Ѵ�.
		byte[] k37_byte = k37_Han.getBytes();
		// (�ѱ� ���� * 2 + ���� ����) - (�ѱ� ���� + ���� ����)
		// �Ʒ� ���� ����ϸ� �ѱ��� ������ ��µȴ�.
		return k37_byte.length - k37_Han.length();
	}

}
