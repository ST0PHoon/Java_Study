package javajump6;

public class pt13 {

	public static void main(String[] args) {
		// 38pg ReportSheet, Ŭ���� �����
		int k37_iPerson = 10;
		
		pt13_InputData k37_inData = new pt13_InputData(k37_iPerson);
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("����%02d", k37_i);
			int k37_kor = (int)(Math.random() * 100);	// �������� �����
			int k37_eng = (int)(Math.random() * 100);	// �������� �����
			int k37_mat = (int)(Math.random() * 100);	// �������� �����
			k37_inData.k37_SetDate(k37_i,k37_name,k37_kor,k37_eng,k37_mat);
		}
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					k37_i, k37_inData.k37_name[k37_i], k37_inData.k37_kor[k37_i], k37_inData.k37_eng[k37_i],
					k37_inData.k37_mat[k37_i], k37_inData.k37_sum[k37_i], k37_inData.k37_ave[k37_i]);
		}
	}

}
