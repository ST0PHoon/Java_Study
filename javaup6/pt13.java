package javajump6;

public class pt13 {

	public static void main(String[] args) {
		// 38pg ReportSheet, Ŭ���� �����
		int k37_iPerson = 10;	//�ο��� ���������� �Է� 10��
		//�ٸ� Ŭ���� k37_inData�� ����
		pt13_InputData k37_inData = new pt13_InputData(k37_iPerson);
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("����%02d", k37_i);	//���ڿ� �̸����� (���� + �ѹ��� ����)
			//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
			int k37_kor = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			int k37_eng = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			int k37_mat = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����
			k37_inData.k37_SetDate(k37_i,k37_name,k37_kor,k37_eng,k37_mat);	
		}
		// ���� �ο��� ��ŭ �����ϴ� for�� ����
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			// ��ȣ, �ٸ� Ŭ�������� ����� �迭���� �ʿ��� ��, ��Ŀ� ���缭 ���, �л��� ����, ���� ���
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					k37_i, k37_inData.k37_name[k37_i], k37_inData.k37_kor[k37_i], k37_inData.k37_eng[k37_i],
					k37_inData.k37_mat[k37_i], k37_inData.k37_sum[k37_i], k37_inData.k37_ave[k37_i]);
		}
	}

}
