package javajump6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pt15_InputData {
	// ����� ������ ����
	int k37_totalPerson;	// ���ο���
	int k37_pgPerson;	// ������ �� �ο���
	int [] k37_i;	// ��� ��ȣ
	String [] k37_name;	// ��� �̸�
	int [] k37_kor;	// �����
	int [] k37_eng;	// �����
	int [] k37_mat;	// ���м���
	int [] k37_sum;	// �л��� ������ ��
	double [] k37_ave;	//�л��� ���
	int[] k37_personGroupArray;	//�������� �ο��� ���� ������ �迭
	
	pt15_InputData(int k37_iPerson, int k37_onepagePerson) {	//������, ���ο��� �������� �ο��� �޾ƿ´�.
		//�޾ƿ� ���ο����� �迭�� ũ�⸦ �Է��Ѵ�.
		k37_totalPerson = k37_iPerson;
		k37_pgPerson = k37_onepagePerson;
		k37_i = new int[k37_iPerson];
		k37_name = new String[k37_iPerson];
		k37_kor = new int[k37_iPerson];
		k37_eng = new int[k37_iPerson];
		k37_mat = new int[k37_iPerson];
		k37_sum = new int[k37_iPerson];
		k37_ave = new double[k37_iPerson];
		// ������ ���� 200/30 = 6(int) +1�� �ؼ� �� 7�������� �����ش�. �ο����� �� ���� �������� �������� �߰��� �ʿ����.
		if (k37_iPerson % k37_onepagePerson == 0) {
			k37_personGroupArray = new int[(k37_iPerson / k37_onepagePerson)];
		} else {
			k37_personGroupArray = new int[(k37_iPerson / k37_onepagePerson) + 1];
		}
	}
	
	public String k37_printDate() {	//���� �ð��� ���信 �°� �����ϴ� �޼ҵ�, ���ڿ�
		//�ð��� ���¸� ¥�д�.
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		//����ð��� �����´�.
		Date k37_time = new Date();
		//������ ���ڿ��� ���信 ���� �ð��� �Է��Ѵ�.	
		String k37_time1 = format1.format(k37_time);
		
		return k37_time1;	//�Է��� �ð����ڿ��� ����
	}
	
	public int[] k37_perPagePerson() {	// �� ������ ���� ����� �ִ��� �Է��Ͽ� ������ �迭�� �����Ѵ�.
		// �迭�� ũ�⸸ŭ ����, 0���� 1�������ϸ� 6����
		for (int k37_i = 0; k37_i < k37_personGroupArray.length ; k37_i++) {
			if (k37_i == k37_personGroupArray.length - 1 ) {	// ���������̶��, �������� �ο����� ���� �������� �־��
				k37_personGroupArray[k37_i] = k37_totalPerson % k37_pgPerson;	//20 �� ����
			} else {	//�װ� �ƴ϶�� �������� �ο��� �� �־��
				k37_personGroupArray[k37_i] = k37_pgPerson;
			}
		}
		return k37_personGroupArray;	// �ۼ��� �迭�� �����Ѵ�.
	}
	
	//������ ���� �����ο��� ���ڸ� ���Ͽ� ���������� �����ϴ� �޼ҵ�
	public int k37_currentStartNumber(int k37_ii) {	//ù�������� 0, �ι�°�� 1... �̷������� ������ �޾ƿ´�.
		int k37_startNum = 0;	// ����� �������� ù ��ȣ�� ���� ����
		//������������ -1 ��ŭ ���� for�� �ۼ�, 1�������� 0��, 2�������� 1��, ... 7�������� 6��
		for (int k37_i = 0; k37_i < k37_ii; k37_i++) {
			// ù������ 0, 2������ 30, 3������ 60, ... ������������ 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		return k37_startNum;	//������ ���� ����
	}
	
	//�޾ƿ� �̸��� ���� ������ �� �迭�� ����ִ� �޼ҵ�, �Ű������� k37_���̸� �迭��� �������� ����
	public void k37_SetDate(int i, String name, int kor, int eng, int mat) {
		k37_i[i - 1] = i;	// ��ȣ �Է�, �迭�̶� -1
		k37_name[i - 1] = name;	// �̸� �Է�
		k37_kor[i - 1] = kor;	// ���� �Է�
		k37_eng[i - 1] = eng;	// ���� �Է�
		k37_mat[i - 1] = mat;	// ���� �Է�
		k37_sum[i - 1] = kor + eng + mat;	//���� �� �Է�
		k37_ave[i - 1] = k37_sum[i - 1] / 3.0; //3�����̰� double���̱� ������ 3.0���� ǥ��
	}
	
	//���� �������� ���� ���� ���� ���ϴ� �޼ҵ�, ���������� -1 �� ������, ���� ���� �迭�� �����´�.
	public int k37_curSubjectSum(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_startNum = 0;	//�հ� ���۹�ȣ�� ���� ���� ����
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� �ش� ������ ���� ���Ѵ�.
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//������ �� ����
	}
	
	// �� �޼ҵ�� �Ȱ��� ����, ����� ���� double �迭�� �ް� double�� ������ ����ؼ� ���� ����
	public double k37_curAveSum(int k37_cycNumber, double[] k37_array) {
		//�հ� ���۹�ȣ�� ���� ���� ����
		double k37_sum = 0;	
		int k37_startNum = 0;
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//�Ǽ��� �� ����
	}
	
	//���� �������� ����� ���ϴ� �޼ҵ�, ���������� -1 �� ������, ���� ���� �迭�� �����´�. ����̶� double������ ����
	public double k37_cursubjectAve(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_startNum = 0;	//�հ� ���۹�ȣ�� ���� ���� ����
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
			k37_sum += k37_array[k37_i];
		}
		return ((double) k37_sum) /  k37_personGroupArray[k37_cycNumber];	//�� / ������ �ο��� �� ���� �����Ѵ�.
	}
	
	// �� �޼ҵ�� �Ȱ��� ����, ����� ���� double �迭�� �ް� double�� ������ ����ؼ� ���� ����
	public double k37_curaveAve(int k37_cycNumber, double[] k37_array) {
		//�հ� ���۹�ȣ�� ���� ���� ����
		double k37_sum = 0;
		int k37_startNum = 0;
		//�������� ��ȣ -1 ��ŭ ���� for�� �ۼ�
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1�������� 0, 2�������� 30, .. ������������ 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//�������� ���۰� �� ��ȣ ���̸� ���� for�� �ۼ�, 1������(0 ~ 29), 2������(30 ~59) .. ������(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200ũ���� �迭���� ���ϴ� �������� �����ϴ� �ο����� ����� ���� ���Ѵ�.
			k37_sum += k37_array[k37_i];
		}
		return k37_sum /  k37_personGroupArray[k37_cycNumber];	//�� / ������ �ο��� �� ���� �����Ѵ�.
	}
	
	
	// ���� ������������ ���� ������, ������ -1 ������, ���� ���� �迭�� �����´�. ������ ���� ����
	public int k37_totalSubjectSum(int k37_cycNumber, int[] k37_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		int k37_sum = 0, k37_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1) 
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//���Ѱ��� ����
	}
	
	// ���� ������������ ���� �����, ������ -1 ������, ���� ���� �迭�� �����´�. �Ǽ��� ���� ����
	public double k37_totalAveSum(int k37_cycNumber, double[] k37_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		double k37_sum = 0;
		int k37_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1)
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//�Ǽ��� ��� ����;
	}
	
	// ���� ������������ ���� ���� ���, ������ -1 ������, ���� ���� �迭�� �����´�. �Ǽ��� ���� ����	
	public double k37_totalsubjectAve(int k37_cycNumber, int[] k37_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		int k37_sum = 0, k37_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1)
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k37_sum += k37_array[k37_i];
		}
		return ((double) k37_sum) /  k37_endNum;	// �����Ҷ� ������ / ���������� �����ο� �� ���� ����
	}
	
	// ���� ������������ ���� ����� ���, ������ -1 ������, ���� ���� �迭�� �����´�. �Ǽ��� ���� ����
	public double k37_totalaveAve(int k37_cycNumber, double[] k37_array) {
		//�հ� �������� ����ȣ�� ���� ���� ����
		double k37_sum = 0;
		int k37_endNum = 0;
		//0���� ������������ȣ���� ���� for�� �ۼ�(���� �������� +1)
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1������ 30, 2������ 60 .. ������������ 200 �� �Էµȴ�.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0���� 1�������ϸ� �ش� �������� �������ο��� ��ȣ�� -1 ���� ����. 
		// 1������ (0 ~ 29), 2������ (0 ~ 59) .. ������(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for���� �ش��ϴ� ���ڸ�ŭ�� ������ ���Ѵ�. 
			k37_sum += k37_array[k37_i];
		}
		return k37_sum /  k37_endNum;	// �����Ҷ� ������ / ���������� �����ο� �� ���� ����
	}
	

}