package ifforwhile;

public class pt2 {

	public static void main(String[] args) {
		// 4pg if��
		int k37_score = 80;	//������ ���� k37_score ���� �� 80 �Է�
		int k37_num = 1;	//������ ���� k37_num ������ 1 �Է�

		if (k37_score > 60) {	//������ 60�ʰ��� �հ��� if�� �ۼ�
			System.out.println("�հ��Դϴ�.");
		}

		
		if (k37_score > 60)		//������ 60�ʰ��� �հ��� if�� �ۼ�, if���� {}�� ������ ������ ��, �Ʒ� �� �ٸ� �����Ѵ�.
			System.out.println("�հ��Դϴ�.");

		
		if (k37_score > 60) {	//������ 60�� �ʰ��� �հ�, �װ� �ƴ϶�� ���հ��� if�� �ۼ�
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

		
		if (k37_num > 0) {		//k37_num�� ���, ���� Ȥ�� 0������ �Ǵ��ϴ� if�� �ۼ�
			System.out.println("��� �Դϴ�.");
		} else if (k37_num < 0) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("0 �Դϴ�.");
		}

		
		if (k37_score >= 90) {		// k37_score ���� ���� ����� ������ if�� �ۼ�, 90�̻� A, 80�̻� 90�̸� B, 70�̻� 80�̸� C, �� �Ʒ� F
			System.out.println("A���");
		} else if (k37_score >= 80) {
			System.out.println("B���");
		} else if (k37_score >= 70) {
			System.out.println("C���");
		} else {
			System.out.println("F���");
		}

	}

}
