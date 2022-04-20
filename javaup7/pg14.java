package javajump7;

public class pg14 {

	public static void main(String[] args) {
		// pg14 �����ڵ� �ʵ� ���� ó�� 2
		String [] OneRec = {
				"����,`04 �ݾ�,`05 �ݾ�,`06 �ݾ�,`07 �ݾ�,`08 �ݾ�,`09 �ݾ�,`10 �ݾ�,`11 �ݾ�,`12 �ݾ�,`13 �ݾ�,`14 �ݾ�,`15 �ݾ�,`16 �ݾ�,`17 �ݾ�,`18 �ݾ�,`19 �ݾ�,`20 1Q �ݾ�",
				"ICT ����,56,310,328,751,689,974,1580,1240,1644,2285,1462,1009,712,964,1160,1092,327",
				"ICT ����,15,61,220,344,262,505,958,698,915,1171,1534,3668,3109,3568,5174,8094,1385",
				"����/���/���,45,94,293,1038,551,1536,1977,2752,1753,1633,1113,1364,1641,1403,2011,1660,250",
				"ȭ��/����,4,12,66,390,716,751,840,727,1286,475,656,1194,1261,811,1059,906,292",
				"���̿�/�Ƿ�,0,0,168,239,308,552,899,858,760,1191,2584,3004,3686,3240,5771,7677,1879",
				"����/����/����,0,272,234,467,867,1073,1527,2207,2364,2345,2309,2383,2230,2159,2236,2522,300",
				"����,0,15,117,488,229,561,647,1024,756,899,1331,1514,1165,1149,1201,891,193",
				"����/����,0,23,86,557,401,723,539,632,690,652,1770,2426,2183,3553,3998,5495,879",
				"��Ÿ,0,37,47,416,193,344,571,470,311,379,539,1479,1448,1089,1779,2543,400",
				"�հ�,120,824,1559,4690,4216,7019,9538,10608,10479,11030,13298,18041,17435,17936,24389,30880,5905"

		};

		String[] field_name = OneRec[0].split(",");
		for (int i = 1; i < OneRec.length; i++) {
			
			String[] field = OneRec[i].split(",");
			System.out.println("*********************");
			System.out.printf(" %s : %s\n", field_name[0], 	field[0]);	
			
			for (int j = 3; j < field_name.length; j++) {

				System.out.printf(" %s : %s\n", field_name[j], 	k37_numberRead(field[j]));
			}
			
			System.out.println("*********************");
		}
		
	}
	
	public static String k37_numberRead (String k37_text) {
		String[] k37_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭 units ���� �� �ʱ�ȭ
		String[] k37_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // ���ڿ� �迭 unitX ���� �� �ʱ�ȭ
		String k37_sNumVoice = "";
		int k37_i = 0; // ���� i�� 0���� �ʱ�ȭ
		int k37_j = k37_text.length() - 1; // ���� j�� sNumVal�� ���� - 1�� �ʱ�ȭ > �迭�� 0��°���� �����ϱ� ����
		
		while (true) { // ���� �ݺ���
			if (k37_i >= k37_text.length()) // ���� i�� sNumVal.length()���� ���ų� Ŭ ��
				break; // �ݺ����� �ߴ��ϰ� �������� �Ѿ��
			
			if (k37_text.substring(k37_i, k37_i + 1).equals("0")) { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �� (if��) (.equals > ���ڿ� ���� �� �� Ȯ�ν� ���)
				if (k37_text.length() <= 8) {
					k37_sNumVoice = k37_sNumVoice // sNumVoice�� sNumVoice +
							+ k37_units[Integer.parseInt(k37_text.substring(k37_i, k37_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
							+ k37_unitX[k37_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
				} else {
					if (k37_text.substring(k37_text.length() - 8, k37_text.length() - 4).equals("0000")
							&& k37_unitX[k37_j].equals("��")) {
						// sNumVal�� ����-8 ���� sNumVal�� ����-4������ sNumVal���� �ڸ��� �װ��� 0000�̰� �迭 unitX[j] �� "��"�̸� �ƹ� �͵� ���� �ʴ´�.
					} else if (k37_unitX[k37_j].equals("��") || k37_unitX[k37_j].equals("��")) { // ���� ������ false�̰� unitX[j]�� "��" �Ǵ� "��"�̸� (||�� �Ǵ� �ǹ�)
						k37_sNumVoice = k37_sNumVoice + "" + k37_unitX[k37_j]; // sNumVoice�� sNumVoice + "" + unitX[j]�� ����
					}
				}

			} else { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �ƴϸ�
				k37_sNumVoice = k37_sNumVoice // sNumVoice�� sNumVoice +
						+ k37_units[Integer.parseInt(k37_text.substring(k37_i, k37_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
						+ k37_unitX[k37_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
			}
			k37_i++; // ���� i�� 1��ŭ ����
			k37_j--; // ���� j�� 1��ŭ ����

		}
		
		
		return k37_sNumVoice;
	}
	
	
}