package javajump7;

public class pg14_test {
// �����б� ��� / 20220415 / k32_������ / �ּ����� k32_����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2000000000 2030200000 1001034567
		int k32_iNumVal = 310; // ������ ���� iNumVal�� 1001034567�� ����

		String k32_sNumVal = String.valueOf(k32_iNumVal); // ���ڿ� sNumVal�� iNumVal�� ���ڿ��� ����� ����
															// String.valueOf() : String ���·� �������

		String k32_sNumVoice = ""; // ���ڿ� sNumVoice�� ""�� ����

		System.out.printf("==> %s [%d�ڸ�]\n", k32_sNumVal, k32_sNumVal.length()); // .length() : ���ڿ� ����

		int k32_i, k32_j; // ������ ���� i�� j����

		String[] k32_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭 units ���� �� �ʱ�ȭ
		String[] k32_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // ���ڿ� �迭 unitX ���� �� �ʱ�ȭ

		k32_i = 0; // ���� i�� 0���� �ʱ�ȭ
		k32_j = k32_sNumVal.length() - 1; // ���� j�� sNumVal�� ���� - 1�� �ʱ�ȭ > �迭�� 0��°���� �����ϱ� ����

		while (true) { // ���� �ݺ���
			if (k32_i >= k32_sNumVal.length()) // ���� i�� sNumVal.length()���� ���ų� Ŭ ��
				break; // �ݺ����� �ߴ��ϰ� �������� �Ѿ��
			// ���� i�� sNumVal.length()���� ���� ��
			// sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��) String �迭 units�� ��ġ�� �ִ� ���ڸ� ���

			if (k32_sNumVal.substring(k32_i, k32_i + 1).equals("0")) { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �� (if��) (.equals > ���ڿ� ���� �� �� Ȯ�ν� ���)
				if (k32_sNumVal.length() <= 8) {
					k32_sNumVoice = k32_sNumVoice // sNumVoice�� sNumVoice +
							+ k32_units[Integer.parseInt(k32_sNumVal.substring(k32_i, k32_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
							+ k32_unitX[k32_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
				} else {
					if (k32_sNumVal.substring(k32_sNumVal.length() - 8, k32_sNumVal.length() - 4).equals("0000")
							&& k32_unitX[k32_j].equals("��")) {
						// sNumVal�� ����-8 ���� sNumVal�� ����-4������ sNumVal���� �ڸ��� �װ��� 0000�̰� �迭 unitX[j] �� "��"�̸� �ƹ� �͵� ���� �ʴ´�.
					} else if (k32_unitX[k32_j].equals("��") || k32_unitX[k32_j].equals("��")) { // ���� ������ false�̰� unitX[j]�� "��" �Ǵ� "��"�̸� (||�� �Ǵ� �ǹ�)
						k32_sNumVoice = k32_sNumVoice + "" + k32_unitX[k32_j]; // sNumVoice�� sNumVoice + "" + unitX[j]�� ����
					}
				}
			} else { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �ƴϸ�
				k32_sNumVoice = k32_sNumVoice // sNumVoice�� sNumVoice +
						+ k32_units[Integer.parseInt(k32_sNumVal.substring(k32_i, k32_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
						+ k32_unitX[k32_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
			}
			k32_i++; // ���� i�� 1��ŭ ����
			k32_j--; // ���� j�� 1��ŭ ����

		}
		System.out.printf("\n %s[%s]\n", k32_sNumVal, k32_sNumVoice); // sNumVal, sNumVoice�� ����� ���
	}

}