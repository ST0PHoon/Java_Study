package javajump6;


public class pt14 {

	public static void main(String[] args) {
		// 39pg ReportSheet, Ŭ���� �����
		int k37_iPerson = 30;
		
		pt13_InputData k37_inData = new pt13_InputData(k37_iPerson);
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("����%02d", k37_i);
			int k37_kor = (int)(Math.random() * 100);	// �������� �����
			int k37_eng = (int)(Math.random() * 100);	// �������� �����
			int k37_mat = (int)(Math.random() * 100);	// �������� �����
			k37_inData.k37_SetDate(k37_i,k37_name,k37_kor,k37_eng,k37_mat);
		}
		
		String k37_time1 = k37_inData.k37_printDate();

		System.out.println("           ������� :"  + k37_time1);
		System.out.println("=========================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","��ȣ","�̸�","����","����","����","����","���");
		System.out.println("=========================================");
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			System.out.printf("%03d %5.5s %3d   %3d   %3d   %3d   %.2f\n",
					k37_i + 1, k37_inData.k37_name[k37_i], k37_inData.k37_kor[k37_i], k37_inData.k37_eng[k37_i],
					k37_inData.k37_mat[k37_i], k37_inData.k37_sum[k37_i], k37_inData.k37_ave[k37_i]);
		}
		System.out.println("=========================================");
		System.out.printf("%-2.2s        %3d  %3d  %3d  %4d  %.2f\n", "�հ�",k37_inData.k37_subjectSum(k37_inData.k37_kor),
				k37_inData.k37_subjectSum(k37_inData.k37_eng), k37_inData.k37_subjectSum(k37_inData.k37_mat),
				k37_inData.k37_subjectSum(k37_inData.k37_sum), k37_inData.k37_aveSum(k37_inData.k37_ave));
		System.out.printf("%-2.2s       %3.2f %3.2f %3.2f %3.2f  %.2f\n", "���",k37_inData.k37_subjectAve(k37_inData.k37_kor),
				k37_inData.k37_subjectAve(k37_inData.k37_eng), k37_inData.k37_subjectAve(k37_inData.k37_mat),
				k37_inData.k37_subjectAve(k37_inData.k37_sum), k37_inData.k37_aveAve(k37_inData.k37_ave));
	}

}
