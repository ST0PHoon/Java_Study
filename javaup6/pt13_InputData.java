package javajump6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pt13_InputData {
	//�ʿ��� ������ �迭 ����, (������ ����, ���� �Ǽ� ���ڿ��� �迭)
	int k37_Person;
	int [] k37_i;
	String [] k37_name;
	int [] k37_kor;
	int [] k37_eng;
	int [] k37_mat;
	int [] k37_sum;
	double [] k37_ave;
	
	pt13_InputData(int k37_iPerson) {	//�޾ƿ� �ο��� ũ�⸸ŭ�� �迭 ����, �� �ο��� ����
		k37_i = new int[k37_iPerson];	
		k37_name = new String[k37_iPerson];
		k37_kor = new int[k37_iPerson];
		k37_eng = new int[k37_iPerson];
		k37_mat = new int[k37_iPerson];
		k37_sum = new int[k37_iPerson];
		k37_ave = new double[k37_iPerson];
		k37_Person = k37_iPerson;
	}
	
	//k37_�� ���̸� �ߺ��̶� ���⼱ ����
	// �޾ƿ� i(��ȣ)�� ���� �ش� ������ �迭�� �������� i��ġ�� �Է����ش�.
	public void k37_SetDate(int i, String name, int kor, int eng, int mat) {
		k37_i[i] = i;
		k37_name[i] = name;
		k37_kor[i] = kor;
		k37_eng[i] = eng;
		k37_mat[i] = mat;
		k37_sum[i] = kor + eng + mat;	//���� ���
		k37_ave[i] = k37_sum[i] / 3.0;	//��� ���
	}
	
	//������ �迭�� �޾ƿͼ� ���� ���� �����ִ� �޼ҵ� ����, ������ ������ ��
	public int k37_subjectSum(int[] k37_intArr) {
		int k37_sum = 0;	//���� ���� ������ ���� ����
		//������ ���� ����ŭ �ݺ��ϴ� for�� ����, 10��
		for (int k37_i = 0; k37_i < k37_intArr.length; k37_i++) {
			k37_sum += k37_intArr[k37_i];	//�迭�� ���鼭 ��� ������ �����ش�
		}
		return k37_sum;	//���� ���� ���� �����Ѵ�.
	}
	
	//������ �迭�� �޾ƿͼ� ����� ���� ���ϴ� �޼ҵ� ����, ������ ������ ��
	public double k37_aveSum(double[] k37_doubleArr) {
		double k37_sum = 0;	//����� ���� �޴� ���� ���� , ������
		//����� ����ŭ �ݺ��ϴ� for�� ����, 10��
		for (int k37_i = 0; k37_i < k37_doubleArr.length; k37_i++) {
			k37_sum += k37_doubleArr[k37_i];	//�� ��� �� �����ֱ�
		}
		return k37_sum;	// ���������� ����� �� �����ϱ�
	}
	
	// 39pg ReportSheet, Ŭ���� �����
	//������ �迭�� �޾ƿͼ� ���� ���� ����� �����ִ� �޼ҵ� ����, ������ �Ǽ��� ��
	public double k37_subjectAve(int[] k37_intArr) {
		int k37_sum = 0;	//���� ���� ������ ���� ����
		// �ο��� ��ŭ �ݺ��ϴ� for�� ����
		for (int k37_i = 0; k37_i < k37_intArr.length; k37_i++) {
			k37_sum += k37_intArr[k37_i];	// �迭�� ���鼭 ���Ѵ�
		}
		return ((double) k37_sum) / k37_Person;	//���������� �����ϱ����� �տ� ����ȯ �ǽ�
	}
	
	//�Ǽ��� �迭�� �޾ƿͼ� �л����� ����� ����� �����ִ� �޼ҵ� ����, ������ �Ǽ��� ��
	public double k37_aveAve(double[] k37_doubleArr) {
		double k37_sum = 0;	//�Ǽ��� ���� ����, ���� �뵵�� ���
		// �ο��� ��ŭ �ݺ��ϴ� for�� ����
		for (int k37_i = 0; k37_i < k37_doubleArr.length; k37_i++) {
			k37_sum += k37_doubleArr[k37_i];	//�迭�� ���鼭 ���� ��� ���Ѵ�.
		}
		return k37_sum / k37_Person;	//�ο����� ���� ����� ����� ���� �����Ѵ�
	}
	
	//��¥�� ���ڿ��� ��ȯ�ϴ� �޼ҵ� ����, import�� ��ܿ� �ִ�.
	public String k37_printDate() {
		//�ð��� �޾ƿ��� ����� ���� �ۼ�, 4�ڸ����� �� �� 24�� �ð� �� ��
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		
		Date k37_time = new Date();	//Date �Լ��� time���� ���ڴٰ� ����
				
		String k37_time1 = format1.format(k37_time);	//�޾ƿ� �ð��� ���信 �°� �����ؼ� ������ time1�� �Է�
		
		return k37_time1;	//�� ���信 ������ ���ڿ��� ��¥ ����
	}
}
