package javajump7;

import java.util.Arrays;

public class pg26 {

	public static void main(String[] args) {
		// pg26 Ŭ�����迭
		int k37_iPerson = 5;	//�ο��� ���������� �Է� 5��

		
		
		pg26_OneRec [] k37_inData = new pg26_OneRec[k37_iPerson];
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("����%02d", k37_i);	//���ڿ� �̸����� (���� + �ѹ��� ����)
			//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
			int k37_kor = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			int k37_eng = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			int k37_mat = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����
			k37_inData[k37_i] = new pg26_OneRec(k37_name,k37_kor,k37_eng,k37_mat);

			//��ȣ, �ٸ� Ŭ�������� ����� �迭���� �ʿ��� ��, ��Ŀ� ���缭 ���, �л��� ����, ���� ���
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", k37_i,
					k37_inData[k37_i].k37_getName(), k37_inData[k37_i].k37_getKor(),k37_inData[k37_i].k37_getEng(),
					k37_inData[k37_i].k37_getMat(),k37_inData[k37_i].k37_getSum(), k37_inData[k37_i].k37_getAve());

		}
		
		
	}

}
