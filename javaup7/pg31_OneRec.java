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
			String k37_name = String.format("홍길%02d", i);
			int k37_kor = (int)(Math.random()*100);
			int k37_eng = (int)(Math.random()*100);
			int k37_mat = (int)(Math.random()*100);
			k37_ArrayOncRec.add(new pg26_OneRec(i, k37_name, k37_kor, k37_eng, k37_mat));
		}
	}
	
	public static void HeaderPrint() {
		System.out.println("*************************************");
		System.out.printf("%2s %4s %2s %2s %2s %2s     %2s\n","번호","이름","국어","영어","수학","합계","평균");
		System.out.println("*************************************");
	}
	
	public static void ItemPrint(int i) {
		pg26_OneRec k37_rec;
		
		k37_rec = k37_ArrayOncRec.get(i);
		
	}
	
	public static void TailPrint() {
		System.out.println("*************************************");
		System.out.printf("국어합계 %d   국어평균: %6.2f\n",);
		System.out.printf("영어합계 %d   국어평균: %6.2f\n",);
		System.out.printf("수학합계 %d   국어평균: %6.2f\n",);
		System.out.println("*************************************");
		System.out.printf("반평균합계 %d   반평균: %6.2f\n",);
	}
	
	
	
}
