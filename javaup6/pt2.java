package javajump6;

public class pt2 {

	static int k37_iStatic;	//Ŭ���� �ȿ��� �� �� �ִ� ���� ���� ����
	
	public static void main(String[] args) {
		// 5pg ������ �޼���(2)
		int k37_iMain;	//������ ���� ����
		
		k37_iMain = 1;	//������ ������ ������ 1 �Է�
		k37_iStatic = 1;	//���������� 1 �Է�
		
		//�޼ҵ� ȣ�� ��, ���������� ������ ���� ����Ͽ� �� ��( ���� 1 ��� ����)
		System.out.printf("******************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> k37_iStatic=[%d]\n",k37_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> k37_iMain=[%d]\n",k37_iMain);
		System.out.printf("******************************************\n");

		k37_add(k37_iMain);	//k37_add�޼ҵ� ����, ���������� ������ ������ �� 1�� �����ϰ� �ش� �޼����� �� ���
		//add�޼ҵ忡���� ���ϰ��� ��� ���� �ڵ忡��  ���������� ���ڸ� 1 �����Ѵ�. ���� �޼��� ���
		System.out.printf("******************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> k37_iStatic=[%d]\n",k37_iStatic);	//(2)
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> k37_iMain=[%d]\n",k37_iMain);	//(1)
		System.out.printf("******************************************\n");
		//�޼ҵ� ����
		k37_iMain = k37_add2(k37_iMain);
		//���ϰ��� ���� k37_iMain�� 1�þ ���� �޾Ҵ�.
		System.out.printf("******************************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> k37_iStatic=[%d]\n",k37_iStatic);	//�������� ���(3)
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> k37_iMain=[%d]\n",k37_iMain);	//k37_iMain ���(2)
		System.out.printf("******************************************\n");
	}
	
	//k37_add�޼ҵ� ����, ���������� ������ ������ �� 1�� �����ϰ� �ش� �޼����� �� ���
	public static void k37_add (int k37_i) {
		k37_iStatic++;	//(1 > 2)
		k37_i++;	//(1 > 2) ������ ����
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n",k37_iStatic);	//�������� ���� �޼��� ���
		System.out.printf("add�޼ҵ忡��->i=[%d]\n",k37_i);	//k37_i�������� ���� �޼��� ���
	}
	// ������ ������ �ް� ������ ���� �����ϴ� �޼ҵ� ����
	public static int k37_add2 (int k37_i) {
		k37_iStatic++;	//�������� 1���� (3)
		k37_i++;		//k37_iMain�� �޾ƿ� 1���� (2)
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n",k37_iStatic);	//�������� ���� �޼��� ���
		System.out.printf("add�޼ҵ忡��->i=[%d]\n",k37_i);	//k37_i�������� ���� �޼��� ���
		return k37_i;
	}

}
