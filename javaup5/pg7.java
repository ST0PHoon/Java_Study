package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pg7 {

	public static void main(String[] args) {
		// pg7 
		// ���ݿ� 3��°���� , �� �ֱ����ؼ� DeciamlFormat�ν��Ͻ��� k37_df�� �����Ѵ�.
		DecimalFormat k37_df = new DecimalFormat("#,###,###");	//#�� ���ڰ� �� �����̰�, String���� ��ȯ�ȴ�.
		
		int k37_iPrice = 33000;	//������ ���� �Է�
		double k37_taxrate = 0.1;	//������ ���ݺ��� ����
		// �ΰ��� ���� �ݾ� ���, ��� �� (int)������ �ٲٸ� �ڵ����� �Ҽ����� ��������
		// �� �ǹ̴� �ΰ����� �ڵ����� +1�� ����Ǵ°��� �ǹ��Ѵ�.
		int k37_nontaxPrice = (int) (k37_iPrice * 10 / (1 + k37_taxrate))/10;	
		int k37_tax=  k37_iPrice - k37_nontaxPrice;	//�հ� - �ΰ��� ���� �ݾ� = �ΰ��� ���
		
		// �ð������͸� ���信 �°� �������� �޼ҵ�
		String k37_date = k37_dateTime();	//1995/04/18 23:22:53 ������ ���
		
		System.out.println("�ſ����");
		System.out.println("�ܸ��� : 2N68665898           ��ǥ��ȣ : 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("��  �� : ��� ������ �д籸 Ȳ�����351���� 10");
		System.out.println("1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.println("����� : 752-53-00558            TEL  : 7055695");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		//�ݾ� ���, �հ� / (1+����), DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("��  ��                              %8s ��\n",k37_df.format(k37_nontaxPrice));
		// �ΰ��� ���, �հ� - �ݾ�, DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("�ΰ���                              %8s ��\n",k37_df.format(k37_tax));
		// �հ�, DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("��  ��                              %8s ��\n",k37_df.format(k37_iPrice));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("�츮ī��");
		System.out.println("ī���ȣ : 5387-20**-****-4613(S)        �Ͻú�");
		// �ŷ��Ͻ� ���, 1995/04/18 23:22:53 ������ ���
		System.out.printf("�ŷ��Ͻ� : %s\n", k37_date);
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.println("���� : ��ī���     ���� : 720068568");
		System.out.println("�˸� : EDC����ǥ");
		System.out.println("���� : TEL)1544-4700");		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                * �����մϴ� *");
		System.out.println("                             ǥ��V2.08_20200212");
	}
	
	public static String k37_dateTime() {	// ��¥�� Ʋ�� �־��ִ� �޼ҵ�
		// ���� ��¥ �����͸� �޾ƿ´�.
		Date nowDate = new Date();
		// ��¥ �����͸� ���ϴ� �������� �ٲܼ��ִ�. 1995/04/18 23:22:53 ������ ���
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// ��¥ �����͸� ���信 �°� �ٲٰ� String�� �Է�, SimpleDateFormat�ν��Ͻ��� ����ϸ� String���� ����ȯ �ȴ�.
		String k37_date = simpleDateFormat.format(nowDate);
		// ��� ����
		return k37_date;
	}
	
}
