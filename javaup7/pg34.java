package javajump7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class pg34 {
	// Ŭ����(pg34_OneRec) ��� ����Ʈ ���� 
	static ArrayList<pg34_OneRec> k37_ArrayOncRec = new ArrayList <pg34_OneRec>();
	
	static int k37_sumKor = 0;	//������ ����, �����
	static int k37_sumEng = 0;	//������ ����, �����
	static int k37_sumMat = 0;	//������ ����, ���м���
	static int k37_sumSum = 0;	//������ ����, ������
	static int k37_sumAve = 0;	//������ ����, �������
	static final int k37_iPerson = 20;	//�л��� �Է�
	
	public static void main(String[] args) {
		// pg34 ArrayList ����(Sort)
		k37_dataSet();	//������ ���� �޼ҵ�
		k37_dataSort();	//�����͸� ���������ϴ� �޼ҵ�
		k37_HeaderPrint();	//�Ӹ��� ��� �޼ҵ�
		for (int k37_i = 0; k37_i < k37_ArrayOncRec.size(); k37_i++) {
			k37_ItemPrint(k37_i);	//�� �л��� ������ ����ϴ� �޼ҵ� ����
		}	
		k37_TailPrint();	// ������ �� ��� �޼ҵ�
		
	}
	
	public static void k37_dataSet() {	//�����͸� �����ϴ� �޼ҵ�
		for(int i = 1; i <= k37_iPerson; i++) {	// 1���� �� �л��� ��ŭ �ݺ��ϴ� for�� �ۼ�
			String k37_name = String.format("ȫ��%02d", i);	// �л��� �̸� �Է�
			int k37_kor = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			int k37_eng = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			int k37_mat = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			k37_ArrayOncRec.add(new pg34_OneRec(i, k37_name, k37_kor, k37_eng, k37_mat));	//�Է��� ������ ��� ����Ʈ�� ��Ŭ���� ���·� �߰��Ѵ�.
		}
	}
	
	public static void k37_dataSort() {	// �����͸� ���������ϴ� �޼ҵ�
		// pg34_OneRec�� ���� Comparator ����
		Comparator <pg34_OneRec> k37_sort = new Comparator <pg34_OneRec>() {
			public int compare (pg34_OneRec a1, pg34_OneRec a2) {	// ���� �� ���� ����
				return (a2.k37_getSum() - a1.k37_getSum());	//�����տ� ���� �����͸� ���Ѵ�.
			}
		};
		Collections.sort(k37_ArrayOncRec, k37_sort);	//�׿� ���� Ŭ���� ����Ʈ�� ������ �ٲ۴�.
	}
	
	public static void k37_HeaderPrint() {	// �Ӹ��� ��� �޼ҵ�
		System.out.println("*************************************");
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
		System.out.println("*************************************");
	}
	
	public static void k37_ItemPrint(int i) {	//�� �л��� ������ ����ϴ� �޼ҵ�
		pg34_OneRec k37_rec;	//Ŭ���� ����
		
		k37_rec = k37_ArrayOncRec.get(i);	//Ŭ���� ����Ʈ�� i��° Ŭ������ ���ܿ´�.
		// ����, �л� id, �̸�, �����, �����, ���м���, �հ�, ��������� ����Ѵ�.
		System.out.printf("%2d %4s %4d %4d %4d   %3d %6.2f\n", k37_rec.k37_getStudentId(), k37_rec.k37_getName(), k37_rec.k37_getKor(),
				k37_rec.k37_getEng(), k37_rec.k37_getMat(), k37_rec.k37_getSum(), k37_rec.k37_getAve());
		//������ ������ ���ϱ����� ������ ������ �����Ѵ�
		k37_sumKor += k37_rec.k37_getKor();	
		k37_sumEng += k37_rec.k37_getEng();
		k37_sumMat += k37_rec.k37_getMat();
		k37_sumSum += k37_rec.k37_getSum();
		k37_sumAve += k37_rec.k37_getAve();
	}
	
	public static void k37_TailPrint() {	//������ ������� ���
		System.out.println("*************************************");
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k37_sumKor, k37_sumKor/(double)k37_ArrayOncRec.size());
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k37_sumEng, k37_sumEng/(double)k37_ArrayOncRec.size());
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k37_sumMat, k37_sumMat/(double)k37_ArrayOncRec.size());
		System.out.println("*************************************");
		// ����� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("������հ� %4d   �����: %6.2f\n",k37_sumAve, k37_sumAve/(double)k37_ArrayOncRec.size());
	}
	
}


