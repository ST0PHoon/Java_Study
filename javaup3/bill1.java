package bills;

//java �����Լ��� �������� import ����
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class bill1 {

	public static void main(String[] args) {
		// �ܼ�ȯ����� 18pg
		int k37_myWon = 1000000; // k37_myWon ������ ���� ���� �� 100���� ȯ��
		double k37_moneyEx = 1238.21; // k37_moneyEx �Ǽ��� ���� ���� ȯ�� 1238.21
		double k37_commission = 0.003; // k37_commission �Ǽ��� ���� ���� ȯ�������� 0.3�ۼ�Ʈ

		int k37_usd = (int) (k37_myWon / k37_moneyEx); // ������ ���� ����, 100���� ȯ���� ���� �ݾ� ��� (����)
		int k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx); // ������ ���� ����, ȯ�� �� �ܵ� ���

		System.out.printf("*************************************************\n");
		System.out.printf("*                ������ ���� ���               *\n");
		// ���˿� ���缭 ���� ȯ���ݾ�, �޷�, �Ž����� ���
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => %d�޷�, �ܵ�: %d\n", k37_myWon, k37_usd, k37_remain);

		System.out.printf("*************************************************\n");

		// ������ ���� ȯ�� ���(1) 19pg
		double k37_comPerOne = k37_moneyEx * k37_commission; // �޷��� ������, �Ǽ����̱� ������ �Ҽ��� �Ʒ����� ���´�.

		double k37_totalCom = k37_usd * k37_comPerOne; // �� ������ ���, �Ǽ����̱� ������ �Ҽ��� �Ʒ����� ���´�.

		System.out.printf("*********************************************************************\n");
		System.out.printf("*                            ������ ���                            *\n");
		// ���˿� ���缭 �� ������, �޷�, �޷��� ������ ���, %d�� ������, %f�� �Ǽ���
		System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k37_totalCom, k37_usd, k37_comPerOne);

		System.out.printf("*********************************************************************\n");

		// ������ ���� ȯ�� ���(2) 20pg
		int k37_i_totalCom; // ������ ���� ����
		
		// �������� �Ǽ����� ���������� �ø�ó���ϴ� if�� �ۼ�
		if (k37_totalCom != (double) ((int) k37_totalCom)) {
			k37_i_totalCom = (int) k37_totalCom + 1;
		} else {
			k37_i_totalCom = (int) k37_totalCom;
		}

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                  ������ ����ȯ��                              *\n");
		// ���˿� ���缭 �� ������, �޷�, �޷��� ������ ���
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k37_i_totalCom, k37_usd, k37_comPerOne);

		k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx - k37_i_totalCom);	//�ܵ� ��� k37_remain�� �Է�
		// ���˿� ���缭 �� ��ȭȯ���ݾ�, �޷�, ������¡��, �ܵ� ���
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��: %d��,  �ܵ�: %d��\n", k37_myWon, k37_usd, k37_i_totalCom,
				k37_remain);

		System.out.printf("*********************************************************************************\n");

		// ������ ���� ȯ�� ��� (3) 21pg
		// ������ ���� ����, 100���� ȯ���� ���� �ݾ� ���, �޷��� ������ ������ ����̴�.(����)
		k37_usd = (int) (k37_myWon / (k37_moneyEx + k37_comPerOne)); 
		k37_totalCom = k37_usd * k37_comPerOne;  // �� ������ ���
		
		// �������� �Ǽ����� ���������� �ø�ó���ϴ� if�� �ۼ�
		if (k37_totalCom != (double) ((int) k37_totalCom)) {
			k37_i_totalCom = (int) k37_totalCom + 1;
		} else {
			k37_i_totalCom = (int) k37_totalCom;
		}

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                            (��Ȯ)������ ����ȯ��                              *\n");
		// ���˿� ���缭 �� ������, �޷�, �޷��� ������ ���
		System.out.printf("�� ������: %d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k37_i_totalCom, k37_usd, k37_comPerOne);

		k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx - k37_i_totalCom);	//�ܵ� ��� k37_remain�� �Է�
		// ���˿� ���缭 �� ��ȭȯ���ݾ�, �޷�, ������¡��, �ܵ� ���
		System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��: %d��,  �ܵ�: %d��\n", k37_myWon, k37_usd, k37_i_totalCom,
				k37_remain);

		System.out.printf("*********************************************************************************\n");

		
		
		
		// �޸���� 22pg
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###");	//DeciamlFormat�� ���� Ʋ��� ���� �����ص� ��Ŀ� �°� ����ϴ� Ʋ �ۼ�

		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                              �޸����, ��¥ ����                              *\n");
		// ���˿� ���缭 �� ������, �޷�, �޷��� ������ ���, DeciamlFormat�� ���缭 �� ���
		System.out.printf("�� ������: %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n", k37_df.format(k37_i_totalCom), k37_df.format(k37_usd),
				k37_comPerOne);

		k37_remain = (int) (k37_myWon - k37_usd * k37_moneyEx - k37_i_totalCom);	//�ܵ� ��� k37_remain�� �Է�
		// ���˿� ���缭 �� ��ȭȯ���ݾ�, �޷�, ������¡��, �ܵ� ���
		System.out.printf("�� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷�, ������¡��: %s��, �ܵ�: %s��\n", k37_df.format(k37_myWon), k37_df.format(k37_usd),
				k37_df.format(k37_i_totalCom), k37_df.format(k37_remain));
		
		Calendar k37_calt = Calendar.getInstance();	// ����Ǿ��ִ� Calendar�� ����ؼ� ����ð�, ��¥ �ҷ�����
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //SimpleDateFormat�� ���� 4�ڸ� ����/2�ڸ� ��/ 2�ڸ� ��  �ð�:��:�� ���·� ��¥ ������ ���Ʋ �����
		System.out.printf("��������ð�: %s\n", k37_sdt.format(k37_calt.getTime()));	//�޾ƿ� �ð������͸� SimpleDateFormat���� ���� ���信 �°� ����ϱ�
		
		System.out.printf("*********************************************************************************\n");
	}

}
