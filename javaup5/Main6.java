package javajump5;

import java.lang.Character.UnicodeBlock;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k33_df = new DecimalFormat("#,###,###");
		Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
		SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat k33_sdtB = new SimpleDateFormat("YYYYMMdd");

		String[] k33_itemNames = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ��10������", "��������E", "���� ���Ϸ� �� �� ����", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ�� 120g*5", "(��)������������", "���ѱ� �������156g*5��", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư��", "������ݺ�����ġ��ȹ" };
		int[] k33_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };
		int[] k33_amount = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };
		boolean[] k33_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false };
		double k33_taxRate = 0.1;	// �ΰ�����
		int k33_totalSum = 0; 		// k33_price(�ܰ�) * k33_amount(����) ��
		int k33_totalTaxFreePrice = 0; // �鼼 ��ǰ �հ�
		int k33_totalNetPrice = 0; 		// ������ǰ �հ� = ������ǰ + �ΰ���
		int k33_NetPrice = 0; 	// ������ǰ
		int k33_tax = 0; 		// �ΰ���
		int k33_totalPrice = 0; // ���� �ݾ�

		System.out.printf("%35s\n", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%30s\n", "206-86-50913 ����");
		System.out.printf("%29s\n", "���� ������ ������� 552");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("%s%s%18s\n", "[�� ��]", k33_sdtA.format(k33_calt.getTime()), "POS:0011-9861");	// ����ð� ���
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("   %5s %14s %3s %4s\n", "�� ǰ ��", "�� ��", "����", "�� ��");
		System.out.printf("%s\n", "-----------------------------------------");

		for (int k33_i = 0; k33_i < k33_itemNames.length; k33_i++) { //
			int k33_sum = k33_price[k33_i] * k33_amount[k33_i]; // 
																// 
			k33_totalSum = k33_totalSum + k33_sum; // k33_totalSum�� k33_totalSum�� k33_sum�� ���� ���� �����Ѵ�.

			if (k33_taxfree[k33_i] == true) {
				k33_totalTaxFreePrice = k33_totalTaxFreePrice + k33_sum;
				System.out.print("* ");
			} else {
				System.out.print("  ");
				k33_totalNetPrice = k33_totalNetPrice + k33_sum;
			}

			String k33_itemName = k33_itemNames[k33_i];
			String k33_blank = "";
			int k33_itemNameLength = k33_itemName.getBytes().length;

			if (k33_itemNameLength > 20) {
				byte[] b = k33_itemName.getBytes();
				char ch = k33_itemName.charAt(11);
				Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(ch);
				if (UnicodeBlock.HANGUL_SYLLABLES.equals(unicodeBlock)
						|| UnicodeBlock.HANGUL_COMPATIBILITY_JAMO.equals(unicodeBlock)
						|| UnicodeBlock.HANGUL_JAMO.equals(unicodeBlock)) {
					k33_itemName = new String(b, 0, 20);
				} else {
					k33_itemName = new String(b, 0, 19);
				}
			}
			k33_itemNameLength = k33_itemName.getBytes().length;
			for (int i = 0; i < 20 - (int) k33_itemNameLength; i++) {
				k33_blank = k33_blank + " ";
			}

			System.out.printf("%s%s%8s%3d%8s\n", k33_itemName, k33_blank, k33_df.format(k33_price[k33_i]), k33_amount[k33_i], k33_df.format(k33_sum));
			if ((k33_i + 1) % 5 == 0) {
				System.out.printf("%s\n", "-----------------------------------------");
			}
		}

		k33_totalPrice = k33_totalNetPrice + k33_totalTaxFreePrice;
		k33_NetPrice = (int) (k33_totalNetPrice / (1 + k33_taxRate));
		k33_tax = k33_totalNetPrice - k33_NetPrice; // �ΰ���

		System.out.printf("\n%22s %13d\n", "�� ǰ�� ����", k33_itemNames.length);
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k33_df.format(k33_totalTaxFreePrice));
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k33_df.format(k33_NetPrice));
		System.out.printf("%24s%14s\n", "��   ��   ��", k33_df.format(k33_tax));
		System.out.printf("%25s%14s\n", "��        ��", k33_df.format(k33_totalPrice));
		System.out.printf("%s %23s\n", "�� �� �� �� �� ��", k33_df.format(k33_totalPrice));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s%19s%s\n", "ī�����(IC)", "�Ͻú�/ ", k33_df.format(k33_totalPrice));
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%25s\n", "[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%s%20s%7s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164");
		System.out.printf("%s%25s\n", "����(����)����Ʈ", "5,637(  5,473)");
		System.out.printf("%s\n", "*�ż��� ����Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%21s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s%29s\n", "������ȣ : ", "34�� ****");
		System.out.printf("%s%30s\n", "�����ð� : ", "2022-04-18 12:20:04");
		System.out.printf("%s\n", "-----------------------------------------");
		System.out.printf("%s%25s\n", "ĳ��:084599 ��00", "1150");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%39s\n", "||||||||||||||||||||||||||||||||||");
		System.out.printf("%15s%s\n", k33_sdtB.format(k33_calt.getTime()), "/00119861/00164980/31");
	}
}
