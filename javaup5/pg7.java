package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pg7 {

	public static void main(String[] args) {
		// pg7 
		DecimalFormat k37_df = new DecimalFormat("##,###");
		
		int k37_iPrice = 33000;
		double k37_taxrate = 0.1;
		int k37_nontaxPrice = (int) (k37_iPrice / (1+k37_taxrate)) + 1 ;
		int k37_tax=  k37_iPrice - k37_nontaxPrice;
		
		
		String k37_date = k37_dateTime();
		
		System.out.println("�ſ����");
		System.out.println("�ܸ��� : 2N68665898           ��ǥ��ȣ : 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("��  �� : ��� ������ �д籸 Ȳ�����351���� 10");
		System.out.println("1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.println("����� : 752-53-00558            TEL  : 7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.printf("��  ��                               %s ��\n",k37_df.format(k37_nontaxPrice));
		System.out.printf("�ΰ���                                %s ��\n",k37_df.format(k37_tax));
		System.out.printf("��  ��                               %s ��\n",k37_df.format(k37_iPrice));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("�츮ī��");
		System.out.println("ī���ȣ : 5387-20**-****-4613(S)        �Ͻú�");
		System.out.printf("�ŷ��Ͻ� : %s\n", k37_date);
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.println("���� : ��ī���     ���� : 720068568");
		System.out.println("�˸� : EDC����ǥ");
		System.out.println("���� : TEL) 1544-4700");		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                * �����մϴ� *");
		System.out.println("                             ǥ��V2.08_20200212");
	}
	
	public static String k37_dateTime() {
		Date nowDate = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String k37_date = simpleDateFormat.format(nowDate);
		
		return k37_date;
	}

	
	
}
