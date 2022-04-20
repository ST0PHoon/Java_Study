package javajump7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class pg35 {
	static ArrayList<pg35_OneRec> k37_ArrayOncRec = new ArrayList <pg35_OneRec>();
	static int k37_sumKorCurrent = 0;	//������������ ����� ��
	static int k37_sumEngCurrent = 0;	//������������ ����� ��
	static int k37_sumMatCurrent = 0;	//������������ ���м��� ��
	static int k37_sumSumCurrent = 0;	//������������ ���� ��
	static double k37_sumAveCurrent = 0;	//������������ ��� ��
	static int k37_sumKorTotal = 0;	//������������ ����� ��
	static int k37_sumEngTotal = 0;	//������������ ����� ��
	static int k37_sumMatTotal = 0;	//������������ ���м��� ��
	static int k37_sumSumTotal = 0;	//������������ ���� ��
	static double k37_sumAveTotal = 0;	//������������ ����� ��
	
	static int k37_counter = 0;	// �ο��� ������ ī����
	
	static final int k37_iPerson = 200;	// ���ο���
	static final int k37_pgPerson = 30;	//�������� �ο���
	static int k37_currentPagePerson = 0;	//������������ �ο���
	static int k37_currentPageStackPerson = 0;	// ������������ ���� �ο���
	
	static int k37_totalPages = 0;	//�� ������ ��
	
	public static void main(String[] args) {
		// pg30 Ŭ������ ArrayList
		k37_dataSet();	//������ ���� �޼ҵ�
		for ( int k37_i = 0; k37_i < k37_totalPages; k37_i++) {	//����������ū ���� for�� �ۼ�(����7������)
			k37_HeaderPrint(k37_i);	// ������ ����, ������ڰ� ��� �Ӹ��� ���
			
			for(int k37_j = 0; k37_j < k37_currentPagePerson; k37_j++) {
				k37_ItemPrint();	// �л��� ������ ����Ѵ�.
			}
			k37_TailPrint();	//������ ����,���� �������� �����հ�� ����� ����Ѵ�.
		}
	}
	
	public static void k37_dataSet() {	// ������ ���� �޼ҵ�
		for(int k37_i = 1; k37_i <= k37_iPerson; k37_i++) {	//�� �ο��� ��ŭ ���� for�� �ۼ�
			String k37_name = String.format("����%02d", k37_i);	// ���信 �°� �̸��Է�
			int k37_kor = (int)(Math.random()*100);	//0���� 99���� �����ϴ� �����Լ��� �����Է�
			int k37_eng = (int)(Math.random()*100);	//0���� 99���� �����ϴ� �����Լ��� �����Է�
			int k37_mat = (int)(Math.random()*100);	//0���� 99���� �����ϴ� �����Լ��� �����Է�
			// Ŭ���� ��̿� �Է��� ������ ���� Ŭ���� �߰�
			k37_ArrayOncRec.add(new pg35_OneRec(k37_i, k37_name, k37_kor, k37_eng, k37_mat));
		}
		// �������� ����ϴ� if
		if (k37_iPerson % k37_pgPerson == 0) {
			k37_totalPages = k37_iPerson / k37_pgPerson;
		} else {
			k37_totalPages = (k37_iPerson / k37_pgPerson) + 1;
		}
	}
	
	public static void k37_dataSort() {	// �����͸� ���������ϴ� �޼ҵ�
		// pg34_OneRec�� ���� Comparator ����
		Comparator <pg35_OneRec> k37_sort = new Comparator <pg35_OneRec>() {
			public int compare (pg35_OneRec a1, pg35_OneRec a2) {	// ���� �� ���� ����
				return (a2.k37_getSum() - a1.k37_getSum());	//�����տ� ���� �����͸� ���Ѵ�.
			}
		};
		Collections.sort(k37_ArrayOncRec, k37_sort);	//�׿� ���� Ŭ���� ����Ʈ�� ������ �ٲ۴�.
	}
	
	public static void k37_HeaderPrint(int k37_i) {
		//�ð��� ���¸� ¥�д�.
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		//����ð��� �����´�.
		Date k37_time = new Date();
		//������ ���ڿ��� ���信 ���� �ð��� �Է��Ѵ�.	
		String k37_time1 = format1.format(k37_time);
		
		System.out.printf("PAGE: %d            ������� : "  + k37_time1 + "\n", k37_i + 1);	//���� ������(0�̶� + 1)�� ��¥�� ����Ѵ�.
		System.out.println("==================================================");
		System.out.printf("%-2.2s %-4.4s %4.4s %5.5s %5.5s %5.5s %4.4s\n","��ȣ","�̸�","����","����","����","����","���");	//���� ���
		System.out.println("==================================================");
		// �������� �ο��� ����
		if(k37_i + 1 == k37_totalPages) {	// ���������������
			if (k37_iPerson == k37_pgPerson) {	// ���ο� = �������� �ο� �����Ҷ� 0�� �ߴ� ���� ����
				k37_currentPagePerson = k37_pgPerson;	// ���ο��� �Է�
			}else {
				k37_currentPagePerson = k37_iPerson % k37_pgPerson;	// 200 30 �̶�� 20���� ����.
			}
		} else {	
			k37_currentPagePerson = k37_pgPerson;	// �������� ��� �������� �������� �ο��� �ִ´�.
		}
		// �������� �����ο� ���
		k37_currentPageStackPerson +=  k37_currentPagePerson;
			
	}
	
	public static void k37_ItemPrint() {	//�л� ������� �޼ҵ�
		pg35_OneRec k37_rec;	// Ŭ���� ����
		// Ŭ���� ����Ʈ���� k37_counter��° Ŭ���� ����
		k37_rec = k37_ArrayOncRec.get(k37_counter);
		// �й�, �̸�, ����, ����, ����, �հ�, ����� ����ϴ� printf ����
		System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n", k37_rec.k37_getStudentId(), k37_rec.k37_getName(), k37_rec.k37_getKor(),
				k37_rec.k37_getEng(), k37_rec.k37_getMat(), k37_rec.k37_getSum(), k37_rec.k37_getAve());
		
		k37_counter++;	// �����л����� �ѱ�� ++
		//�л��� ������ ������ ������ ���� ������ / ���񺰷� ������ �����Ѵ�.
		k37_sumKorCurrent += k37_rec.k37_getKor(); k37_sumKorTotal += k37_rec.k37_getKor();
		k37_sumEngCurrent += k37_rec.k37_getEng(); k37_sumEngTotal += k37_rec.k37_getEng();
		k37_sumMatCurrent += k37_rec.k37_getMat(); k37_sumMatTotal += k37_rec.k37_getMat();
		k37_sumSumCurrent += k37_rec.k37_getSum(); k37_sumSumTotal += k37_rec.k37_getSum();
		k37_sumAveCurrent += k37_rec.k37_getAve(); k37_sumAveTotal += k37_rec.k37_getAve();
		
	}
	
	public static void k37_TailPrint() {
		System.out.println("==================================================");
		
		System.out.println("����������");
		//���� �������� ���� �������� �����ش�. k37_inData Ŭ�������� k37_curSubjectSum �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
		//����� �Ǽ����̱� ������ k37_curAveSum�� �޼ҵ� ���� ����
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�",k37_sumKorCurrent, k37_sumEngCurrent, k37_sumMatCurrent, k37_sumSumCurrent, k37_sumAveCurrent);
		
		//���� �������� ���� ����� �����ش�. k37_inData Ŭ�������� k37_cursubjectAve �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
		//����� �Ǽ����̱� ������ k37_curaveAve�� �޼ҵ� ���� ����
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "���", (double)k37_sumKorCurrent / k37_currentPagePerson, (double)k37_sumEngCurrent / k37_currentPagePerson,
				(double)k37_sumMatCurrent / k37_currentPagePerson, (double) k37_sumSumCurrent / k37_currentPagePerson, (double) k37_sumAveCurrent / k37_currentPagePerson);
		
		System.out.println("==================================================");
		
		//���ݱ��� �������� ���� �������� �����ش�. k37_inData Ŭ�������� k37_totalSubjectSum �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� �������� ����.
		//����� �Ǽ����̱� ������ k37_totalAveSum�� �޼ҵ� ���� ����
		System.out.println("����������");
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "�հ�", k37_sumKorTotal, k37_sumEngTotal, k37_sumMatTotal, k37_sumSumTotal,k37_sumAveTotal);
		
		//���ݱ��� �������� ���� ����� �����ش�. k37_inData Ŭ�������� k37_totalsubjectAve �޼ҵ忡 k37_i(�� ������)�� �� ������ �迭�� �����ְ�, ���� ����� ����.
		//����� �Ǽ����̱� ������ k37_totalaveAve�� �޼ҵ� ���� ����
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "���", (double)k37_sumKorTotal / k37_currentPageStackPerson, (double)k37_sumEngTotal / k37_currentPageStackPerson,
				(double)k37_sumMatTotal / k37_currentPageStackPerson, (double)k37_sumSumTotal / k37_currentPageStackPerson, (double)k37_sumAveTotal / k37_currentPageStackPerson);
		// ������������ �Ѿ�� �������� ���� �ʱ�ȭ
		k37_sumKorCurrent = 0;	
		k37_sumEngCurrent = 0;
		k37_sumMatCurrent = 0;
		k37_sumSumCurrent = 0;
		k37_sumAveCurrent = 0;
		
	}
	
}
