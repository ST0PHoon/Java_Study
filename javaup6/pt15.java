package javajump6;

public class pt15 {

	public static void main(String[] args) {
		// 40 pg ��������ǥ ���
		int k37_iPerson = 12;		// �� �ο��� �Է�, ������, 200��
		int k37_onepagePerson = 11;	// ���������� ������ �ο��� �Է�, ������, 30��
		//������, k37_iPerson, k37_onepagePerson�� ������ �޴� �޼ҵ� ����, k37_nData�� ���
		pt15_InputData k37_inData = new pt15_InputData(k37_iPerson, k37_onepagePerson);
		//����ð� �����ص� ���信 �°� ����ؼ� ���ڿ��� �Է�
		String k37_time1 = k37_inData.k37_printDate();
		//������ �迭, �� ��������(200)�� ������, �� ���������� ����� ǥ�õ��� ��´�. {30, 30, 30, 30, 30, 30, 20} ���·� ��� ����
		int[] k37_personGroupArray = k37_inData.k37_perPagePerson();
		//�� �������� ��ŭ ���� for�� �ۼ�. 0���� 1�������ϸ� 6���� ����.
		for (int k37_i = 0; k37_i < k37_personGroupArray.length; k37_i++) {
			// �� ������ ���� �����ϴ� ���ڸ� ����, ���� ���° for������(k37_i)�� ������ �޴´�. 1������ 0, 2������ 30 .. ������ 180
			int k37_startNumber = k37_inData.k37_currentStartNumber(k37_i);
			// �ش� �������� �ο��� ��ŭ ���� for�� �ۼ�, ��ҿ� 30��, �������� 20�� ����.
			for (int k37_j = 0; k37_j < k37_personGroupArray[k37_i]; k37_j++) {
				String k37_name = String.format("����%03d", (k37_startNumber + k37_j + 1));	//���ڿ� �̸�����, 1������ �����̶� + 1
				//���� �Լ��� 0�̻� ~ 1�̸��� double�� ���� �������� ����, 0���� 100���̸� ��������� ���ϱ� 100�ǽ�
				int k37_kor = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
				int k37_eng = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
				int k37_mat = (int)(Math.random() * 100);	// �������� �����, double > int ������ ����ȯ
				// ������ ������ ������ �޴� �ٸ� Ŭ������ �޼ҵ�� ����, ���ڿ� 1���� ������ 1������ �����̱� �����̴�.
				k37_inData.k37_SetDate(k37_startNumber + k37_j + 1, k37_name,k37_kor,k37_eng,k37_mat);
			}
			
			System.out.printf("PAGE: %d            ������� : "  + k37_time1 + "\n", k37_i + 1);	//���� ������(0�̶� + 1)�� ��¥�� ����Ѵ�.
			System.out.println("==================================================");
			System.out.printf("%-2.2s %-4.4s %4.4s %5.5s %5.5s %5.5s %4.4s\n","��ȣ","�̸�","����","����","����","����","���");	//���� ���
			System.out.println("==================================================");
			
			// �ش� �������� �ο��� ��ŭ ���� for�� �ۼ�, ��ҿ� 30��, �������� 20�� ����.
			for (int k37_k = 0; k37_k < k37_personGroupArray[k37_i]; k37_k++) {
				// k37_k + k37_startNumber�� ������ ���۹�ȣ + ���� ���������� ���°, �׷� ���� ��ȣ�� �ȴ�.1���� 30, 30 ~ 60 .. 180 ~ 200���� �þ
				// �����迭���� �� ������ �����´�. �迭�̿��� +1�� ��������, �� �迭�� ũ��� 200�̴�.
				System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n",
						k37_inData.k37_i[k37_k + k37_startNumber], k37_inData.k37_name[k37_k + k37_startNumber],
						k37_inData.k37_kor[k37_k + k37_startNumber], k37_inData.k37_eng[k37_k + k37_startNumber],
						k37_inData.k37_mat[k37_k + k37_startNumber], k37_inData.k37_sum[k37_k + k37_startNumber],
						k37_inData.k37_ave[k37_k + k37_startNumber]);
			}
			System.out.println("==================================================");
			
			System.out.println("����������");
			//���� �������� ���� �������� �����ش�. k37_inData Ŭ�������� k37_curSubjectSum �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
			//����� �Ǽ����̱� ������ k37_curAveSum�� �޼ҵ� ���� ����
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�",k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_kor),
					k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_eng), k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_mat),
					k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_sum), k37_inData.k37_curAveSum(k37_i, k37_inData.k37_ave));
			
			//���� �������� ���� ����� �����ش�. k37_inData Ŭ�������� k37_cursubjectAve �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
			//����� �Ǽ����̱� ������ k37_curaveAve�� �޼ҵ� ���� ����
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "���",k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_kor),
					k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_eng), k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_mat),
					k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_sum), k37_inData.k37_curaveAve(k37_i, k37_inData.k37_ave));
			
			System.out.println("==================================================");
			
			//���ݱ��� �������� ���� �������� �����ش�. k37_inData Ŭ�������� k37_totalSubjectSum �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
			//����� �Ǽ����̱� ������ k37_totalAveSum�� �޼ҵ� ���� ����
			System.out.println("����������");
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�",k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_kor),
					k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_eng), k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_mat),
					k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_sum), k37_inData.k37_totalAveSum(k37_i, k37_inData.k37_ave));
			
			//���ݱ��� �������� ���� ����� �����ش�. k37_inData Ŭ�������� k37_totalsubjectAve �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
			//����� �Ǽ����̱� ������ k37_totalaveAve�� �޼ҵ� ���� ����
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "���",k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_kor),
					k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_eng), k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_mat),
					k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_sum), k37_inData.k37_totalaveAve(k37_i, k37_inData.k37_ave));
			
		}


	}

}
