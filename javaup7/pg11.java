package javajump7;

import java.text.DecimalFormat;

public class pg11 {

	public static void main(String[] args) {
		// 11pg �������̿��� �ʵ� ����, 5�� ������ �ǽ�
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		
		String [] OneRec = {
				"01  ����Ȩ SAFE365 10,000,000  1 10,000,000",
				"02  (G)LH��������ȭ     6,900 11     75,900",
				"03  ��������E           5,980  1      5,980",
				"04  ���� ���Ϸ�       3,300  1      3,000",
				"05  ����Ȩ SAFE ��      5,500  2     11,000",
				"06  ��� �Ŷ��120g     3,360  1      3,360",
				"07* (��)��������      6,610  1      6,010",
				"08  ���ѱ� �������     2,750  1      2,750",
				"09* GAP ������ 4-    10,800  1     10,800",
				"10  ����ũ ź�θ�       2,480  1      2,480",
				"11  (����)����߰�      7,920  1      7,920",
				"12 DZ�ִϾ�縻3��      4,980  1      4,980",
				"13  DZ�ִϾ�縻3��     4,980  1      4,980",
				"14  �����̾�������      7,130  1      7,130",
				"15  ����ũ ����̿�     3,980  1      3,980",
				"16* ���� ���ִ¿���     4,480  1      4,480",
				"17  ���������÷�1     4,980  1      4,980",
				"18  ��������(��)6     3,210  1      3,210",
				"19  �ɶ�ý� ����       6,950  1      6,950",
				"20  Ǫ���� �̼�����     2,980  2      6,960",
				"21  ���Ϸν�������      1,990  1      1,990",
				"22  CJ ����Ĩ 20G     1,980  1      1,980",
				"23  ����ũ ����̿�     3,980  1      3,980",
				"24  ����� ���� ��      4,480  1      4,480",
				"25* ������������9     4,380  2      8,760",
				"26  Ʈ���ǽ�Ʈ ����     8,980  1      8,980",
				"27  ������ġ���ڱ�1     5,980  1      5,980",
				"28  ���ѱ� ����Űģ     5,980  1      5,980",
				"29  ġŲ����ī�� 20    2,6080  1      2,800"				
		};
		// ���ڿ� �迭�� ���̸�ŭ ���� �迭 �ۼ�, �迭�� ��� ���ڿ��� �湮�Ѵ�.
		for (int i = 0; i < OneRec.length; i++) {
			int countKorean = OneRec[i].getBytes().length - OneRec[i].length();	//�迭���� �޾ƿ� String���� �ѱ��� ������ �����Ѵ�.
			// ���ڿ����� ����, ����, �հ踦 �����ؼ� ���� * ���� != �հ� ���  ������ �����Ѵ�.
			if ( Integer.parseInt(k37_firstPrice(OneRec[i],countKorean)) *  Integer.parseInt(k37_productNumber(OneRec[i],countKorean)) != 
					Integer.parseInt(k37_lastPrice(OneRec[i],countKorean))) {
			
				System.out.println("**********************************************************");
				System.out.printf("����[%s]\n",OneRec[i]);	//�켱 ���� ���ڿ��� ����Ѵ�.
				// string.replace(�հ�, ����*����) �� ������
				// �հ�� ���� ������ �κ��� substring���� �ڸ��� trim�� ����Ͽ� ������ �����Ѵ�. �׷��� 10,000,000 / 75,900 ... �̷������� �߸���.
				// int ������ �ٲ� ���ݰ� ������ ���ѵ� DeciamlFormat���� 3�ڸ����� �޸� ���� String ������ �ٲ㼭 replace�� �ִ´�. 
				String k37_modified = OneRec[i].replace(OneRec[i].substring(OneRec[i].length() - OneRec[i].substring(32 - countKorean).trim().length()),
						k37_df.format(Integer.parseInt(k37_firstPrice(OneRec[i],countKorean)) * Integer.parseInt(k37_productNumber(OneRec[i],countKorean))));
				// ������ ��Ʈ�� ���
				System.out.printf("����[%s]\n",k37_modified);
				
				System.out.println("**********************************************************");
			}
		}
	}
	
	// ù��° ������ �����Ѵ�. string ������ ����
	public static String k37_firstPrice(String k37_price, int k37_kNum) {
		// ������ ���� 19 ~ 30 (�ѱ۷� ���� 1�� 2�� ������ �κ��� �����ϱ� ����, - �ѱۼ��� �Ѵ�), ���� �޸� ����(replace), ���� ����(trim)
		String k37_onlynumber = k37_price.substring(19 - k37_kNum, 30 - k37_kNum).replace(",","").trim();
		return k37_onlynumber;	//�� ����
	}
	// ������ ���� 30 ~ 32 (�ѱ۷� ���� 1�� 2�� ������ �κ��� �����ϱ� ����, - �ѱۼ��� �Ѵ�), ���� ���� ����(trim)
	public static String k37_productNumber(String k37_price, int k37_kNum) {
		String k37_onlynumber = k37_price.substring(30 - k37_kNum, 32 - k37_kNum).trim();
		return k37_onlynumber;
	}
	// ������ ���� 32 ���� (�ѱ۷� ���� 1�� 2�� ������ �κ��� �����ϱ� ����, - �ѱۼ��� �Ѵ�), ���� �޸� ����(replace), ���� ����(trim)
	public static String k37_lastPrice(String k37_price, int k37_kNum) {
		String k37_onlynumber = k37_price.substring(32 - k37_kNum).replace(",","").trim();
		return k37_onlynumber;
	}

}


