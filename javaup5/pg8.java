package javajump5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pg8 {

	String k37_itmename1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
	String k37_itmecode1 = "1031615";
	int k37_price1 = 3000;
	int k37_amount1 = 1;

	String k37_itmename2 = "�����̵�ĸ���(������)(100ȣ)";
	String k37_itmecode2 = "11008152";
	int k37_price2 = 10000;
	int k37_amount2 = 10;

	String k37_itmename3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
	String k37_itmecode3 = "10208800";
	int k37_price3 = 1000;
	int k37_amount3 = 1;

	int k37_priceTimesAmount1 = k37_price1 * k37_amount1;
	int k37_priceTimesAmount2 = k37_price2 * k37_amount2;
	int k37_priceTimesAmount3 = k37_price3 * k37_amount3;

	int k37_totalPrice = k37_priceTimesAmount1 + k37_priceTimesAmount2 + k37_priceTimesAmount3;

	int k37_nonTaxPrice = (int) (k37_totalPrice / 1.1);
	int k37_tax = k37_totalPrice - k37_nonTaxPrice;

	public static void main(String[] args) {
		// pg8
		pg8 k37 = new pg8();

		DecimalFormat k37_df = new DecimalFormat("###,###,###");

		String k37_Date = k37_dateTime();
		String k37_refundDate = k37_dateTime(14);
		String k37_Item1Namecut = subStrByte(k37.k37_itmename1, 26);
		String k37_Item2Namecut = subStrByte(k37.k37_itmename2, 26);
		String k37_Item3Namecut = subStrByte(k37.k37_itmename3, 26);

		System.out.println("               *���ΰ���, ���̼�*");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.println("��ȭ: 031-702-6016");
		System.out.println("����: ���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ: ������, ��ȣ�� 213-81-52063");
		System.out.println("����: ��⵵ ������ �д籸 �д��53���� 11 (����");
		System.out.println("��)");

		k37_doubleLine();

		System.out.println("          �Һ����߽ɰ濵(CCM) �������");
		System.out.println("         ISO 9001 ǰ���濵�ý��� �������");

		k37_doubleLine();

		System.out.printf("          ��ȯ/ȯ�� 14��(%s)�̳�,\n", k37_refundDate);
		System.out.println(" (����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.println("        ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.println("         üũī�� ��� �� �ִ� 7�� �ҿ�");

		k37_doubleLine();

		System.out.printf("[POS 1058231]                 %s\n", k37_Date);

		k37_doubleLine();

		System.out.printf("%s %8s %2d %9s\n", k37_Item1Namecut, k37_df.format(k37.k37_price1), k37.k37_amount1,
				k37_df.format(k37.k37_priceTimesAmount1));
		System.out.printf("[%s]\n", k37.k37_itmecode1);

		System.out.printf("%s %8s %2d %9s\n", k37_Item2Namecut, k37_df.format(k37.k37_price2), k37.k37_amount2,
				k37_df.format(k37.k37_priceTimesAmount2));
		System.out.printf("[%s]\n", k37.k37_itmecode2);

		System.out.printf("%s %8s %2d %9s\n", k37_Item3Namecut, k37_df.format(k37.k37_price2), k37.k37_amount3,
				k37_df.format(k37.k37_priceTimesAmount3));
		System.out.printf("[%s]\n", k37.k37_itmecode3);

		System.out.printf("      �����հ�                           %8s\n", k37_df.format(k37.k37_nonTaxPrice));
		System.out.printf("        �ΰ���                           %8s\n", k37_df.format(k37.k37_tax));

		k37_Line();

		System.out.printf("�Ǹ��հ�                                 %8s\n", k37_df.format(k37.k37_totalPrice));

		k37_doubleLine();

		System.out.printf("�ſ�ī��                                 %8s\n", k37_df.format(k37.k37_totalPrice));

		k37_Line();

		System.out.println("�츮ī��                        538720**********");
		System.out.printf("���ι�ȣ 77982843(0)          ���αݾ�  %8s\n", k37_df.format(k37.k37_totalPrice));

		k37_doubleLine();

		System.out.printf("          %s �д缭����\n", k37_Date);
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.println("�ɹ��� �� �����̼� ���� ���� : 1599-2211");
		System.out.println("                    �� �� ��");
		System.out.println("                2112820610158231");

		k37_Line();

		System.out.println("  �� ���̼� �ɹ��� �� �Ǵ� Ȩ�������� �����ϼż�");
		System.out.println("    ȸ������ �� �پ��� ������ ����������! ��");

	}

	public static void k37_doubleLine() {
		System.out.println("==================================================");
	}

	public static void k37_Line() {
		System.out.println("--------------------------------------------------");
	}

	public static String k37_dateTime() {
		Date nowDate = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		String k37_date = simpleDateFormat.format(nowDate);

		return k37_date;
	}

	public static String k37_dateTime(int k37_datedif) {
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM��dd��");

		cal.add(Calendar.DATE, k37_datedif);

		String k37_refundDate = simpleDateFormat2.format(cal.getTime());

		return k37_refundDate;
	}

	public static String k37_intTOString(int k37_i) {
		String k37_intToStr = Integer.toString(k37_i);

		return k37_intToStr;
	}

	public static String subStrByte(String str, int cutlen) {
		if (!str.isEmpty()) {
			str = str.trim();
			if (str.getBytes().length <= cutlen) {
				return str;
			} else {
				StringBuffer sbStr = new StringBuffer(cutlen);
				int nCnt = 0;
				for (char ch : str.toCharArray()) {
					nCnt += String.valueOf(ch).getBytes().length;
					if (nCnt > cutlen)
						break;
					sbStr.append(ch);
				}
				return sbStr.toString() + " ";
			}
		} else {
			return "";
		}
	}
}
