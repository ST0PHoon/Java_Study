package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg8 {


	public static void main(String[] args) {	//����
		// ù ��°, ��ǰ ����, �̸�, �ڵ�, ����, ����
		String k37_itmename1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String k37_itmecode1 = "1031615";
		int k37_price1 = 3000;
		int k37_amount1 = 1;
		// �� ��°, ��ǰ ����, �̸�, �ڵ�, ����, ����
		String k37_itmename2 = "�����̵�ĸ���(������)(100ȣ)";
		String k37_itmecode2 = "11008152";
		int k37_price2 = 300000;
		int k37_amount2 = 10;
		// �� ��°, ��ǰ ����, �̸�, �ڵ�, ����, ����
		String k37_itmename3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k37_itmecode3 = "10208800";
		int k37_price3 = 1000;
		int k37_amount3 = 1;
		// ��ǰ ���� ���� * ���� �� �ǽ��Ͽ� ���ο� ������ ������ �Է��Ѵ�.
		int k37_priceTimesAmount1 = k37_price1 * k37_amount1;
		int k37_priceTimesAmount2 = k37_price2 * k37_amount2;
		int k37_priceTimesAmount3 = k37_price3 * k37_amount3;
		// ������ ��� ��ǰ�� �հ� �ݾ��̴�.
		int k37_totalPrice = k37_priceTimesAmount1 + k37_priceTimesAmount2 + k37_priceTimesAmount3;
		// �ΰ��� ���� �ݾ� ���, ��� �� (int)������ �ٲٸ� �ڵ����� �Ҽ����� ��������
		// �� �ǹ̴� �ΰ����� �ڵ����� +1�� ����Ǵ°��� �ǹ��Ѵ�.
		int k37_nonTaxPrice = (int) (k37_totalPrice / 1.1);
		//�հ� - �ΰ��� ���� �ݾ� = �ΰ���, ���
		int k37_tax = k37_totalPrice - k37_nonTaxPrice;
		
		
		// ���ݿ� 3��°���� , �� �ֱ����ؼ� DeciamlFormat�ν��Ͻ��� k37_df�� �����Ѵ�.
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###");	//#�� ���ڰ� �� �����̰�, String���� ��ȯ�ȴ�.
		// �ð������͸� ���信 �°� �������� �޼ҵ�
		String k37_Date = k37_dateTime();	//1995/04/18 23:22:53 ������ ���
		String k37_refundDate = k37_dateTime(14);	//ȯ�Ұ��� ��¥�� ������ִ� �޼ҵ�, ()�ȿ� ���ڷ� �Ⱓ ����
		// ���ڿ�, ���ڿ��� ������� ����, �� �Է��Ѵ�. (String, int)
		// �Է��� ���̸� �ʰ��ϸ� ������ ���ĺκ��� �����Ѵ�. 1 2 3 ��ǰ ����
		String k37_Item1Namecut = k37_subStrByte(k37_itmename1, 26);
		String k37_Item2Namecut = k37_subStrByte(k37_itmename2, 26);
		String k37_Item3Namecut = k37_subStrByte(k37_itmename3, 26);

		System.out.println("               *���ΰ���, ���̼�*");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.println("��ȭ:031-702-6016");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������, ��ȣ�� 213-81-52063");
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11 (����");
		System.out.println("��)");

		k37_doubleLine();	//�� �� ��� �� �ٹٲ�

		System.out.println("          �Һ����߽ɰ濵(CCM) �������");
		System.out.println("         ISO 9001 ǰ���濵�ý��� �������");

		k37_doubleLine();	//�� �� ��� �� �ٹٲ�
		// ȯ�Ұ����� ��¥ ���, 05��02�� ������ ���, ���ų�¥ + 14�ϵ� ��¥���
		System.out.printf("          ��ȯ/ȯ�� 14��(%s)�̳�,\n", k37_refundDate);
		System.out.println(" (����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.println("        ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.println("         üũī�� ��� �� �ִ� 7�� �ҿ�");

		k37_doubleLine();	//�� �� ��� �� �ٹٲ�
		// �ŷ��Ͻ� ���, 1995/04/18 23:22:53 ������ ���
		System.out.printf("[POS 1058231]                 %s\n", k37_Date);

		k37_doubleLine();	//�� �� ��� �� �ٹٲ�
		// 1��° ������ ���̸�ŭ�� ��ǰ��, 3��°���� �޸� ���� ����, ����, ���� * ���� / ��ǰ�ڵ� ��� 
		System.out.printf("%s %8s %2d %10s\n", k37_Item1Namecut, k37_df.format(k37_price1), k37_amount1,
				k37_df.format(k37_priceTimesAmount1));
		System.out.printf("[%s]\n", k37_itmecode1);
		// 2��° ������ ���̸�ŭ�� ��ǰ��, 3��°���� �޸� ���� ����, ����, ���� * ���� / ��ǰ�ڵ� ��� 
		System.out.printf("%s %8s %2d %10s\n", k37_Item2Namecut, k37_df.format(k37_price2), k37_amount2,
				k37_df.format(k37_priceTimesAmount2));
		System.out.printf("[%s]\n", k37_itmecode2);
		// 3��° ������ ���̸�ŭ�� ��ǰ��, 3��°���� �޸� ���� ����, ����, ���� * ���� / ��ǰ�ڵ� ��� 
		System.out.printf("%s %8s %2d %10s\n", k37_Item3Namecut, k37_df.format(k37_price2), k37_amount3,
				k37_df.format(k37_priceTimesAmount3));
		System.out.printf("[%s]\n", k37_itmecode3);
		// �����հ� ���, �հ� / (1+����), DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("      �����հ�                         %10s\n", k37_df.format(k37_nonTaxPrice));
		// �ΰ��� ���, �հ� - �ݾ�, DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("        �ΰ���                         %10s\n", k37_df.format(k37_tax));

		k37_Line();	//�� �� ��� �� �ٹٲ�
		// �հ�, DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("�Ǹ��հ�                               %10s\n", k37_df.format(k37_totalPrice));

		k37_doubleLine();	//�� �� ��� �� �ٹٲ�
		// �ſ�ī�� �ݾ�, �հ�ݾװ� �����ϴ� DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("�ſ�ī��                               %10s\n", k37_df.format(k37_totalPrice));

		k37_Line();	//�� �� ��� �� �ٹٲ�

		System.out.println("�츮ī��                         538720**********");
		// ���αݾ�, �հ�ݾװ� �����ϴ� DecimalFormat�� ����Ͽ� String���� �ٲ�, ������ 8 �����ϰ� ����
		System.out.printf("���ι�ȣ 77982843(0)           ���αݾ�%10s\n", k37_df.format(k37_totalPrice));

		k37_doubleLine();	//�� �� ��� �� �ٹٲ�
		// �ŷ��Ͻ� ���, 1995/04/18 23:22:53 ������ ���
		System.out.printf("          %s �д缭����\n", k37_Date);
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.println("�ɹ��� �� �����̼� ���� ���� : 1599-2211");
		System.out.println("                    �� �� ��");
		System.out.println("                2112820610158231");

		k37_Line();	//�� �� ��� �� �ٹٲ�

		System.out.println("  �� ���̼� �ɹ��� �� �Ǵ� Ȩ�������� �����ϼż�");
		System.out.println("    ȸ������ �� �پ��� ������ ����������! ��");

	}

	public static void k37_doubleLine() {	// �� �� ������ �ٹٲ� �޼ҵ�
		//�̷����ϸ� ��� ���� ���̸� �ѹ��� �����Ҽ� �־ ���ϴ�
		System.out.println("=================================================");
	}

	public static void k37_Line() {	// �� �� ������ �ٹٲ� �޼ҵ�
		// �̷����ϸ� ��� ���� ���̸� �ѹ��� �����Ҽ� �־ ���ϴ�
		System.out.println("-------------------------------------------------");
	}

	public static String k37_dateTime() {	// ��¥�� Ʋ�� �־��ִ� �޼ҵ�
		// ���� ��¥ �����͸� �޾ƿ´�.
		Date nowDate = new Date();
		// ��¥ �����͸� ���ϴ� �������� �ٲܼ��ִ�. 1995/04/18 23:22:53 ������ ���
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// ��¥ �����͸� ���信 �°� �ٲٰ� String�� �Է�, SimpleDateFormat�ν��Ͻ��� ����ϸ� String���� ����ȯ �ȴ�.
		String k37_date = simpleDateFormat.format(nowDate);
		// ��� ����
		return k37_date;
	}

	// ���� ��¥�� ȯ�ұⰣ�� ����ȭ ȯ�Ұ��ɱⰣ�� �������ִ� �޼ҵ�
	public static String k37_dateTime(int k37_datedif) {
		Calendar k37_cal = Calendar.getInstance();	// �޷µ����͸� �����ɴϴ�. cal�� ����
		//02�� 21�� ���·� ����ϴ� ���� ����
		SimpleDateFormat k37_simpleDateFormat2 = new SimpleDateFormat("MM��dd��");	
		// �ҷ��� ��¥�� �Է¹��� �Ⱓ��ŭ ��¥�� ���Ѵ�. ���ÿ� + 14��
		k37_cal.add(Calendar.DATE, k37_datedif);
		// 14�� ���� ������ ���信 �ִ´�.
		String k37_refundDate = k37_simpleDateFormat2.format(k37_cal.getTime());
		// �ᱣ�� ����
		return k37_refundDate;
	}

	public static String k37_subStrByte(String k37_source, int k37_cutLength) {
		// �޾ƿ� ��ǰ �̸��� �յڿ� ������ �����Ѵ�.
		k37_source = k37_source.trim();
		// ���ڿ��� ���̸� �����մϴ�.(getBytes�� ����ؼ� �ѱ��� 2, ����� 1�� �����Ѵ�
		// �̷������� ���� ���̰� ���� ���ϴ� ���̺��� �۰ų� ������ ���ڿ� �ڿ� ������ �߰��Ѵ�.
        if (k37_source.getBytes().length <= k37_cutLength) {	//������ �߰��Ͽ� ���ϴ� ���̷� �ø���.
        	// ���ϴ� ���� - ��ǰ�� ����Ʈ ���̰� �߰��� �ʿ��� ���� ���̴�.
           for (int k37_i = k37_cutLength - k37_source.getBytes().length; k37_i > 0; k37_i--) {
              k37_source += " ";	// �ʿ��� ������ �߰�
           }
           return k37_source;	// ����� ����
        } else {	//��ǰ �̸��� ���̰� ������ ���̺��� ��� �߶��ش�.
        	// StringBuffer�� ����, String ���� ���ڿ��� �����Ҷ� �ӵ��� ������
        	StringBuffer k37_sb = new StringBuffer(k37_cutLength);
        	int k37_cnt = 0;	// ���ڿ��� �տ������� ���ھ� �÷����� ���̸� ������ �뵵
        	//�޾ƿ� ���ڿ��� char �迭�� �ٲ㼭 ������ k37_ch�� �ϳ��� �߰��ϴ� for�� 
        	for (char k37_ch : k37_source.toCharArray()) {
        		// ���� ó���� �� k37_ch�� ���� ���Ŀ�
        		// ���ڿ��� ù��° ���ڸ� �߰��ϰ� ����Ʈ �������� (�ѱ��̸� 2, ����� 1)
        		// ���ڿ��� �ι�° ���� �߰�(�̹� ù��°�� �߰�����) ... ����Ʈ ���� ����... ���������� ���� 
        		k37_cnt += String.valueOf(k37_ch).getBytes().length;
        		// �� ���¸� �����ϴٰ� ���̰� k37_cutLength(���������� ����) ���� Ŀ���� �����.
        		if (k37_cnt > k37_cutLength)
        			break;
        		// ���� ���� �߰�
        		k37_sb.append(k37_ch);
        	}
           // 20��° �ѱ��� ���� ������ �߻��ϴ� �����ذ�, ����Ʈ ���̰�
        	// ���� ���ϴ� ���̺��� 1 ������ ���� �߰�
           if(k37_sb.toString().getBytes().length == (k37_cutLength - 1)) {
        	   k37_sb.append(" ");	//append ��ɾ �̿��ϸ� StringBuffer ������ ���ڿ� �ǵڿ� ���� �߰��ȴ�.
           }
            return k37_sb.toString();	//String���� ����ȯ �Ͽ� ���
         }

   }
}
