package javajump6;


public class pt14 {

	public static void main(String[] args) {
		// 39pg ReportSheet, Ŭ���� �����
		int k37_iPerson = 30;	//������ ������ 30�� �Է�, �ο��� �뵵
		//�ٸ� Ŭ���� k37_inData�� ����
		pt13_InputData k37_inData = new pt13_InputData(k37_iPerson);
		
		//����ð� �����ص� ���信 �°� ����ؼ� ���ڿ��� �Է�
		String k37_time1 = k37_inData.k37_printDate();
		//�� �ο��� ��ŭ ���� for�� �ۼ�. 0���� 1�������ϸ� 29���� ����.
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("����%02d", k37_i);	//���ڿ� �̸����� (���� + �ѹ��� ����)
			//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
			int k37_kor = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			int k37_eng = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			int k37_mat = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
			// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����
			k37_inData.k37_SetDate(k37_i,k37_name,k37_kor,k37_eng,k37_mat);	
		}
		


		System.out.println("           ������� :"  + k37_time1);	// ������ڸ� ��ܿ� ���
		System.out.println("=========================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","��ȣ","�̸�","����","����","����","����","���");	//��ȣ, �̸�, ����, ���� �޴���
		System.out.println("=========================================");
		//�ο��� ��ŭ ���� for�� �ۼ� 0���� 1�������ϸ� 29���� ����
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			// ������ Ŭ�������� �迭�� ����� ������ for���� ���� ����Ѵ�. (�ο��� ������ ����, ����� ���ٷ� ���
			System.out.printf("%03d %5.5s %3d   %3d   %3d   %3d   %.2f\n",
					k37_i + 1, k37_inData.k37_name[k37_i], k37_inData.k37_kor[k37_i], k37_inData.k37_eng[k37_i],
					k37_inData.k37_mat[k37_i], k37_inData.k37_sum[k37_i], k37_inData.k37_ave[k37_i]);
		}
		System.out.println("=========================================");
		//���� ������ �����ֱ����� �ٸ�Ŭ������ �żҵ忡 ���� ���� �迭�� �Է°����� �Է��ϰ�, ����� ���Ϲ޾� ���信 �°� ����Ѵ�.
		System.out.printf("%-2.2s        %3d  %3d  %3d  %4d  %.2f\n", "�հ�",k37_inData.k37_subjectSum(k37_inData.k37_kor),
				k37_inData.k37_subjectSum(k37_inData.k37_eng), k37_inData.k37_subjectSum(k37_inData.k37_mat),
				k37_inData.k37_subjectSum(k37_inData.k37_sum), k37_inData.k37_aveSum(k37_inData.k37_ave));
		//���� ����� �����ֱ����� �ٸ�Ŭ������ �żҵ忡 ���� ���� �迭�� �Է°����� �Է��ϰ�, ����� ���Ϲ޾� ���信 �°� ����Ѵ�.
		System.out.printf("%-2.2s       %3.2f %3.2f %3.2f %3.2f  %.2f\n", "���",k37_inData.k37_subjectAve(k37_inData.k37_kor),
				k37_inData.k37_subjectAve(k37_inData.k37_eng), k37_inData.k37_subjectAve(k37_inData.k37_mat),
				k37_inData.k37_subjectAve(k37_inData.k37_sum), k37_inData.k37_aveAve(k37_inData.k37_ave));
	}

}
