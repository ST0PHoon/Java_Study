package javajump7;

import java.util.ArrayList;

public class pg31_OneRec {
	static ArrayList<pg26_OneRec> k37_ArrayOncRec = new ArrayList <pg26_OneRec>();
	
	static int k37_sumKor = 0;
	static int k37_sumEng = 0;
	static int k37_sumMat = 0;
	static int k37_sumSum = 0;
	static int k37_sumAve = 0;
	static final int k37_iPerson = 20;
	
	public static void dataSet() {
		for(int i = 0; i < k37_iPerson; i++) {
			String k37_name = String.format("ȫ��%02d", i);
			int k37_kor = (int)(Math.random()*100);
			int k37_eng = (int)(Math.random()*100);
			int k37_mat = (int)(Math.random()*100);
			k37_ArrayOncRec.add(new pg26_OneRec(i, k37_name, k37_kor, k37_eng, k37_mat));
		}
	}
	
	public static void HeaderPrint() {
		System.out.println("*************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s     %2s\n","��ȣ","�̸�","����","����","����","�հ�","���");
		System.out.println("*************************************");
	}
	
	public static void ItemPrint(int i) {
		pg26_OneRec k37_rec;
		
		k37_rec = k37_ArrayOncRec.get(i);
		
	}
	
	public static void TailPrint() {
		System.out.println("*************************************");
		System.out.printf("�����հ� %d   �������: %6.2f\n",);
		System.out.printf("�����հ� %d   �������: %6.2f\n",);
		System.out.printf("�����հ� %d   �������: %6.2f\n",);
		System.out.println("*************************************");
		System.out.printf("������հ� %d   �����: %6.2f\n",);
	}
	
	
	
}
