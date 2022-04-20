package javajump6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class pt3 {
	static String[] k37_itemName = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 100cm", "��������E", "���� ���Ϸ� �� �ѷ�", "����Ȩ SAFE �ڵ����",
			"��� �Ŷ��120g*5", "(��)������������", "���ѱ� ������� 156g*4", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
			"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��D_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
			"���������÷�10��", "��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿���500",
			"����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "[Ʈ����]����300ml", "��� �𷰽� ��ī���� AAA 24��", "�ĸӽ��� �� ���� (2kg/�ڽ�)",
			"[���̿��ۺ�]����� 50��", "[�õ�][�±�]��귣�� �õ� ����� (31-40) (450g)" };
	static int[] k37_price = { 1500000, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 248000, 7920, 4980, 4980,
			7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 9480, 7980, 850, 15200, 10980, 98000,
			12800 }; // ������ ������ �迭�� ���� �� �ʱ�ȭ
	static int[] k37_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 500, 1,
			1, 100, 1 }; // ������ ������ �迭�� ���� �� �ʱ�ȭ
	static boolean[] k37_taxFree = { false, false, false, false, false, false, true, false, true, true, false, false,
			false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
			false, false, true, false, true }; // ����� ���θ� ���� �ڷ����� boolean�� �迭�� ���� �� �ʱ�ȭ
	static int k37_taxFreeTotal = 0, k37_totalSum = 0, k37_netPrice, k37_taxPrice; // ������ ���� �鼼��ǰ �հ�, ������ǰ �հ�, �� �հ踦 ����
																					// �� 0���� �ʱ�ȭ
	static double k37_taxRate = 0.1; // �Ǽ��� ���� ������ ���� �� 0.1�� �ʱ�ȭ (10%) // �������� �� ������ ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k37_itemCount = k37_itemName.length;
		k37_TitlePrint();
		k37_TimeStamp();
		k37_HeaderPrint();

		for (int k37_i = 0; k37_i < k37_itemCount; k37_i++) {
			k37_itemPrint(k37_i);
		}
		k37_totalPrint();
	}

	public static void k37_TitlePrint() {
		System.out.println("           �̸�Ʈ ������ (031)888-1234");
		System.out.println("   emart   206-86-50913 ����");
		System.out.println("           ���� ������ ������� 552");
		System.out.println();
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();
	}

	public static void k37_TimeStamp() {
		Calendar k37_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� ������
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // SimpleDateFormat Ŭ������ ��� ���� ����
		System.out.printf("[����]%9s      POS:0011-9861\n", k37_sdt.format(k37_calt.getTime()));
	}

	public static void k37_HeaderPrint() {
		System.out.println("-----------------------------------------");
		System.out.printf("%7s%14s%5s%5s\n", "�� ǰ ��", "�� ��", "����", "�� ��");
		System.out.println("-----------------------------------------");
	}

	public static String k37_subStrByte(String k37_str, int k37_cutlength) { // ����Ʈ ������ �ڸ��� �Լ��� ����(�Ű�����2>���ڿ� ����(������
																				// ���ڿ�), ������ ����(����Ʈ ũ��)
		StringBuffer k37_subStr = new StringBuffer(k37_cutlength); // StringBuffer ���� (���ڿ��� �߰��ϰų� ������ �� �ַ� ����ϴ� �ڷ���)
		for (int k37_i = k37_cutlength - k37_str.getBytes().length; k37_i <= k37_cutlength; k37_i++) { // ������ ���� i�� cutlength -str.getBytes().length����cutlength����
			k37_str = k37_str + " "; // ���� ĭ��ŭ blank �߰� // 1�� �����ϸ� �ݺ�(for��)
		}

		int k37_nCount = 0; // ������ ���� nCount ���� �� 0���� �ʱ�ȭ
		for (char k37_ch : k37_str.toCharArray()) { // ���ڿ� str�� char�� �迭�� �ٲ㼭 �ϳ��� �߰�(for��)
			k37_nCount += String.valueOf(k37_ch).getBytes().length; // nCount�� ch�� ���ڿ��� �ٲ� �� ����Ʈ�� ũ�⸦ ���� > �������� ����
			if (k37_nCount > k37_cutlength) // nCount�� cutlength���� ũ��
				break; // �׸��Ѵ� (����)
			k37_subStr.append(k37_ch); // ũ�� ������ subStr�� ch�� �߰��Ѵ�(add)

		}
		if (k37_subStr.toString().getBytes().length == (k37_cutlength - 1)) { // subStr�� ����Ʈ ũ�Ⱑ �ڸ� ũ�� ���� 1 ���� ��
			k37_subStr.append(" "); // blank�� �߰��Ѵ�
		}
		return k37_subStr.toString(); // ���ϰ� : subStr (���ڿ��� �� ��
	}

	public static void k37_itemPrint(int k37_i) {
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat Ŭ���� ��������, ���� �����ϱ�
			if (k37_taxFree[k37_i] == true) { // ����� ���ΰ� true ���
				System.out.printf("%-2s", "*"); // �׸� �տ� * ���
			} else { // false���
				System.out.printf("%-2s", " "); // ��ĭ
			}
			System.out.printf("%s%10s%4d%10s\n", k37_subStrByte(k37_itemName[k37_i], 15),
					// ��ǰ���� �Լ��� ����� 15����Ʈ�� �ڸ���, �ܰ�, ����, �ݾ��� ���Ŀ� �°� ���
					k37_df.format(k37_price[k37_i]), k37_num[k37_i], k37_df.format(k37_price[k37_i] * k37_num[k37_i]));

			if ((k37_i + 1) % 5 == 0) { // ������ ���� i+1�� 5�� ���� �������� 0�̶�� (5�� ����)
				System.out.println("-----------------------------------------"); // ���м� ���
			}
	}

	public static int k37_netPrice(int k37_totalSum, int k37_taxFreeTotal, double k37_taxRate) { // ���� ������ ���ϴ� �Լ� ����(�Ű����� 3�� > ������
		// �� �հ� �� �鼼��ǰ ����, �Ǽ��� ����)
		return (int) ((k37_totalSum - k37_taxFreeTotal) / (1 + k37_taxRate)); // ���ϰ� : (����-�鼼��ǰ ����) / (1+����) > ������ ������ �ø�
	}

	public static String k37_parkingTime() { // ���� �ð��� ���ϴ� �Լ��� ���� (���Ƿ� 1�ð� ������ ���Ѵ�)
		Calendar k37_cal = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� ������
		k37_cal.setTime(new Date()); // ���� �ð� setTime �������� ����
		SimpleDateFormat k37_df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // SimpleDateFormat Ŭ������ ��� ���� ����
		k37_cal.add(Calendar.HOUR, -1); // ����ð����� 1�ð��� ����
		String k37_parkingTime = k37_df.format(k37_cal.getTime()); // 1�ð��� �� �ð��� ���ڿ��� ���� �� �ʱ�ȭ
		return k37_parkingTime; // ���ϰ� : parkingTime
	}

	public static int k37_thisPoint(int k37_totalSum) {
		return (int) (k37_totalSum * 0.001);
	}

	public static int k37_totalPoint(int k37_totalSum) {
		return (int) (k37_totalSum * 0.001) + 5473;
	}

	public static void k37_totalPrint() {
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat Ŭ���� ��������, ���� �����ϱ�
		for (int k37_i = 0; k37_i < k37_itemName.length; k37_i++) { // ������ ���� i�� 0���� ��ǰ�� ����-1 ��ŭ 1�� �����ϸ� �ݺ� (for��)
			if (k37_taxFree[k37_i] == true) { // ����� ���ΰ� true ���
				k37_taxFreeTotal += k37_price[k37_i] * k37_num[k37_i]; // ����� ��ǰ���� �հ�
			}
		}

		for (int k37_i = 0; k37_i < k37_itemName.length; k37_i++) { // ������ ���� i�� 0���� ��ǰ�� ����-1 ��ŭ 1�� �����ϸ� �ݺ� (for��)
			k37_totalSum += k37_price[k37_i] * k37_num[k37_i]; // �� �հ�
		}

		k37_netPrice = k37_netPrice(k37_totalSum, k37_taxFreeTotal, k37_taxRate); // �Һ��� ������ �Լ��� ����� ���Ѵ�.
		k37_taxPrice = k37_totalSum - k37_netPrice - k37_taxFreeTotal; // ������ �� �հ迡�� �Һ��ڰ��ݰ� �鼼 ��ǰ�� ������ �� ��

		System.out.println();
		System.out.printf("               �� ǰ�� ����  %12s\n", k37_itemName.length); // ������ ���¿� �°� ���
		System.out.printf("            (*)�� ��  �� ǰ  %12s\n", k37_df.format(k37_taxFreeTotal)); // �鼼 ��ǰ�� ������ ���¿� �°� ���
		System.out.printf("               �� ��  �� ǰ  %12s\n", k37_df.format(k37_netPrice)); // ���� ��ǰ�� ������ ���¿� �°� ���
		System.out.printf("               ��   ��   ��  %12s\n", k37_df.format(k37_taxPrice)); // ������ ���¿� �°� ���
		System.out.printf("               ��        ��  %12s\n", k37_df.format(k37_totalSum)); // �� �հ踦 ���¿� �°� ���
		System.out.printf("�� �� �� �� �� ��            %12s\n", k37_df.format(k37_totalSum)); // �� �հ踦 ���¿� �°� ���
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB �ϳ�       541707**0484/35860658");
		System.out.printf("ī�����(IC)          �Ͻú� / %10s\n", k37_df.format(k37_totalSum)); // �� �հ踦 ���¿� �°� ���
		System.out.println("-----------------------------------------");
		System.out.println("             [�ż�������Ʈ ����]");
		System.out.println("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("��ȸ�߻�����Ʈ     %12s%10s\n", "9350**9995", k37_df.format(k37_thisPoint(k37_totalSum)));
		System.out.printf("����(����)����Ʈ      %8s%s\n", k37_df.format(k37_totalPoint(k37_totalSum)), "(    5,473)");
		System.out.println("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("-----------------------------------------");
		System.out.println("    ���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("������ȣ                %16s\n", "32��****");
		System.out.printf("�����ð�              %5s\n", k37_parkingTime()); // ���� �ð��� ���ϴ� �Լ��� ���� �ð��� ���� ���
		System.out.println("-----------------------------------------");
		System.out.printf("ĳ��:084599 ��00         %16d\n", 1150);
		System.out.println("     ||||||||||||||||||||||||||||||||||");
		System.out.println("     ||||||||||||||||||||||||||||||||||");
		System.out.println("        20220419/00119861/00164980/31");

	}
}
