package ifforwhile;

public class pt5 {

	public static void main(String[] args) {
		// 16pg ������, ������ ��
		int k37_ii;		//������ ���� k37_ii ����
		double k37_iD;	//�Ǽ��� ���� k37_iD ����
		
		k37_ii = 10/3;	//�ش� ������ 10/3�� ������ ���� �Է��մϴ�. (�������̹Ƿ� 3)
		k37_iD = 10/3.0;	//�ش� ������ 10/3.0�� ������ ���� �Է��մϴ�. (�Ǽ����̹Ƿ� 3.333333.. double�� ������ �ڸ�������)
		
		// if�� ���� �������� �Ǽ����� ���İ� ����� ������ equal�� �ٸ��� �� ���� �������� �Ǽ������� �ٲ㼭 �����ָ� �ٸ��ٰ� �޼��� ���
		if (k37_ii == k37_iD) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n",(double)k37_ii,k37_iD);	//�� ���� �ٸ������� ����
		
		// if�� ���� �Ǽ��� ������ �� ���� 3.333333�� ���İ� �����, ������ equal �ٸ��� 3.333333�� k37_iD�� ���� �ٸ��ٰ� �����ݴϴ�.
		if (k37_iD == 3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", k37_iD);	//��� ���´� ���ƺ������� �ٸ� ������ �ν�
		
		
		k37_iD = (int) k37_iD;	// k37_iD�� ���������� ��ȯ�Ͽ� �ٽ� �Է�
		if (k37_ii == k37_iD) System.out.printf("equal\n");	//�� ���� ������ equal �ٸ��� k37_ii�� ���������� �ٲ㼭 �� ���� 3.333333 ���
		else System.out.printf("Not equal[3.333333][%f][%f]", (double)k37_ii, k37_iD);	//������ ���̹Ƿ� equal�� ��� ����

		
		System.out.printf("int�� �μ� [%d][%f]\n",k37_ii, k37_iD);	//int ������ �� �� ���, 
		System.out.printf("double�� �μ� [%f][%f]\n",(double)k37_ii, k37_iD);	//double������ �� �� ���
		
		
		char a = 'c';	//������ ���� a ���� ��, c�� �Է�
		
		//���ڴ� 1���ڸ� ���� �����ϸ�, ���Ҷ��� ������ �ڷ�� �����ϰ� �Ҽ� �ֽ��ϴ�.
		//if �� ���� a�� ���� b c d�� ��ġ�ϸ� �޼��� ���
		if (a == 'b') System.out.printf("a�� b�̴�\n");
		if (a == 'c') System.out.printf("a�� c�̴�\n");
		if (a == 'd') System.out.printf("a�� d�̴�\n");
		
		String k37_aa = "abcd";	//���ڿ��� ���� k37_aa �� abcd�� �Է��մϴ�.
		
		// ���ڿ��� abcd���� ����� if�� �ۼ�
		if (k37_aa.equals("abcd")) System.out.printf("k37_aa�� abcd�̴�\n");	//���ڿ��� equals �� ���� ��Ȯ�ϰ� �Ȱ����� �� �� �ֽ��ϴ�.
		else System.out.printf("aa�� abcd�� �ƴϴ�\n"); 	//������ ��µ� ������ ����
		
		boolean k37_bb = true;	//������������ boolean�� ���� ���� ��, true�� �Է�
		
		if(!!k37_bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�.\n"); //!�Ѱ��� �������� �ٲٰ� !!�ΰ��� ������ �������� �ٲ㼭 �ٽ� ����
		else System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�.\n");	//������ ��µ� ������ ����
		
		
	}

}
