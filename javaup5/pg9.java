package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg9 {

	public static void main(String[] args) {
		// 30���� ��ǰ ��� ����, String �迭
		String[] k37_itemname = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 100cm", "��������E", "���� ���Ϸ� ���� �ѷ�", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120g*5", "(��)������������", "���ѱ� ������� 156g*4", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��D_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "������������900", "Ʈ���ǽ�Ʈ ���� ����", "������ġ���ڱ�100g*3", "���ѱ� ����Űģ�ӽ�",
				"ġŲ����ī�� 200g" };
		// ��ǰ�� ���� �Է�, ������ �迭�� ����
		int[] k37_price = { 7500, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 4380, 8980, 5980, 5980, 2680 };
		// �� ��ǰ�� ���� �Է�, ������ �迭�� ����
		int[] k37_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 };
		// �� ��ǰ�� �鼼��ǰ���� �Է�, �Ҹ����� �迭�� ����, true�� �鼼, false�� �ȸ鼼
		boolean[] k27_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, false };	
		
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		SimpleDateFormat k37_sdtB = new SimpleDateFormat("YYYYMMdd");
		Calendar k37_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		String k37_star= " ";		
		String k37_Date = k37_dateTime();
		double k37_taxRate = 0.1;	// �ΰ�����
		int k37_sum = 0;
		int k37_totalSum = 0; 		// k33_price(�ܰ�) * k33_amount(����) ��
		int k37_totalTaxFreePrice = 0; // �鼼 ��ǰ �հ�
		int k37_totalNetPrice = 0; 		// ������ǰ �հ� = ������ǰ + �ΰ���
		int k37_NetPrice = 0; 	// ������ǰ
		int k37_tax = 0; 		// �ΰ���
		int k37_totalPrice = 0; // ���� �ݾ�
		
		
		System.out.println("�̸�Ʈ ������ (031)888-1234");
		System.out.println("206-86-50913 ����");
		System.out.println("���� ������ ������� 552");
		
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();
		// ������ �ð��� ����մϴ�. 2022-04-19 00:54 �������� ���
		System.out.printf("[�� ��]%s    POS:0011-9861\n",k37_Date);		
		k37_Line(); 
		System.out.printf("   %5s %14s %3s %4s\n", "�� ǰ ��", "�� ��", "����", "�� ��");
		k37_Line();
		// ��ǰ�� ������ŭ ���� for�� �ۼ�, �迭���� ���� ��� ������ �ҷ��ö� ����Ѵ�.
		for (int k37_i = 0; k37_i < k37_itemname.length; k37_i++) {
			// ���ݰ� ������ ���� ���� �տ� ���ο� ������ �Է��Ѵ�.
			k37_sum = k37_price[k37_i] * k37_num[k37_i];
			k37_totalSum += k37_sum; // k37_totalSum�� k37_totalSum�� k37_sum�� ���� ���� �����Ѵ�.
			
			if(k27_taxfree[k37_i] == true) {
				k37_star = "*";
				k37_totalTaxFreePrice = k37_totalTaxFreePrice + k37_sum;
			} else {
				k37_star = " ";
				k37_totalNetPrice = k37_totalNetPrice + k37_sum;
			}
			// �鼼����, ��ǰ�� 20���̸�ŭ �ڸ� String, 3��°���� �޸��� ���� ����, ����, �޸��� ���� ���� * ������ Ʋ�� �°� ����Ѵ�. // ��� ��ǰ 
			System.out.printf("%s%s%8s%3d%8s\n",k37_star, k37_subStrByte(k37_itemname[k37_i],20), k37_df.format(k37_price[k37_i]), k37_num[k37_i],
					 k37_df.format(k37_price[k37_i] * k37_num[k37_i]));
			// 5��°���� �� �߰�
			if(k37_i % 5 == 4) {
				k37_Line();
			}
		}
		
		k37_totalPrice = k37_totalNetPrice + k37_totalTaxFreePrice;
		k37_NetPrice = (int) (k37_totalNetPrice / (1 + k37_taxRate));
		k37_tax = k37_totalNetPrice - k37_NetPrice; // �ΰ���
		
		System.out.printf("%21s %13d\n", "�� ǰ�� ����", k37_itemname.length);
		System.out.printf("%22s%14s\n", "(*)�� ��  �� ǰ", k37_df.format(k37_totalTaxFreePrice));
		System.out.printf("%22s%14s\n", "�� ��  �� ǰ", k37_df.format(k37_NetPrice));
		System.out.printf("%23s%14s\n", "��   ��   ��", k37_df.format(k37_tax));
		System.out.printf("%24s%14s\n", "��        ��", k37_df.format(k37_totalPrice));
		System.out.printf("%s %22s\n", "�� �� �� �� �� ��", k37_df.format(k37_totalPrice));
			
		k37_Line();
		
		System.out.printf("%s%27s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s%18s%s\n", "ī�����(IC)", "�Ͻú�/ ", k37_df.format(k37_totalPrice));
		
		k37_Line();
		
		System.out.printf("%21s\n", "[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%s%20s%6s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164");
		System.out.printf("%s%24s\n", "����(����)����Ʈ", "5,637(  5,473)");
		System.out.printf("%s\n", "*�ż��� ����Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		
		k37_Line();
		
		System.out.printf("%21s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s%29s\n", "������ȣ : ", "34�� ****");
		System.out.printf("%s%30s\n", "�����ð� : ", "2022-04-18 12:20:04");
		
		k37_Line();
		
		System.out.printf("%s%24s\n", "ĳ��:084599 ��00", "1150");
		System.out.printf("%36s\n", "|||||||||||||||||||||||||||||||");
		System.out.printf("%36s\n", "|||||||||||||||||||||||||||||||");
		System.out.printf("%14s%s\n", k37_sdtB.format(k37_calt.getTime()), "/00119861/00164980/31");
		
		
	}
	
	public static void k37_Line() {	// �� �� ������ �ٹٲ� �޼ҵ�
		// �̷����ϸ� ��� ���� ���̸� �ѹ��� �����Ҽ� �־ ���ϴ�
		System.out.println("-----------------------------------------");
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
	

	// ���ڿ��� ���ϴ� ���̿��� �߶��ִ� �޼ҵ�, ��ǰ�� �̸��� ���ϴ� ���̸� �Ű������� �޾ƿ´�.
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
        	// StringBuffer�� ����
        	StringBuffer k37_sb = new StringBuffer(k37_cutLength);
        	int k37_cnt = 0;	// 
        	for (char k37_ch : k37_source.toCharArray()) {
        		k37_cnt += String.valueOf(k37_ch).getBytes().length;
        		if (k37_cnt > k37_cutLength)
        			break;
        		k37_sb.append(k37_ch);
        	}
           
           if(k37_sb.toString().getBytes().length == 19) {
        	   k37_sb.append(" ");
           }
            return k37_sb.toString();
         }

   }

}
